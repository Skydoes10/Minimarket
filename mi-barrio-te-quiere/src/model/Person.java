package model;

public class Person {
	private TypeID typeId;
	private String numId;

	public Person(TypeID tID, String nI) {
		typeId = tID;
		numId = nI;
	}
	
	public TypeID getTypeId() {
		return typeId;
	}

	public String getNumId() {
		return numId;
	}

}
