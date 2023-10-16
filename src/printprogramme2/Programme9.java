package printprogramme2;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case
 */

public class Programme9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence ");
        String upper = scanner.nextLine();
        upper = upper.toLowerCase();
        upper(upper);
        scanner.close();

    }

    public static void upper(String upper){
        //concatenation method
        System.out.println("Lowercase: " + upper);

    }
}
