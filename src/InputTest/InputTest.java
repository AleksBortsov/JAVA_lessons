package InputTest;

import javax.print.DocFlavor;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) throws IOException {
        /*Console console=System.console();
       String username=console.readLine("User name: ");
        char [] paswrd =console.readPassword("Password: ");*/

        Scanner in = new Scanner(System.in);

        System.out.println("What in you name?");
        String name=in.nextLine();

        System.out.println("How old are you?");
        int age=in.nextInt();

        System.out.println("Hello, my name is "+name+"."+ " I am "+age+ " years old");
        double dx=1000/3.0;
        System.out.println(dx);

        int ix=1000/3;
        System.out.println(ix);

        float fx=1000/3f;
        System.out.println(fx);

        short sx=1000/3;
        System.out.println(sx);
        PrintWriter out=new PrintWriter("text.txt","UTF-8");
        Scanner ins=new Scanner(Paths.get("text.txt"),"UTF-8");
        System.out.println(ins);

        String []itext ={"gello", "shta?", "how are you","world"};
        if (itext[0].equals("h"))
            System.out.println("Hello, ");
        else if (itext[0].equals("g"))
            System.out.print("Goodbye, ");
        for (int i=1; i<itext.length;i++)
            System.out.print(" "+itext[i]);
            System.out.println("!");

    }
}
