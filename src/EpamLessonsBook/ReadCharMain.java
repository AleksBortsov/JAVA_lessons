package EpamLessonsBook;

import java.io.IOException;

public class ReadCharMain {
    public static void main(String[] args) {
        int x;
        try {

            x = System.in.read();
            char c = (char) x;
            System.out.println("Charactere code: " + c + "= " + c);

        } catch (IOException e) {
            System.out.println("i/o error " + e);
        }
    }

}
