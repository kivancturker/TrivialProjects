package RentACar.bussiness.abstracts;

import RentACar.entities.concretes.Car;

public interface CarService {
	public void add (Car car);
	public void delete (Car car);
	public void update (Car car);
}
