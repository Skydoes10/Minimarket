package exceptions;

@SuppressWarnings("serial")
public class NoMatchNumberException extends Exception{
	
	public NoMatchNumberException() {
		super("The penultimate number of the ID doesn't match the date");
	}
}
