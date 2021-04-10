package model;

import java.util.ArrayList;

public class Minimarket {
	
	private ArrayList<Person> peopleRegistered;
	private int totalPeople;
	
	public Minimarket() {
		peopleRegistered = new ArrayList<Person>();
		totalPeople = 0;
	}
	
	public String verifyID() {
		
	}
	
	public String registerPerson(int option, String numID) {
		String out = "";
		Person p;
		switch(option) {
			case 1:
				break;
			case 2: p = new Person(TypeID.CC, numID);
					peopleRegistered.add(p);
					totalPeople++;
					out = "Añadido exitosamente";
				break;
			case 3: p = new Person(TypeID.PP, numID);
					peopleRegistered.add(p);
					totalPeople++;
					out = "Añadido exitosamente";
				break;
			case 4: p = new Person(TypeID.CE, numID);
					peopleRegistered.add(p);
					totalPeople++;
					out = "Añadido exitosamente";
				break;
		}
		
		
		return out;
	}

	public int getTotalPeople() {
		return totalPeople;
	}
}
