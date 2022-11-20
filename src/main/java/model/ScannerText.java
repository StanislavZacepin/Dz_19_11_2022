package model;
import entity.People;
import java.util.Scanner;

public class ScannerText {


    /**
     * @return Для считывания данных водимых пользователём
     */
    public static People scannerText() {
        People people = new People();
        try (Scanner in = new Scanner(System.in)) {

            System.out.print("Напишите данные через пробел: Фамилию, Имя, Отчество, дата рождения, номер телефона, пол.: \n ");
            System.out.print("Напишите Фамилию: ");
            people.setLastName(in.nextLine());

            System.out.print("Напишите Имя: ");
            people.setFirstName(in.nextLine());

            System.out.print("Напишите Отчество: ");
            people.setPatronymic(in.nextLine());

            System.out.print("Напишите дату рождения: ");
            people.setBirthdate(Check.checkLocalDate(in.nextLine()));

            System.out.print("Напишите номер телефона: ");
            people.setPhoneNumber(Check.checkPhoneNumber(in.nextLine()));

            System.out.print("Напишите без кавычек \"м\" или \"m\" если пол мужской. Если пол женский \"ж\" или \"w\" : ");
            String gender = in.nextLine();
            people.setGender(Check.checkGendr(gender));


        }
        return people;
    }
}






