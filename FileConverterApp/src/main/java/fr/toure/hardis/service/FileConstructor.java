package fr.toure.hardis.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import fr.toure.hardis.model.ErrorFile;
import fr.toure.hardis.model.Reference;
import fr.toure.hardis.model.file.TheFile;
import fr.toure.hardis.utils.Util;

public class FileConstructor {

	/**
	 * Creation du fichier de sortie à partir des informations du fichier en entrée
	 * 
	 * @param inputFileLines la liste des lignes du fichier en entrée
	 * @param inputFile le nom du fichier en entrée
	 * @param outPutFile le nom du fichier en sortie
	 */
	public void createFile(List<String> inputFileLines, String inputFile, String outPutFile){
		TheFile theFile = new TheFile();

		List<Reference> listReferences = new ArrayList<>();
		List<ErrorFile> listErrors = new ArrayList<>();
		for (int i = 0 ; i < inputFileLines.size() ; i++) {
			Reference ref = manageLine(inputFileLines.get(i).split(";"));
			if(ref != null)
				listReferences.add(ref);
			else{
				listErrors.add(manageErrorLine(i+1, inputFileLines.get(i)));
			}
		}

		theFile.setInputFile(inputFile);
		theFile.setListReferences(listReferences);
		theFile.setListErrors(listErrors);

		writeToJSonFile(theFile, outPutFile);
	}

	/**
	 * Récupération des références d'une ligne du fichier
	 * 
	 * @param line la ligne du fichier à analyser
	 * @return return la référence correspondante à la ligne ou null s'il y a une erreur dans la ligne
	 */
	private Reference manageLine(String[] line){
		Reference reference = new Reference();

		String numReference = line[0];
		String color = line[1];
		// On vérifie si le numero est numerique et s'il est bien de 10 caracteres
		// On verifie si la couleur est connue
		// On verifie que le prix est un double et la taile un entier
		if(Util.checkNumReference(numReference) && Util.checkColor(color)){
			reference.setNumReference(line[0]);
			reference.setType(line[1]);
			try{
				reference.setPrice(Double.valueOf(line[2]));
				reference.setSize(Integer.valueOf(line[3]));
			} catch (NumberFormatException e){
				//TODO log dans le fichier de logs
				return null;
			}

			return reference;
		} else {
			return null;
		}	
	}

	/**
	 * Récupération des informations d'une ligne en erreur
	 * 
	 * @param line la ligne en erreur
	 * @param value les données de la ligne
	 * @return l'objet d'une ligne d'erreur
	 */
	private ErrorFile manageErrorLine(int line, String value){
		ErrorFile errorFile = new ErrorFile();

		errorFile.setLine(line);
		errorFile.setMessage(Util.INCORRECT_VALUE);
		errorFile.setValue(value);

		return errorFile;
	}

	/**
	 * Ecriture dans un fichier JSON
	 * 
	 * @param theFile l'objet à convertir en JSON
	 * @param outPutFile le fichier dans lequel écrire le JSON
	 */
	private void writeToJSonFile(TheFile theFile, String outPutFile){
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		try {
			ow.writeValue(new File(outPutFile + Util.JSON_EXTENSION), theFile);
		} catch (JsonProcessingException e) {
			//TODO Gestion de l'exception + log dans le fichier de logs
		} catch (IOException e) {
			//TODO Gestion de l'exception + log dans le fichier de logs
		}	
	}
}
