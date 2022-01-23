package CoffeeShop.Concrete;

import CoffeeShop.Abstract.BaseCustomerManager;
import CoffeeShop.Abstract.CustomerCheckService;
import CoffeeShop.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService ccs;
	public StarbucksCustomerManager(CustomerCheckService ccs) {
		super();
		this.ccs = ccs;
	}
	@Override
	public void save(Customer customer) throws Exception {
		
		if (ccs.checkIfRealPerson(customer)) 
		{
			super.save(customer);
		}
		else 
		{
			throw new Exception("Not a valid person.");
		}
		
	}
	
}
