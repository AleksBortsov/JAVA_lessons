package CollectionsTasks;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueuTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1989, 03, 17));
        pq.add(LocalDate.of(1996, 06, 27));
        pq.add(LocalDate.of(1962, 01, 10));
        pq.add(LocalDate.of(1937, 02, 28));
        pq.add(LocalDate.of(1964, 07, 17));
        System.out.println("Iterating all elements....");
        for (LocalDate date : pq)
            System.out.println(date);
        System.out.println("Removing all elements....");
        while (!pq.isEmpty())
            System.out.println(pq.remove());
    }
}
