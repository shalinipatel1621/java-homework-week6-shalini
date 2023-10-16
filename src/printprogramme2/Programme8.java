package printprogramme2;

import java.util.Scanner;

/** Write a program to calculate the area of the triangle
 *
 */

public class Programme8 {

    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base value: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the height value: ");
        double h = scanner.nextDouble();
        triangle(b, h);
        scanner.close();
    }
public static void triangle(double b, double h){
        //concatenation method
    System.out.println("Area of triangle: " + 0.5 * b * h);

}

}
