package printprogramme2;

/**
 * Write a Java programme declaring two instance variables and one instance method
 * Calling both instance variables into the instance method inside the print statement
 * Declare the Main method
 * Call the above instance method into the main method and run the programme
 */

public class Programme1 {
//declared two instance variables
    int s = 23;//first instance variable created
    String name = "Hello World";//second instance variable created


    public void m1() {//instance method created
        System.out.println(s);//instance variable in print method
        System.out.println(name);//
    }

    //Main method declared
    public static void main(String[] args) {
        Programme1 m = new Programme1();
        m.m1();


    }
}

