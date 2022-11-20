package model;

import entity.Gender;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    /**
     * @param data проверка вели ли дату рождения
     * @return
     */
    public static LocalDate checkLocalDate(String data) {
        LocalDate localDate;
        try {
            String[] array = data.split("\\.");
            int index = array.length;
            localDate = LocalDate.of(Integer.parseInt(array[index - 1]), Integer.parseInt(array[index - 2]), Integer.parseInt(array[index - 3]));
        } catch (Exception e) {
            throw new RuntimeException("Не правильно вели дату " + e);
        }
        return localDate;
    }

    /**
     * @param phoneNumber проверка номер телефона
     * @return
     */
    public static long checkPhoneNumber(String phoneNumber) {
        try {
            Pattern pattern = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
            Matcher matcher = pattern.matcher(phoneNumber);
            if (!matcher.find()) {
                throw new NumberFormatException("Неправильно записали номер");
            }

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неправильно записали номер");
        }

        return Long.parseLong(phoneNumber);
    }

    /**
     * @param gender Для проверки какой пол указал пользователь
     * @return
     */
    public  static Gender checkGendr(String gender){
        if (gender.toLowerCase().equals("m") || gender.toLowerCase().equals("м")) {
          return Gender.Man;
        } else if (gender.toLowerCase().equals("w") || gender.toLowerCase().equals("ж")) {
            return  Gender.Women;
        } else throw new RuntimeException("Неверно указали пол");

    }
}
//Pattern pattern = Pattern.compile("^\\d{10}$"); ^((8|\+7)[\- ]?)?(\(?\d{3}\)?[\- ]?)?[\d\- ]{7,10}$