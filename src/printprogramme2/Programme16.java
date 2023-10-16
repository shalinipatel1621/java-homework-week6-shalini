package printprogramme2;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers
 * input first binary number: 10
 * input second binary number: 11
 * Expected output: Sum of two binary numbers: 101
 */

public class Programme16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first binary number: ");
        String binary1 = scanner.nextLine();
        System.out.println("Enter second binary number: ");
        String binary2 = scanner.nextLine();
        int f = Integer.parseInt(binary1, 2);
        int s = Integer.parseInt(binary2, 2);
        addition(f, s);
        scanner.close();

    }

    public static void addition(int f, int s){
        String sum = Integer.toBinaryString (f + s);
        System.out.println("Sum of two binary number: " + sum);

    }
}
