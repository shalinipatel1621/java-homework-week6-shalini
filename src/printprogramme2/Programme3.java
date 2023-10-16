package printprogramme2;

/**
 * Write a Java programme and declare one instance variable and one static variable
 * Declare one instance and one static method
 * call both instance and static variables into both instance and static methods inside the print statement
 * declare the main method
 * Call both instance and static methods in the main method and run
 */

public class Programme3 {

    String message = "Happy Birthday";//instance
    static String message2 = "Hello World";//static variable

    public void m1(){//instance method created and both variables called
        System.out.println(message);
        System.out.println(message2);


    }

    public static void m2(){//static method created and both variables called
        Programme3 v1 = new Programme3();
        System.out.println(v1.message);
        System.out.println(message2);

    }

    public static void main(String[] args) {//declared main method and run
        Programme3 obj = new Programme3();
        obj.m1();
        m2();

    }
}
