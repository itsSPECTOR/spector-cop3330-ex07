package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 7 Solution
 * Copyright 2021 Reese Spector
 *
 */
public class App 
{

    private static final double FACTOR = 0.09290304;

    public static void main( String[] args )
    {
        // scanner
        Scanner input = new Scanner(System.in);

            // get length
            System.out.print("What is the length of the room in feet? ");
            String strLen = input.nextLine();
            int lenNum = Integer.parseInt(strLen);

            // get width
            System.out.print("What is the width of the room in feet? ");
            String strWid = input.nextLine();
            int widNum = Integer.parseInt(strWid);

            // calc area
            int ftArea = lenNum * widNum;
            double mtArea = (ftArea * FACTOR);

            // print dimentions
            System.out.print("You entered dimensions of " + lenNum + " feet by " + widNum + " feet.\n");
            System.out.print("The area is \n");

        // print sq feet
        System.out.print(ftArea  + " square feet\n");

        // print sq meters
        System.out.print(mtArea  + " square meters");

    }
}
