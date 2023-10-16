package printprogramme2;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase
 * INPUT: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
 */

public class Programme19 {
    public static void main(String[] args) {//declared main method for scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase();//added command to convert to lowercase
        lowercase(sentence);//declared static method into main method
        scanner.close();
    }

    public static void lowercase(String sentence){
        //concatenation
        System.out.println("Lowercase: " + sentence);

    }


}
