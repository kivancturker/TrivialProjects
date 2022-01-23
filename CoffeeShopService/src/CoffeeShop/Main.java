package CoffeeShop;

import java.time.LocalDate;

import CoffeeShop.Abstract.BaseCustomerManager;
import CoffeeShop.Adapters.MernisServiceAdapter;
import CoffeeShop.Concrete.NeroCustomerManager;
import CoffeeShop.Concrete.StarbucksCustomerManager;
import CoffeeShop.Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		try {
			// It works with valid information. 
			// SSN and date of birth is incorrect in this example.
			customerManager.save(new Customer(1, "Kıvanç", "Türker", LocalDate.of(1997, 1, 30), "99988855111"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
