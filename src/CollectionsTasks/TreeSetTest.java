package CollectionsTasks;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Item> parts = new TreeSet();
        parts.add(new Item("Widget", 4567));
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("WPhone", 1213));
        parts.add(new Item("Modem", 9101));
        System.out.println(parts);

        TreeSet<Item> sortByDescription = new TreeSet<>();
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);

        TreeSet<Item> sortByPartnumber = new TreeSet<>();
        sortByPartnumber.addAll(parts);
        System.out.println(sortByPartnumber);
    }
}