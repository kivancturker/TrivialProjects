package RentACar.dataAccess.concretes;

import RentACar.dataAccess.abstracts.CarDao;
import RentACar.entities.concretes.Car;

public class CarOracleDao implements CarDao {

	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		System.out.println(car.getName()+ " is added to Oracle SQL");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		System.out.println(car.getName()+ " is deleted from Oracle SQL");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		System.out.println(car.getName()+ " is updated from Oracle SQL");
	}

}
