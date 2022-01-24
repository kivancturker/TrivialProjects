package CoffeeShop.Adapters;

import java.rmi.RemoteException;

import CoffeeShop.Abstract.CustomerCheckService;
import CoffeeShop.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		try {
			return kpsPublic.TCKimlikNoDogrula(Long.valueOf(customer.getSsn()).longValue(), 
													customer.getFirstName().toUpperCase(), 
													customer.getLastName().toUpperCase(), 
													customer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
}
