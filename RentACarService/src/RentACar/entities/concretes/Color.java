package RentACar.entities.concretes;

import java.util.List;

import RentACar.entities.abstracts.Entity;

public class Color implements Entity {
	private Integer Id;
	private String name;
	private List<Car> cars;

	public Color(Integer id, String name) {
		Id = id;
		this.name = name;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
