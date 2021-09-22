import java.util.Arrays;

public class JavaDevTasks {

    static private int[] data;
    static float medium;

    private static float medianaCalculation(int[] arr) {
        Arrays.sort(data);
        if (data.length % 2 == 0) {
            medium = (float) (data[data.length / 2] + data[data.length / 2 - 1]) / 2;
        } else {
            medium = data[data.length / 2];
        }
        return medium;
    }

    public static void main(String[] args) {
        data = new int[]{-7, -6, -5, -4, -3, -2, 8};
        System.out.println(medianaCalculation(data));
    }
}
