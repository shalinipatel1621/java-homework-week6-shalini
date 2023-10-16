package printprogramme2;

/**
 * Write a Java program to swap two variables
 */

public class Programme15 {
    public static void main(String[] args) {

        //two variables
        int y = 10;
        int z = 20;

        System.out.println("Before Swap: ");
        //concatenation
        System.out.println( " y = " + y );
        System.out.println( " z = " + z);



        //values swapped by creating another variable
        int t = y;
        y = z;
        z = t;

        System.out.println("After Swap: ");
        //concatenation
        System.out.println( " y = " + y );
        System.out.println( " z = " + z);

    }


}
