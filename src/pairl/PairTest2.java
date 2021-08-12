package pairl;

import java.time.LocalDate;

public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 6),
                LocalDate.of(1815, 10, 10),
                LocalDate.of(1903, 6, 22),
                LocalDate.of(1910, 6, 22),
        };
        Pair<LocalDate> mm = ArrayAlgAlg.minmax(birthdays);
        System.out.println("min= " + mm.getFirst());
        System.out.println("max= " + mm.getSecond());
    }
}

class ArrayAlgAlg {
    public static <T extends Comparable>
    Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
            if (max.compareTo(a[i]) == 0) max = a[i];
        }
        return new Pair<T>(min, max);
    }
}