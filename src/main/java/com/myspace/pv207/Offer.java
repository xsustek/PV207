package com.myspace.pv207;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Offer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("Location")
	private java.lang.String location;

	@org.kie.api.definition.type.Label(value = "Price")
	private java.lang.Integer price;

	public Offer() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getLocation() {
		return this.location;
	}

	public void setLocation(java.lang.String location) {
		this.location = location;
	}

	public java.lang.Integer getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Integer price) {
		this.price = price;
	}

	public Offer(java.lang.String name, java.lang.String location,
			java.lang.Integer price) {
		this.name = name;
		this.location = location;
		this.price = price;
	}

}