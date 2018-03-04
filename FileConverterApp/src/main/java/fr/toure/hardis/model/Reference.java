package fr.toure.hardis.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "references")
public class Reference{
	private String numReference;
	private int size;
	private double price;
	private String type;
	
	public String getNumReference() {
		return numReference;
	}
	@XmlAttribute
	public void setNumReference(String numReference) {
		this.numReference = numReference;
	}
	public int getSize() {
		return size;
	}
	@XmlAttribute
	public void setSize(int size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	@XmlAttribute
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	@XmlAttribute
	public void setType(String type) {
		this.type = type;
	}
}
