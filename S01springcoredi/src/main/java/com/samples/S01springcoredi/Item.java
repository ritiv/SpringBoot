package com.samples.S01springcoredi;

public class Item {
	
	private int Id;
	private String name;
	private double price;
	private double quantity;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [Id=" + Id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
