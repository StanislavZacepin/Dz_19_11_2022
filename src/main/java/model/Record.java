package model;

import entity.People;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Record {
    /**
     * @param people Запись человека в файл
     */
    public static void record(People people) {
        try (FileWriter writer = new FileWriter("C:\\DzStanislavaZacepina\\" + people.getLastName() + ".txt", true)) {

            writer.write(people.getLastName() + " " + people.getFirstName() + " " + people.getPatronymic() + " "
                    + people.getBirthdate() + " " + people.getPhoneNumber() + " " + people.getGender() + "\n");


            writer.flush();
        } catch (IOException ex) {

            System.out.println("Запись не прошла. " + ex.getMessage());
        }
    }

    /**
     * Найти папку . Создать папку если её нету.
     */
    public static void findDirectory() {
        try {
            File file = new File("C:\\DzStanislavaZacepina");
            if (!file.exists()) {
                file.mkdir();
            }
        } catch (Exception e) {
            throw new RuntimeException("Не удалось создать файл", e);
        }

    }
}
