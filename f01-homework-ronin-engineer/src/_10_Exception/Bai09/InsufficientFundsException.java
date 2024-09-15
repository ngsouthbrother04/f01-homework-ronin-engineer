package _10_Exception.Bai09;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String mess) {
        super(mess);
    }
}