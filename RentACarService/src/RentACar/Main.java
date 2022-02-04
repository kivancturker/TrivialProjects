package RentACar;


import RentACar.bussiness.abstracts.CarService;
import RentACar.bussiness.concretes.CarManager;
import RentACar.dataAccess.concretes.CarMsSQLDao;
import RentACar.dataAccess.concretes.CarOracleDao;
import RentACar.entities.concretes.Brand;
import RentACar.entities.concretes.Car;
import RentACar.entities.concretes.Color;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarService cs = new CarManager(new CarOracleDao());
		CarService csMs = new CarManager(new CarMsSQLDao());
		Car car = new Car(1, new Brand(1, "Mercedes"), new Color(2, "Yellow"), "sahipsiz");
		cs.add(car);
		cs.delete(car);
		cs.update(car);
		
		csMs.add(car);
		csMs.update(car);
		csMs.delete(car);
	}

}
