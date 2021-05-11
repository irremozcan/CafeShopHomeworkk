import java.time.LocalDate;

import adapter.MerniceServiceVerification;
import business.concretes.StapleCustomerManager;
import business.concretes.CustomerControlManager;
import business.concretes.StarbucksCustomerManager;
import business.concretes.NeroCustomerManager;
import entities.concretes.Customer;


public class Main {

	public static void main(String[] args) {
			StapleCustomerManager stapleCustomerManager = new StarbucksCustomerManager(new MerniceServiceVerification());
			stapleCustomerManager.add(new Customer(1,"Ýrem","ÖZCAN",LocalDate.of(2222,3,13), "12345678901"));
	}

}
