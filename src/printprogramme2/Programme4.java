package printprogramme2;

/**
 * Write a Java programme and declare two instance and two static variables
 * Declare one instance method and one static method
 * Call all four instance and static variables into both methods inside the print statement
 * Declare the main method and call both methods into main method and run
 */
public class Programme4 {

    int c = 30;//instance variable one created
    String message = "Happy Face";//instance variable second created
    static int b = 40;//static variable
    static String name = "John";//static variable

    public void m3() {//instance variable method
        System.out.println(c);
        System.out.println(message);
        System.out.println(b);
        System.out.println(name);

    }

    public static void m4() {//static variable method
        Programme4 v = new Programme4();//object creation to convert instance to static
        System.out.println(v.c);
        System.out.println(v.message);
        System.out.println(b);
        System.out.println(name);

    }

    public static void main(String[] args) {//main method created
        Programme4 z = new Programme4();//object creation
        z.m3();//instance method
        m4();//static method


    }

}
