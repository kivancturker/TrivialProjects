package ecommerce.dataaccess.exceptions;

@SuppressWarnings("serial")
public class NoUserFoundException extends Exception {
	public NoUserFoundException (String message) {
		super(message);
	}
}
