package model;

public class Person {
	private TypeID typeId;
	private int numId;

	public Person(TypeID tID, int nI) {
		typeId = tID;
		numId = nI;
	}
	
	public TypeID getTypeId() {
		return typeId;
	}

	public int getNumId() {
		return numId;
	}

}
