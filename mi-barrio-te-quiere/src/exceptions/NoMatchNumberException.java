package exceptions;

@SuppressWarnings("serial")
public class NoMatchNumberException extends Exception{
	
	public NoMatchNumberException() {
		super("El penultimo número del documento no coincide con el día");
	}
}
