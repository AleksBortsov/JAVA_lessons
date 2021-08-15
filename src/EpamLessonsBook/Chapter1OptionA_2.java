package EpamLessonsBook;

import java.util.Scanner;

public class Chapter1OptionA_2 {
    public static void main(String[] args) {

        System.out.println("Insert you name: ");
        Scanner nameScanner = new Scanner(System.in);

        String nameInsert = nameScanner.next();
        System.out.println("Hello, " + nameInsert);

        String reverse = new StringBuffer(nameInsert).reverse().toString();
        System.out.println(reverse);
    }
}

