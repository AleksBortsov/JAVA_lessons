import java.util.*;

public class JavaDevTasks {
    private static Map<Integer, Integer> map = new TreeMap<>();
    private static List<Integer> arrayList = new ArrayList();

    private static float medianaCalculation(int[] data) {
        float medium;
        Arrays.sort(data);
        if (data.length % 2 == 0) {
            medium = (float) (data[data.length / 2] + data[data.length / 2 - 1]) / 2;
        } else {
            medium = data[data.length / 2];
        }
        return medium;
    }

    private static boolean dublicate(int[] data) {
        for (int i = 0; i < data.length; i++)
            for (int j = i + 1; j < data.length; j++)
                if (data[i] == data[j])
                    return true;
        return false;
    }

    private static boolean dublicateInSet(int[] data) {
        Set<Integer> inSet = new HashSet<>();
        for (int i = 0; i < data.length; i++) {
            if (!inSet.add(data[i]))
                return true;
        }
        return false;
    }

    private static int inRange(int min, int max, int value) {
        //1. if min<value - return min  5    7         6
        //2. if value>max - return max
        //3. if min<value<max - return value
        return Math.min(max, Math.max(min, value));
    }

    private static int fibonaci(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        if (n > 2) {
            int k = fibonaci(n - 1) + fibonaci(n - 2);
            map.put(n, k);
            System.out.println("n= " + n + ", fibonaci= " + map.get(n));
            return k;
        } else {
            if (!map.containsKey(n)) {
                map.put(n, n);
                System.out.println("n= " + n + ", fibonaci= " + map.get(n));
                return n;
            }
        }
        return n;
    }

    private static int isHappyNumber(int number) {
        int rem, sum = 0;
// calculate the sum of squares of digits
        while (number > 0) {
            rem = number % 10;
            sum = sum + (rem * rem);
            number = number / 10;
        }
        return sum;
    }

    private static void checkHappyNumber(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int result = data[i];
            while (result != 1 && result != 4) {
                result = isHappyNumber(result);
            }
            if (result == 1) {
                System.out.println("Happy number = " + data[i]);
            } else if (result == 4) {
                System.out.println("NOT happy number = " + data[i]);
            }
        }
    }

    private static void polindrom(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 10) {
                int l = 0;
                int a = data[i];
                int count = 0;
                while (a > 0) {
                    int k = a % 10;
                    a = a / 10;
                    map.put(count, k);
                    System.out.println("number of data[i]: " + data[i] + ", key: " + count + ", number:" + map.get(count));
                    count = count + 1;
                    if (a == 0) {
                        l = map.size();
                        System.out.println("lenght of map: " + l + ", a equal 0");
                    }
                }
            }
        }
    }

    private static void polindrom2(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 10) {
                int a = data[i];
                int count = 0;
                while (a > 0) {
                    int k = a % 10;
                    a = a / 10;
                    arrayList.add(count, k);
                    System.out.println("number of data[i]: " + data[i] + ", key: " + count + ", number:" + k);
                    count++;
                    if (a == 0) {
                        count--;
//                        if ()
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        int data[] = {19999, 2, 3456, 78, 910, 1112, 1314};
//        System.out.println("MedianaCalculation: " + medianaCalculation(data));
//        System.out.println("Dublicate in array: " + dublicate(data));
//        System.out.println("Dublicate in Set: " + dublicateInSet(data));
//        System.out.println("in Range: " + inRange(5, 7, 6));
//        fibonaci(10);
//        checkHappyNumber(data);
        polindrom2(data);
    }
}