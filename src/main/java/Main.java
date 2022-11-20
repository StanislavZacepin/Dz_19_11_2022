import entity.People;
import model.ScannerText;
import  model.Record;

public class Main {
    public static void main(String[] args) {

        People scan = ScannerText.scannerText();
        System.out.println(scan.getLastName() + " " + scan.getFirstName() + " " + scan.getPatronymic() + " "
                + scan.getBirthdate() + " " + scan.getPhoneNumber() + " " + scan.getGender());
        Record.findDirectory();
        Record.record(scan);
    }
}
