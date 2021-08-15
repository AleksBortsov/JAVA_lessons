package EpamLessonsBook;

import java.util.Scanner;

public class Chapter1OptionA_3 {

    public static void main(String[] args) {

        System.out.println("Insert number in new line: ");
        Scanner scannerNumbers = new Scanner(System.in);
        Integer numbers = scannerNumbers.nextInt();
        for (int i = 1; i < numbers + 1; i++)
            System.out.println(i);

        System.out.println("Insert number in line: ");
        Scanner scannerLineNumbers = new Scanner(System.in);
        Integer lineNumbers = scannerLineNumbers.nextInt();
        for (int n = 1; n < lineNumbers+1; n++)
            System.out.print(n+" ");
    }
}
