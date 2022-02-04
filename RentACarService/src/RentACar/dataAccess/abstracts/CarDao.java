package RentACar.dataAccess.abstracts;

import RentACar.entities.concretes.Car;

public interface CarDao {
	public void add (Car car);
	public void delete (Car car);
	public void update (Car car);
}
