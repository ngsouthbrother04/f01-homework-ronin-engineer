package _10_Exception.Bai05;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String mess) {
        super(mess);
    }
}