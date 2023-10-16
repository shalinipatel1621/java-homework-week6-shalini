package printprogramme2;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius
 * ((F-32) x 5/9 = 0 C).
 */

public class Programme7 {

    public static void main(String[] args) {//main method scanner input data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in F:  ");
        double f = scanner.nextDouble();
        celsius(f);
        scanner.close();
    }

    public static void celsius(double f){//static method created
        //concatenation method
        System.out.println("Temperature in degree Celsius: " + (f - 32) * 5/9);

    }
}
