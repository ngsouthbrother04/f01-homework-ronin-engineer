package _10_Exception.B10;

public class InvalidIDException extends Exception {
    public InvalidIDException(String mess) {
        super(mess);
    }
}