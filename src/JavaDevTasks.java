import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class JavaDevTasks {
    private static Map<Integer, Integer> map = new TreeMap<>();

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

    private static boolean dublicateInSet(int data[]) {
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
//        return Math.min(min, Math.min(max, value));
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

//    private static int fibo(int n) {
//        if (n > 2) {
//            if (map.containsKey(n - 1)) {
//                int k = map.get(n - 1) + map.get(n - 2);
//                map.put(n, k);
//                return k;
//            } else {
//                int k = fibo(n - 1) + fibo(n - 2);
//                map.put(n, k);
//                System.out.println("n= " + n + ", fibonaci= " + map.get(n));
//                return k;
//            }
//        } else {
//            if (!map.containsKey(n)) {
//                map.put(n, n);
//                System.out.println("n= " + n + ", fibonaci= " + map.get(n));
//            }
//        }
//        return n;
//    }

//    private static int fibonacci_rev3(int n) {
//        if (n > 2) {
//            if (!map.containsKey(n - 1)) {
//                int k = fibonacci_rev3(n - 1);
//                map.put(n - 1, k);
//                return n;
//            }
//
//            if (!map.containsKey(n - 2)) {
//                int m = fibonacci_rev3(n - 2);
//                map.put(n - 2, m);
//                return m;
//            }
//
//            System.out.println("n= " + n + ", fibonaci= " + map.get(n - 2) + map.get(n - 1));
//
//
//        } else {
//            map.put(n, n);
//            map.put(n + 1, n + 1);
//            System.out.println("n= " + n + ", fibonaci= " + map.get(n));
//            System.out.println("n= " + (n + 1) + ", fibonaci= " + map.get(n + 1));
//        }
//        return n;
//    }

    public static void main(String[] args) {
        int data[] = {-7, -6, -5, -4, -3, -2, -2};
//        System.out.println("MedianaCalculation: " + medianaCalculation(data));
//        System.out.println("Dublicate in array: " + dublicate(data));
//        System.out.println("Dublicate in Set: " + dublicateInSet(data));
//        System.out.println("in Range: " + inRange(5, 7, 6));
        fibonaci(10);
//        fibo(10);

//        fibonacci_rev3(6);
    }
}