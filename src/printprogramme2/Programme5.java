package printprogramme2;

/**
 * Write a Java programme for a calculator with addition, subtraction, multiplication and division methods
 *use string concatenation methods
 * create two static and two instance methods
 */


import java.util.Scanner;

public class Programme5 {

    public static void main(String[] args) {//scanner used to input data and declaring both methods in main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter second number: ");
        int y = scanner.nextInt();
        scanner.close();
        addition(x, y);
        subtraction(x, y);
        Programme5 obj = new Programme5();
        obj.multiplication(x, y);
        Programme5 d = new Programme5();
        d.division(x, y);

    }

    public static void addition(int x, int y){//static method created
        //concatenation method
        System.out.println("Addition of two numbers is: " + (x + y));

    }

    public static void subtraction(int x, int y){//static method created
        //concatenation method
        System.out.println("Subtraction of two numbers: " + (x - y));

    }

    public void multiplication(int x, int y){//instance method created
        //concatenation method
        System.out.println("Multiplication of two number: " + (x * y));

    }

    public void division(int x, int y){//instance method created
        //concatenation method
        System.out.println("Division of two numbers: " + (x/y));


    }



}
