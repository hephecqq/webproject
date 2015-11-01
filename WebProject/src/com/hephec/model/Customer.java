package com.hephec.model;

public class Customer {
	private String name;
	private String address;
	private String cartType;
	private String card;
	public Customer(String name, String address, String cartType, String card) {
		super();
		this.name = name;
		this.address = address;
		this.cartType = cartType;
		this.card = card;
	}
	public Customer() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCartType() {
		return cartType;
	}
	public void setCartType(String cartType) {
		this.cartType = cartType;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
}
