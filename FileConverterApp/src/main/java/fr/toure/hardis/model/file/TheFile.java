package fr.toure.hardis.model.file;

import java.util.List;

import fr.toure.hardis.model.ErrorFile;
import fr.toure.hardis.model.Reference;

public class TheFile {
	private String inputFile;
	private List<Reference> references;
	private List<ErrorFile> errors;
	
	public String getInputFile() {
		return inputFile;
	}
	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}
	public List<Reference> getListReferences() {
		return references;
	}
	public void setListReferences(List<Reference> listReferences) {
		this.references = listReferences;
	}
	public List<ErrorFile> getListErrors() {
		return errors;
	}
	public void setListErrors(List<ErrorFile> listErrors) {
		this.errors = listErrors;
	}
}
