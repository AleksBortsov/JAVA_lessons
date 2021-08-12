package CollectionsTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class ShuffleTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++)
            numbers.add(i);
        Collections.shuffle(numbers);
        System.out.println(numbers);
        List<Integer> winnitgCombination = numbers.subList(0, 20);
        Collections.sort(winnitgCombination);
        System.out.println("------------------------------" + "\n" + winnitgCombination);

    }

    public ArrayList<Item> lookup() {
        ArrayList<Item> results = new ArrayList<>();
        return results;
    }
    Properties settings=new Properties();
}
