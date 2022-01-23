package CoffeeShop.Abstract;

import CoffeeShop.Entities.Customer;

public interface CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer);
}
