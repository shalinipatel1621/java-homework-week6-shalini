package printprogramme2;

/**
 * Declare two static variables and one static method
 * Call both static variables in to the static method inside the print statement
 * declare the Main method
 * call the static method into the main method and run the programmme
 */


public class Programme2 {//two static variables declared
    static int s = 23;//first static variable
    static String name = "Happy Days";//second static variable

    public static void m1(){//static method
        System.out.println(s);//print statement
        System.out.println(name);//print statement


    }

    public static void main(String[] args) {//main method
        m1();//static method into main

    }
}
