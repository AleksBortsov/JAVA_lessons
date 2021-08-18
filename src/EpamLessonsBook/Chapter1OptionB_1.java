package EpamLessonsBook;

import java.util.Scanner;

public class Chapter1OptionB_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert 10 integer numbers: ");

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
        System.out.println();
        System.out.println("Maximum number: ");
        System.out.println(Math.max(numbers, 0));
        System.out.println("Minimum number: ");
        System.out.println(Math.min(numbers, 0));
    }
}

