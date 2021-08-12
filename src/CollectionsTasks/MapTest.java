package CollectionsTasks;

import EmployeeN.EmployeeN;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, EmployeeN> staff = new HashMap<String, EmployeeN>();
        staff.put("\n144-25-5464", new EmployeeN("Anna Lee"));
        staff.put("\n567-25-2525", new EmployeeN("Harry Haris"));
        staff.put("\n148-88-1488", new EmployeeN("Gary Topor"));
        staff.put("\n123-45-6789", new EmployeeN("Klicko Kruz"));
        System.out.println(staff);
        staff.remove("567-25-2525");
        System.out.println(staff);

        staff.put("\n567-25-2525", new EmployeeN("Welcom Welcomich"));
        System.out.println(staff);

        staff.get("123-45-6789");
        staff.forEach((k, v) ->
                System.out.print("\nkey= " + k + ", value= " + v));
        System.out.println("\n-------------------------------");
        for (Map.Entry<String, EmployeeN> entry : staff.entrySet()) {
            String key = entry.getKey();
            EmployeeN value = entry.getValue();
            System.out.println(key + "  ," + value);
        }
        LinkedHashMap<String, EmployeeN> staffLHM = new LinkedHashMap<String, EmployeeN>();

        staffLHM.put("\n111-11-1111", new EmployeeN("__1 Harry Haris"));
        staffLHM.put("\n222-22-2222", new EmployeeN("__2 Anna Lee"));
        staffLHM.put("\n333-33-3333", new EmployeeN("__3 Gary Topor"));
        staffLHM.put("\n444-44-4444", new EmployeeN("__4 Klicko Kruz"));

        staffLHM.keySet().iterator();
        staffLHM.values().iterator();

        List<String> names = List.of("Peter", "Paul", "Mary");
        Set<Integer> numbers = Set.of(2, 3, 5);
        System.out.println(names + "  " + numbers);

        Map<String, Integer> scope = Map.of("Peter", 2, "Paul", 3, "Mary", 5);
        System.out.println(scope);
        Map<String, Integer> scores = Map.ofEntries(
                Map.entry("Perter", 2),
                Map.entry("Paul", 3),
                Map.entry("Mary", 5)
        );
        System.out.println(scores);
        //    max();

        ArrayList<Integer> numbersAL = new ArrayList<Integer>();
        for (int i = 0; i <= 49; i++) {
            numbersAL.add(i);
            System.out.println(numbersAL);
            Collections.shuffle(numbersAL);
            List<Integer> winningNumbers = numbersAL.subList(0, 12);
            Collections.sort(winningNumbers);
            System.out.println("\n----------------------------------" + winningNumbers);

        }
    }

    public static <T extends Comparable> T max(LinkedList<T> collection) {

        if (collection.isEmpty()) throw new NoSuchElementException("No elements in collection");
        Iterator<T> iterator = collection.iterator();
        T largest = iterator.next();

        while (iterator.hasNext()) {
            T next = iterator.next();
            if (largest.compareTo(next) < 0)
                largest = next;
        }
        System.out.println("\n--------------------" + largest);
        return largest;
    }
}
