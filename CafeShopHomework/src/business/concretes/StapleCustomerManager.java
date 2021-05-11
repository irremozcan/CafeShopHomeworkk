package business.concretes;

import business.abstracts.CustomerServices;
import entities.concretes.Customer;

public abstract class StapleCustomerManager implements CustomerServices{

	@Override
	public void add(Customer customer) {
		System.out.println("Müþteri Kaydedildi!"+ customer.getName()+ customer.getSurname());
	}


}
