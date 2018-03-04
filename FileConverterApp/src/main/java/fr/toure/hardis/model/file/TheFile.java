package fr.toure.hardis.model.file;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.toure.hardis.model.ErrorFile;
import fr.toure.hardis.model.Reference;

@XmlRootElement(name = "report")
public class TheFile {
	private String inputFile;
	private List<Reference> references;
	private List<ErrorFile> errors;
	
	public String getInputFile() {
		return inputFile;
	}
	@XmlElement
	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}
	public List<Reference> getListReferences() {
		return references;
	}
	@XmlElement(name = "reference")
	public void setListReferences(List<Reference> listReferences) {
		this.references = listReferences;
	}
	public List<ErrorFile> getListErrors() {
		return errors;
	}
	@XmlElement(name = "error")
	public void setListErrors(List<ErrorFile> listErrors) {
		this.errors = listErrors;
	}
}
