package com.furnitureapp.model;

public class Furniture {
	
	private  String name;
	private  String color;
	private  String brand;
	private  String category;
	private  double price;
	private  String material;
	public Furniture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Furniture(String name, String color, String brand, String category, double price, String material) {
		super();
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.material = material;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Furniture [name=" + name + ", color=" + color + ", brand=" + brand + ", category=" + category
				+ ", price=" + price + ", material=" + material + "]";
	}
	
	


}
