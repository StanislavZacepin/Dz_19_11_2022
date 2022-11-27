package Dz2.WrongException;

public class WrongPasswordException extends Exception {
    private final static String MESSAGE = "Пороль отличаеться от того что вы вели";

    public WrongPasswordException() {
        super(MESSAGE);
    }

    public WrongPasswordException(String txt) {
        super(txt);
    }

}
