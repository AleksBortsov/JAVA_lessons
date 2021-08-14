package EpamLessonsBook;

import java.nio.charset.StandardCharsets;

public class Start {
    public static void main(String[] args) {
        System.out.println("Hello starting lessons from Epam book");
    }

    Start start = new Start(6, 6);

    public Start(int a, int b) {
        a = 5;
        b = 5;
        int c = a*b;
    }
}
