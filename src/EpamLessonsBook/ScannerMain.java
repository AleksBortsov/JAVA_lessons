package EpamLessonsBook;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {
        System.out.println("Enter name and number, than press <enter>");
        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        System.out.println("hello " + name);

        int num = scan.nextInt();
        System.out.println("number " + num);
        scan.close();
    }
}
