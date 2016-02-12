package com.piyushmittal.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name ="Product")
@XmlType(propOrder = {"price", "sku", "name "})
public class Product {

	private String name;
	private String sku;
	private long price;
	
	
	public Product(String name, String sku, long price) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
}
