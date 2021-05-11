package business.concretes;

import business.abstracts.CustomerControlServices;
import entities.concretes.Customer;

public class CustomerControlManager implements CustomerControlServices{

	@Override
	public boolean CustomerOrNotCustomer(Customer customer) {
		return true;
	}

}
