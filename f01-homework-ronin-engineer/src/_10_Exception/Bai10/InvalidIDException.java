package _10_Exception.Bai10;

public class InvalidIDException extends Exception {
    public InvalidIDException(String mess) {
        super(mess);
    }
}