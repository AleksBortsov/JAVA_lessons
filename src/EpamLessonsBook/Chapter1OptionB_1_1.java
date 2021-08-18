package EpamLessonsBook;

import java.util.Scanner;

public class Chapter1OptionB_1_1 {

    public static void main(String[] args) {
        int array[];
        System.out.println("Insert 10 integer numbers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Insert number: " + i);
            array = new int[i];
            scanner.nextInt();
            System.out.println("Length of array: " + array.length);
        }

        Integer numbers = scanner.nextInt();
        System.out.print("Out pared numbers: ");
        for (int i = 1; i <= numbers; i++) {
            if (i % 2 == 0)
                System.out.print(i + ", ");
        }

        System.out.print("Out UNpared numbers: ");
        for (int i = 1; i <= numbers; i++) {
            if (i % 2 != 0)
                System.out.print(i + ", ");
        }
    }
}
