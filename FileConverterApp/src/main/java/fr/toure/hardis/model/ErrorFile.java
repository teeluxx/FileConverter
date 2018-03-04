package fr.toure.hardis.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "error")
public class ErrorFile{
	private int line;
	private String message;
	private String value;
	
	public int getLine() {
		return line;
	}
	
	@XmlAttribute
	public void setLine(int line) {
		this.line = line;
	}
	public String getMessage() {
		return message;
	}
	
	@XmlAttribute
	public void setMessage(String message) {
		this.message = message;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
