import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaDevTasks {

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

    private static int fibanachi(int n) {
        for (int i = 0; i < 100; i++) {

        }
        int k = 2;
        return fibanachi(n);
    }

    public static void main(String[] args) {
        int data[] = {-7, -6, -5, -4, -3, -2, -2};
        System.out.println("MedianaCalculation: " + medianaCalculation(data));
        System.out.println("Dublicate in array: " + dublicate(data));
        System.out.println("Dublicate in Set: " + dublicateInSet(data));
        System.out.println("in Range: " + inRange(5, 7, 6));
        System.out.println(fibanachi(1));
    }
}