package BasicsofJava;

public class HelloWorld {
    //class defintion
    //the line uses the keyword class to declare that a new class is being defined.

    public static void main(String[] args) {
        //main method
        /*in the java programming language, every application must contain a main method.
        tne main function is the entry point of your application, and its mandatory in a java
        program. */

        /*
         public : so that JVM can execute the method from anywhere
         static : the main method is to be called without an objects.
         void   : the main method doesn't return anything.
         main() : Name configured in the JVM. The main method must be inside the class definition. 
                  The compiler executes the codes starting always from the main function.
        String[]: the main method accepts a single argument.          
        */
        System.out.println("Hello, world");
    }
}
