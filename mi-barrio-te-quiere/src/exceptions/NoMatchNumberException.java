package exceptions;

@SuppressWarnings("serial")
public class NoMatchNumberException extends Exception{
	
	public NoMatchNumberException() {
		super("El penultimo n�mero del documento no coincide con el d�a");
	}
}
