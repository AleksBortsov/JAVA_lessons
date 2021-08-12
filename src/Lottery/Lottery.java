package Lottery;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("How many numbrs you need to draw?");
        int n=in.nextInt();

        System.out.println("What is she higest numbr?");
        int k=in.nextInt();

        int []numbers=new int [n];
        for (int i=0;i<numbers.length;i++)
            numbers[i]=i+1;

        int [] result=new int[k];
                for (int i=0; i<numbers.length;i++){
                    int rundm=(int)(Math.random()*n);
                    result [i]=numbers[rundm];
                    numbers[rundm]=numbers[n-1];
                    n--;
                }
        Arrays.sort(result);
        System.out.println("Bet combination! ");
        for (int run:result)
            System.out.println(run);
    }
}
