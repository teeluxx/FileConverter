package fr.toure.hardis.front;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.toure.hardis.service.FileConstructor;

public class FileReader {
	/**
	 * Lecture des données en entrée du programme afin de générer le fichier de sortie
	 * @param inputFile le fichier à analyser
	 * @param fileType le type de fichier souhaité en sortie
	 * @param outPutFile le fichier en sortie
	 */
	private static void readFile(String inputFile, String fileType, String outPutFile){
		FileConstructor fileConstructor = new FileConstructor();
		List<String> inputFileLines = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(inputFile))) {
			inputFileLines = br.lines().collect(Collectors.toList());
			fileConstructor.createFile(inputFileLines, inputFile, outPutFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		File file = new File(args[0]);
		readFile(file.getName(), args[1], args[2]);
	}
}
