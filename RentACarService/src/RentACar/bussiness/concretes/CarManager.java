package RentACar.bussiness.concretes;

import RentACar.bussiness.abstracts.CarService;
import RentACar.dataAccess.abstracts.CarDao;
import RentACar.entities.concretes.Car;

public class CarManager implements CarService {
	private CarDao carDao;
	
	public CarManager() {
		super();
	}

	public CarManager(CarDao carDao) {
		super();
		this.carDao = carDao;
	}

	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		carDao.add(car);
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		carDao.delete(car);
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		carDao.update(car);
	}

}
