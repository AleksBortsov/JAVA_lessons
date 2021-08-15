package EpamLessonsBook;

import java.util.Scanner;

public class Chapter1OptionA_5 {
    public static void main(String[] args) {

        System.out.print("Insert number: ");

        Scanner scannerNumbers = new Scanner(System.in);
        Integer number = scannerNumbers.nextInt();
        int s = 0;
        int m = 1;
        for (int summ = number; summ > 0; summ--) {
            s = summ + s;
            m = summ * m;
            // System.out.print(summ + "+");
        }
        System.out.println();
        System.out.println("Summa = " + s);
        System.out.println("Multiplication = " + m);
    }

}