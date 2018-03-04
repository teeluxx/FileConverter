package fr.toure.hardis.model;

public class Reference{
	private String numReference;
	private int size;
	private double price;
	private String type;
	
	public String getNumReference() {
		return numReference;
	}
	public void setNumReference(String numReference) {
		this.numReference = numReference;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
