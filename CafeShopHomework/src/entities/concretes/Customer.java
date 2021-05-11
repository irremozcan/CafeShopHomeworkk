package entities.concretes;
import java.time.LocalDate;
import entities.abstracts.Entity;

public class Customer {
	
	public int id;
	public String Name;
	public String Surname;
	public LocalDate dateOfBirht;
	public String nat›d;
	
	public Customer() {
		
	}

	public Customer(int id, String name, String surname, LocalDate dateOfBirht, String nat›d) {
		super();
		this.id = id;
		Name = name;
		Surname = surname;
		this.dateOfBirht = dateOfBirht;
		this.nat›d = nat›d;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public LocalDate getDateOfBirht() {
		return dateOfBirht;
	}

	public void setDateOfBirht(LocalDate dateOfBirht) {
		this.dateOfBirht = dateOfBirht;
	}

	public String getNat›d() {
		return nat›d;
	}

	public void setNat›d(String nat›d) {
		this.nat›d = nat›d;
	}
	

}
