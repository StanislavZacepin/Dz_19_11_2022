package Dz2.model;


import java.util.Scanner;

public class ScannerLoginAndPasword {


    /**
     * @return Для считывания данных водимых пользователём
     */
    public static Boolean scannerLoginAndPasword() {

        try (Scanner in = new Scanner(System.in)) {

            String password;

            System.out.print("Напишите Login.\n Login должен содержать только латинские буквы, цифры и знак подчеркивания.\n" +
                    "Длина login должна быть меньше 20 символов : \n ");
            CheckDz2.checkLoginAnd(in.nextLine());
            System.out.print("Password должен содержать только латинские буквы," +
                    " цифры и знак подчеркивания.\n Длина password должна быть меньше 20 символов.\n" +
                    " Также password и confirmPassword должны быть равны : ");
            CheckDz2.checkPasword(password = in.nextLine());

            System.out.print("Повтарите пороль: ");
            CheckDz2.checkConfirmPassword(password, in.nextLine());
        }catch (Exception e){
           System.out.println(e);
           return false;

        }
        return true;
    }
}






