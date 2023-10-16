package printprogramme2;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number
 * Input a decimal number: 5
 * Binary number is: 5
 */

public class Programme17 {

    public static void main(String[] args) {//convert string to integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        conversion(decimal);
        scanner.close();
    }

    public static void conversion(int decimal) {//static method
        String binary1 = Integer.toBinaryString(decimal);//convert integer to binary string
        //concatenation
        System.out.println("Binary number is: " + binary1);
    }
}
