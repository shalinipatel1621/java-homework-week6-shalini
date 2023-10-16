package printprogramme2;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and print its multiplication table up to 10
 */

public class Programme10 {

    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//scanner method used to input data
        System.out.println("Enter the Number: ");
        int n = scanner.nextInt();
        multiplication(n);
        scanner.close();

    }
    public static void multiplication(int n){//static method
        //concatenation
        System.out.println("Multiplication = " + n + " * 1 = " + n * 1);
        System.out.println("Multiplication = " + n + " * 2 = " + n * 2);
        System.out.println("Multiplication = " + n + " * 3 = " + n * 3);
        System.out.println("Multiplication = " + n + " * 4 = " + n * 4);
        System.out.println("Multiplication = " + n + " * 5 = " + n * 5);
        System.out.println("Multiplication = " + n + " * 6 = " + n * 6);
        System.out.println("Multiplication = " + n + " * 7 = " + n * 7);
        System.out.println("Multiplication = " + n + " * 8 = " + n * 8);
        System.out.println("Multiplication = " + n + " * 9 = " + n * 9);
        System.out.println("Multiplication = " + n + " * 10 = " + n * 10);




    }
}
