package business.concretes;

import business.abstracts.CustomerControlServices;
import entities.concretes.Customer;

public class StarbucksCustomerManager extends StapleCustomerManager {
	
	private CustomerControlServices customerControlServices;
	
	public StarbucksCustomerManager (CustomerControlServices customerControlServices) {
		this.customerControlServices = customerControlServices;
	}
	
	@Override
	public void add(Customer customer) {
		
		if(customerControlServices.CustomerOrNotCustomer(customer))
		{
			super.add(customer);
		}
		else 
		{
			System.out.println("Kiþi mevcut deðil!");
		}		
		
	}

}

