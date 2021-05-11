package adapter;

import business.abstracts.CustomerControlServices;
import entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceVerification implements CustomerControlServices {

	private boolean result;

	@Override
	public boolean CustomerOrNotCustomer(Customer customer) {
		
		KPSPublicSoapProxy deputy = new KPSPublicSoapProxy();
		result = false;
		
		try 
		{
			result = deputy.TCKimlikNoDogrula(Long.parseLong(customer.getNat›d()),customer.getName().toUpperCase(),customer.getSurname().toUpperCase(), customer.getDateOfBirht().getYear());		
		} 
		catch (Exception e) 
		{
			System.out.println("Not a valid person");
		}
		
		return result;
	}
	

}
