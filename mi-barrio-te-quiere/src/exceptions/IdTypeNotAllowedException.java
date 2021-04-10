package exceptions;

@SuppressWarnings("serial")
public class IdTypeNotAllowedException extends Exception{
	
	public IdTypeNotAllowedException() {
		super("La persona debe ser mayor de edad para poder ser registrada");
	}
}
