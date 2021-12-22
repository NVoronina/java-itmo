package optional;


public class TooManyShipsException extends Exception {
    public TooManyShipsException(String errorMessage) {
        super(errorMessage);
    }
}
