package Utility;

import java.util.Scanner;

public class Utility {
    static Scanner scan = new Scanner(System.in);

    public static String getStockName(){
        System.out.println("Enter the name : ");
        return scan.next();
    }

    public static int getStockPrice(){
        System.out.println("Enter the price : ");
        return scan.nextInt();
    }

    public static int getNumberOfShares(){
        System.out.println("Enter the number of stocks : ");
        return scan.nextInt();
    }
    public static void displayOptions(){
        System.out.println("Press 1 - to add new Company portfolio ");
        System.out.println("Press 2 - to get Particular Stock Value ");
        System.out.println("Press 3 - to Buy Shares ");
        System.out.println("Press 4 - to Sell Shares ");
        System.out.println("Press 5 - to Print Report ");
        System.out.println("Press 6 - to Exit ");
    }

    public static int readInteger()
    {
        return scan.nextInt(); 		//Scanner object to input Integer
    }

    public static double readDouble()
    {
        return scan.nextDouble();		//Scanner object to input Double
    }

    public static long readLong()
    {
        return scan.nextLong();		//Scanner object to input Long
    }

    public static String readString()
    {
        return scan.next();		//Scanner object to input String
    }

    public static String readStringLine()
    {
        return scan.nextLine();		//Scanner object to input String
    }

    public static float readFloat()
    {
        return scan.nextFloat();		//Scanner object to input Float
    }
}
