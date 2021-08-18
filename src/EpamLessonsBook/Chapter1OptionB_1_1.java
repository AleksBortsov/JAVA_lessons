package EpamLessonsBook;

import java.util.Scanner;

public class Chapter1OptionB_1_1 {
    Scanner scanner = new Scanner(System.in);
    private int array[] = new int[5];


    private void insertNumbers() {

        System.out.println("Insert " + array.length + " integer numbers: ");
        int k = array.length;
        for (int i = 0; i < k; i++) {
            System.out.println("Insert number: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Length of array: " + array.length);

        for (Integer num : array
        ) {
            System.out.println(num + " ");
        }
    }

    private void paresNumbers() {
        Integer numbers = scanner.nextInt();
        System.out.print("Out Pared numbers: ");
        int k = array.length;
        for (int i = 0; i < k; i++)
            if (array[numbers] % 2 == 0)
                System.out.print(numbers + ", ");
    }

    public static void main(String[] args) {
        Chapter1OptionB_1_1 pares = new Chapter1OptionB_1_1();
        pares.insertNumbers();
       // pares.paresNumbers();
    }
}