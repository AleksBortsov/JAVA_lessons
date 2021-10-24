package EpamLessonsBook;

import java.util.*;

public class Chapter1OptionB_1_1 {
    private Scanner scanner = new Scanner(System.in);
    private Integer array[] = new Integer[8];

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
                            System.out.println(array[i]);
                        }
                    }
                }
            }
        }
    }

    private void lowerToHigh() {
        System.out.println();
        System.out.print("Output lower to high numbers: ");
        int k = array.length;
        for (int i = 0; i < k; i++) {
            Arrays.sort(array);
            System.out.print(array[i] + ", ");
            int h = 0, rmd;
        }
    }

    private void highToLower() {
        System.out.println();
        System.out.print("Output high to lower numbers: ");
        int k = array.length;
        for (int i = 0; i < k; i++) {
            Arrays.sort(array, Collections.reverseOrder());
            System.out.print(array[i] + ", ");
        }
    }

    private void sortLowerToHigh() {
        System.out.println();
        System.out.print("Output high to lower numbers dublicates: ");
        int k = array.length;
        for (int i = 0; i < k; i++) {
            if (array[i] / 100 == array[i] / 10 % 10
                    & array[i] % 10 == array[i] / 100
                    & array[i] / 10 % 10 == array[i] % 10) {
                Arrays.sort(array, Comparator.reverseOrder());
                System.out.print(array[i] + ", ");
            } else {
                Arrays.sort(array, Comparator.reverseOrder());
                System.out.print(array[i] + ", ");
            }
        }
    }

    private void sortLowerToHigh2() {
        System.out.println();
        System.out.print("Output high to lower numbers dublicates2: ");
        int k = array.length;
        for (int i = 0; i < k; i++) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            hashMap.put(k, array[i]);
            System.out.print(hashMap.get(k) + ", ");
        }
    }

    private void sortLowerToHigh3() {
        System.out.println();
        System.out.println("Output high to lower numbers dublicates3: ");
        int k = array.length;
        int counter = 1;
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                Arrays.sort(array, Collections.reverseOrder());
                if (array[i] == array[j]) {
                    counter++;
                }
                System.out.println("Number: " + array[j] + ". " + counter + " - pcs");
            }
        }
    }

    private void sortLowerToHigh4() {
        System.out.println();
        System.out.println("Output high to lower numbers dublicates4: ");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int k = array.length;
        for (int i = 0; i < k; i++) {

            if (hashMap.containsKey(array[i])) {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            } else {
                hashMap.put(array[i], 1);

            }
        }

        hashMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    private boolean isHappy(int num) {
        if (num == 1)
            return true;
        for (int j : array)
            if (num == j)
                return false;
        int nextNum = array[num];
        return isHappy(nextNum);
    }

    private void happyNumbers() {
        System.out.println("Happy numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (isHappy(array[i]))
                System.out.println(array[i] + ", ");
        }
    }


    private void hulfSumBetween() {
        System.out.println();
        System.out.print("Output hulf Sum Between: ");
        int k = array.length;
        for (int i = k; i > k; i--) {
            if ((array[i] + array[i - 2]) / 2 == array[i - 1]) {
                System.out.print(array[i] + ", ");
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int m = 2; m <= Math.sqrt(num); m++) {
            if (num % m == 0) {
                return false;
            }
        }
        return true;
    }

    private void primeNumbers2() {
        System.out.println();
        System.out.print("Prime Numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Chapter1OptionB_1_1 numbers = new Chapter1OptionB_1_1();
        numbers.insertNumbers();
//        numbers.paresNumbers();
//        numbers.unParedNumbers();
//        numbers.numDevision3or9();
//        numbers.numDevision5and7();
//        numbers.maxNum();
//        numbers.minNum();
//        numbers.threeDigitNumbers();
//        numbers.lowerToHigh();
//        numbers.highToLower();
//        numbers.sortLowerToHigh();
//        numbers.palondromNumbers();
//        numbers.hulfSumBetween();
//        numbers.primeNumbers2();
//        numbers.sortLowerToHigh();
//        numbers.sortLowerToHigh2();
//        numbers.sortLowerToHigh3();
//        numbers.sortLowerToHigh4();
        numbers.happyNumbers();
//
//        int n = -325;
//        System.out.println(n / 100);
//        System.out.println(n/10% 10);
//        System.out.println(n%10);
//        numbers.arrayTasks();
    }
}