package _10_Exception.Bai9;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String mess) {
        super(mess);
    }
}