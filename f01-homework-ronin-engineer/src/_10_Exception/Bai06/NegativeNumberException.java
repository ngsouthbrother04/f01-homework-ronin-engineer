package _10_Exception.Bai06;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(String mess) {
        super(mess);
    }
}