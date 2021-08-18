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
        System.out.print("Out Pared numbers: ");
        int k = array.length;
        for (int i = 0; i < k; i++)
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
    }

    private void unParedNumbers() {
        System.out.println();
        System.out.print("Out UnPared numbers: ");
        int k = array.length;
        for (int i = 0; i < k; i++)
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + ", ");
            }
    }

//    private void maxNum() {
//        System.out.print("Out Max number: ");
//        int k = array.length;
//        for (int i = 0; i < k; i++)
//            if (array[i] % 2 != 0) {
//                System.out.print(array[i] + ", ");
//            }
//    }

    private void numDevision3or9() {
        System.out.println();
        System.out.print("Out numDevision3or9 numbers: ");
        int k = array.length;
        for (int i = 0; i < k; i++)
            if (array[i] % 3==0 | array[i] %9 == 0) {
                System.out.print(array[i] + ", ");
            }
    }

    private void numDevision5and7() {
        System.out.println();
        System.out.print("Out numDevision5and7 numbers: ");
        int k = array.length;
        for (int i = 0; i < k; i++)
            if (array[i] % 5==0 && array[i] %7 == 0) {
                System.out.print(array[i] + ", ");
            }
    }

    public static void main(String[] args) {
        Chapter1OptionB_1_1 numbers = new Chapter1OptionB_1_1();
        numbers.insertNumbers();
        numbers.paresNumbers();
        numbers.unParedNumbers();
        numbers.numDevision3or9();
        numbers.numDevision5and7();

    }
}