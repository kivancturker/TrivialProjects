package RentACar.entities.concretes;

import RentACar.entities.abstracts.Entity;

public class Car implements Entity {
	private int id;
	private Brand brand;
	private Color color;
	private String name;
	public Car() {
		super();
	}
	public Car(int id, Brand brand, Color color, String name) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
