package EpamLessonsBook;

import java.util.Scanner;

public class Chapter1OptionA_4 {


    public static void main(String[] args) {

        String etalonPass = "password";

        System.out.println("Insert password to compare: ");
        Scanner scannerPass = new Scanner(System.in);
        String password = scannerPass.next();
        System.out.println(password.equals(etalonPass));
    }
}
