package CoffeeShop.Abstract;

import CoffeeShop.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Customer saved to db " + customer.getFirstName());
	}
	
}
