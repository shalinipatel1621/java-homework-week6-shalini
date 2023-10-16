package printprogramme2;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area
 * (A = PI r* r)
 */

public class Programme6 {
    public static void main(String[] args) {//create main method for input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius value: ");
        double r = scanner.nextDouble();
        circle(r);
        scanner.close();


    }

    public static void circle(double r){
        //concatenation
        System.out.println("Area of circle is: " + 3.14 * r * r);

    }
}
