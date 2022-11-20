import entity.Gender;
import entity.People;
import model.Check;
import model.ScannerText;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        People scan = ScannerText.scannerText();
        System.out.println(scan.getLastName() + " " + scan.getFirstName() + " " + scan.getPatronymic() + " "
                + scan.getBirthdate() + " " + scan.getPhoneNumber() + " " + scan.getGender());

    }
}
