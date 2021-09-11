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
        scanner.close();
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

    private void maxNum() {
        System.out.println();
        System.out.print("Out Max number: ");
        int max = array[0];
        int k = array.length;
        for (int i = 0; i < k; i++)
            if (array[i] > max) {
                max = array[i];
            }
        System.out.print(max + ", ");
    }

    private void minNum() {
        System.out.println();
        System.out.print("Out Min number: ");
        int min = array[0];
        int k = array.length;
        for (int i = 0; i < k; i++)
            if (array[i] < min) {
                min = array[i];
            }
        System.out.print(min + ", ");
    }

    private void numDevision3or9() {
        System.out.println();
        System.out.print("Out numDevision3or9 numbers: ");
        int k = array.length;
        for (int i = 0; i < k; i++)
            if (array[i] % 3 == 0 | array[i] % 9 == 0) {
                System.out.print(array[i] + ", ");
            }
    }

    private void numDevision5and7() {
        System.out.println();
        System.out.print("Out numDevision5and7 numbers: ");
        int k = array.length;
        for (int i = 0; i < k; i++)
            if (array[i] % 5 == 0 && array[i] % 7 == 0) {
                System.out.print(array[i] + ", ");
            }
    }

    protected void threeDigitNumbers() {
        System.out.println();
        int k = array.length;
        for (int i = 0; i < k; i++) {
            if (array[i] >= 100 && array[i] < 1000
                    || array[i] <= -100 && array[i] > -1000) {
                if (array[i] / 100 != array[i] / 10 % 10
                        && array[i] % 10 != array[i] / 100
                        && array[i] / 10 % 10 != array[i] % 10) {
                    System.out.println("Out threeDigitNumbers: " + array[i] + ", ");
                }
            } else {
                System.out.println("Out not threeDigitNumbers: " + array[i] + ", ");
            }
        }
    }

    private void primeNumbers() {
        System.out.println();
        int k = array.length;
        int max = array[0];
        for (int i = 0; i < k; i++) {
            if (array[i] > 1) {
                if (array[i] > max) {
                    max = array[i];
                }
                for (int m = max; m > 1; m--) {
                    if (array[i] / m == 1 && array[i] > 0) {
                        //inlet data array[i]
                    }
                    for (int g = array[i] - 1; g > 2; g--) {
                        if (array[i] % g == 0) {
                            System.out.println("Out NOT prime number: " + array[i]);
                        }

                    }
                }
            }
        }
    }

    private void lowerToHigh() {

    }

    public static void main(String[] args) {
        Chapter1OptionB_1_1 numbers = new Chapter1OptionB_1_1();
        numbers.insertNumbers();
        numbers.paresNumbers();
        numbers.unParedNumbers();
        numbers.numDevision3or9();
        numbers.numDevision5and7();
        numbers.maxNum();
        numbers.minNum();
        numbers.threeDigitNumbers();
        numbers.primeNumbers();
    }
}