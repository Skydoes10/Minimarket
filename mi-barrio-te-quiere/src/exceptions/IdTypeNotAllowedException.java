package exceptions;

@SuppressWarnings("serial")
public class IdTypeNotAllowedException extends Exception{
	
	public IdTypeNotAllowedException() {
		super("Type of ID can't be TI");
	}
}
