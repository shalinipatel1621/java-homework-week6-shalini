package printprogramme2;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle
 */

public class Programme14 {

    public static void main(String[] args) {//scanner used in main method and declaring static method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double w = scanner.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double h = scanner.nextDouble();
        double area = w * h;
        double perimeter = 2 * (w + h);
        area(w, h);
        perimeter(w, h);
        scanner.close();


    }

    public static void area(double w, double h){//static method
        //concatenation
        System.out.println("Area: " + w + " * " + h + " = " + (w * h));
    }

    public static void perimeter(double w, double h){//static method
        //concatenation
        System.out.println("Perimeter: " + " 2 * " + " ( " + w + " + " + h + " ) " + " = " + 2 * (w + h));

    }

}
