package Dz2.model;

import Dz2.WrongException.WrongLoginException;
import Dz2.WrongException.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDz2 {
    /**
     * Проверка Логина
     *
     * @return true
     */
    public static boolean checkLoginAnd(String data) throws WrongLoginException {

        try {
            Pattern pattern = Pattern.compile("^[a-zA-Z\\d_]{1,20}$");
            Matcher matcher = pattern.matcher(data);
            if (!matcher.find()) {
                throw new WrongLoginException();
            }

        } catch (WrongLoginException e) {
            throw new WrongLoginException();
        } catch (Exception e) {
            throw new RuntimeException("Что то не так");
        }
        return true;
    }

    /**
     * Проверка пороля
     *
     * @return true
     */
    public static boolean checkPasword(String data) throws WrongPasswordException {
        try {
            Pattern pattern = Pattern.compile("^[a-zA-Z\\d_]{1,20}$");
            Matcher matcher = pattern.matcher(data);
            if (!matcher.find()) {
                throw new WrongPasswordException("Пороль не соответсвует требованиям ");
            }

        } catch (WrongPasswordException e) {
            throw new WrongPasswordException("Пороль не соответсвует требованиям ");
        } catch (Exception e) {
            throw new RuntimeException("Что то не так", e);
        }
        return true;
    }

    /**
     * Проверка совпадения поролей
     *
     * @return true
     */
    public static boolean checkConfirmPassword(String password, String confirmPassword) throws WrongPasswordException {
        try {
            if (password.equals(confirmPassword)) {
                return true;
            } else {
                throw new WrongPasswordException();
            }
        } catch (WrongPasswordException e) {
            throw new WrongPasswordException();
        } catch (Exception e) {
            throw new RuntimeException("Что то не так", e);
        }


    }
}
