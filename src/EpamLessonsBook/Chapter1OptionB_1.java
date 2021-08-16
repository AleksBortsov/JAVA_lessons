package EpamLessonsBook;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Chapter1OptionB_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        Integer numbers = scanner.nextInt();

        System.out.print("Out pared numbers: ");
        for (int i = 1; i <= numbers; i++) {
            if (i % 2 == 0)
                System.out.print(i + ", ");
        }

        System.out.print("Out UNpared numbers: ");
        for (int k = 0; k <= numbers; k++) {
            if (k % 2 != 0)
                System.out.print(k + ", ");
        }
    }
}
