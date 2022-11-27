package Dz2.WrongException;

public class WrongLoginException extends Exception {
    private final static String MESSAGE = "Неверный формат";

    public WrongLoginException() {
        super(MESSAGE);
    }

    public WrongLoginException(String txt) {
        super(txt);
    }
}
