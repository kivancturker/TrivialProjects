package RentACar.entities.concretes;

import java.util.List;

import RentACar.entities.abstracts.Entity;

public class Brand implements Entity {
	private Integer Id;
    private String name;
    private List<Car> cars;

    public Brand(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
