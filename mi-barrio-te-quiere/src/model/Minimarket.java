package model;

import java.time.LocalDate;
import java.util.ArrayList;
import exceptions.IdTypeNotAllowedException;
import exceptions.NoMatchNumberException;

public class Minimarket {
	
	private ArrayList<Person> peopleRegistered;
	private int totalPeople;
	
	public Minimarket() {
		peopleRegistered = new ArrayList<Person>();
		totalPeople = 0;
	}
	
	@SuppressWarnings("unused")
	public boolean verifyID(int numID) throws NoMatchNumberException {
		boolean pass = false;
		int lastN = numID%10;
		numID = numID/10;
		int secondLastN = numID%10;
		if(secondLastN%2==0 && LocalDate.now().getDayOfMonth()%2==0) {
			pass = true;
		}else if(secondLastN%2!=0 && LocalDate.now().getDayOfMonth()%2!=0){
			pass = true;
		}else {
			throw new NoMatchNumberException();
		}
		return pass;
	}
	
	public boolean verifyTypeID(int option) throws IdTypeNotAllowedException{
		boolean pass = true;
		if(option == 1) {
			pass = false;
			throw new IdTypeNotAllowedException();
		}
		return pass;
	}

	public String registerPerson(int option, int numID) throws NoMatchNumberException, IdTypeNotAllowedException {
		String out = "";
		Person p;
		totalPeople++;
		if(verifyID(numID) && verifyTypeID(option)) {
			if(option==2) {
				p = new Person(TypeID.CC, numID);
				peopleRegistered.add(p);
				out = "Añadido exitosamente";
			}else if(option==3) {
				p = new Person(TypeID.PP, numID);
				peopleRegistered.add(p);
				out = "Añadido exitosamente";
			}else {
				p = new Person(TypeID.CE, numID);
				peopleRegistered.add(p);
				out = "Añadido exitosamente";
			}
		}
		return out;
	}

	public int getTotalPeople() {
		return totalPeople;
	}

	public ArrayList<Person> getPeopleRegistered() {
		return peopleRegistered;
	}
	
}
