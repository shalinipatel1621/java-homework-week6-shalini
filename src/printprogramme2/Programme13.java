package printprogramme2;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers
 */

public class Programme13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the Third Number: ");
        int c = scanner.nextInt();
        average(a, b, c);
        scanner.close();

    }

    public static void average(int a, int b, int c){
        System.out.println("Average of three numbers is: " + (a + b + c)/3);

    }

}
