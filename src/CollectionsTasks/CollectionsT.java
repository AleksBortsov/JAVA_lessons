package CollectionsTasks;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CollectionsT {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<String>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");
        Iterator<String> iterator = staff.iterator();
        String first = iterator.next();
        String second = iterator.next();
        iterator.remove();
        System.out.println(staff);
        iterator.next();
        iterator.remove();
        System.out.println(staff);
        staff.add("Alex");
        System.out.println(iterator.hasNext());
        System.out.println(staff);
        ListIterator<String> iterListIter = staff.listIterator();
        //iterListIter.next();
        iterListIter.add("Solene");
        System.out.println(staff);
        System.out.println(staff.contains("Aleks"));
        System.out.println(staff.get(2));
        for (String staff1 : staff
        ) {
            System.out.println(staff1);
        }
        for (int i = 0; i < staff.size(); i++) {
            System.out.println(staff.get(i));
        }

    }

}