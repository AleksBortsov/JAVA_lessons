package EpamLessonsBook;

import java.util.Scanner;

public class Chapter1OptionA_6 {

    public static void main(String[] args)  {

        System.out.println("Insert developer`s last name: ");
        Scanner nameScanner = new Scanner(System.in);

        String nameInsert = nameScanner.next();


        System.out.println("Insert date of started job in format: dd/MM/yyyy");
        Scanner scannerStartDate = new Scanner(System.in);
        String startDate = scannerStartDate.next();
        //SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Insert time of started job in format: HH:mm");
        Scanner scannerStartTime = new Scanner(System.in);
        String startTime = scannerStartTime.next();

        System.out.println("Insert date of finished job in format: dd/MM/yyyy");
        Scanner scannerStopDate = new Scanner(System.in);
        String stopDate = scannerStopDate.next();

        System.out.println("Insert time of finished job in format: HH:mm");
        Scanner scannerStopTime = new Scanner(System.in);
        String stopTime = scannerStopTime.next();

        System.out.println("Hello dear developer, Mr." + nameInsert);
        System.out.println("You job started at " + startDate + ", " + "in " + startTime);
        System.out.println("You job finished at " + stopDate + ", " + "in " + stopTime);

    }
}
