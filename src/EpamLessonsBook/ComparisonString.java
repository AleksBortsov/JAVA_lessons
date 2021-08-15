package EpamLessonsBook;

public class ComparisonString {

    public static void main(String[] args) {
        String str1, str2;
        str1 = "Java";
        str2 = str1;

        System.out.println("compression of references " + (str1 == str2));

        str2 = new String("Java");

        System.out.println("compression of references " + (str1 == str2));
        System.out.println("compression of values " + str1.equals(str2));
    }
}
