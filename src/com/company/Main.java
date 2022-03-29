package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
	    String trash = "";
        int meters = 0;
        double miles = 0, feet = 0, inches = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a measurement in meters. ");
        if (in.hasNextInt())
        {
            meters = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You need to enter a valid meter input. "+trash);
            return;
        }
        miles = meters / 1609344;
        feet = meters * 3.2808;
        inches = meters * 39.370;
        System.out.println("After converting there are "+ miles +" miles in "+meters +" meters.");
        System.out.println("After converting there are "+ feet +" feet in "+meters +" meters.");
        System.out.println("After converting there are "+ inches +" inches in "+meters +" meters.");
    }
}
