package FirstPackage;
import java.io.*;
import java.util.Scanner;

public class ConvertFeetInches
{
    public static void main(String[] args) {
        double feet;
        double inches;
        double cm;
        int exitCode = 0;
        Scanner scn = new Scanner(System.in);
        String tempFeet;
        String tempInch;
        System.out.println("Enter feet");
        tempFeet = scn.next();
        feet = Double.parseDouble(tempFeet);
        System.out.println("Enter Inches");
        tempInch = scn.next();
        inches = Double.parseDouble(tempInch);
        if (feet > 0 && inches > 0)
            exitCode = calcFeetInchtocm(feet, inches);
        else if (tempFeet == " " && inches > 0)
            exitCode = calcFeetInchtocm(inches);
        System.out.printf("Exit code " + exitCode);
    }

    public static int calcFeetInchtocm(double f, double i)
        {
            //double t1;
           //    System.out.println("inside f1 "+i);
        double cm;
        if (f >= 0)
            if (i >= 0 && i <= 12)
                System.out.println("Inches feet validation complete:Good to go");
            else
                return -1;
        else
            return -1;
        // 1 foot = 12 inches and 1 inch = 2.54 cm

        cm = 2.54*(f * 12 + i);

        System.out.println("Feet = " + f);
        System.out.println("Inches = " + i);
        System.out.println("Calculated centimeter = " + cm);
        return 0;
    }

    public static int calcFeetInchtocm(double i)
    {
        if (i >= 0) {
            calcFeetInchtocm(0, i);
            return 0;
        } else
            return -1;
    }


}




