package com;

import java.io.Serializable;

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1919611936090723085L;
	
	private String partNumber;
	private String name;
	private float price;
	
	
	public Product() {}
	public Product(String partNumber, String name, float price) {
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
	}
	
	// Getters and setters.:
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String toString() {
		return String.format("[Number:%s Name:%s $%f]", partNumber, name, price);
	}
	
	// Equals + Hashtag:
	@Override
	public boolean equals(Object o) {
		if (o instanceof Product) {
			return ((Product) o).name.equals(this.name) &&
				   ((Product) o).partNumber.equals(this.partNumber) &&
				   ((Product) o).price == this.price;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return partNumber.length();
	}
}
