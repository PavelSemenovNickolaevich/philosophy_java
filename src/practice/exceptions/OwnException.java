package practice.exceptions;

public class OwnException extends RuntimeException{

    public OwnException(String message) {
        super(message);
    }

    public OwnException(Throwable cause) {
        super(cause);
    }
}
