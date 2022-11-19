package model;

import java.util.Scanner;

public class ScannerText {


    public static String[] scannerText() {
        String[] arrray;
        String textForArray;
        try (Scanner in = new Scanner(System.in)) {

            System.out.print("Напишите данные через пробел: Фамилию, Имя, Отчество, дата рождения, номер телефона, пол.: \n ");
            textForArray = in.nextLine();
            arrray = textForArray.split(" ");
            if(arrray.length < 6) throw new RuntimeException("Веденно меньше данных");
            if(arrray.length > 6) throw new RuntimeException("Веденно больше данных чем нужно");
        }
        return arrray;
    }
}






