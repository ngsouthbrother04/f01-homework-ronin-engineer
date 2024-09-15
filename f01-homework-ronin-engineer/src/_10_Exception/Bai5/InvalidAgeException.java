package _10_Exception.Bai5;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String mess) {
        super(mess);
    }
}