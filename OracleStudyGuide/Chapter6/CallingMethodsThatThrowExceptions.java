package Chapter6;

public class CallingMethodsThatThrowExceptions {
    /**

     When you’re calling a method that throws an exception, the rules are the same as within a
     method. Do you see why the following doesn’t compile?
     class NoMoreCarrotsException extends Exception {}
     public class Bunny {
     public static void main(String[] args) {
     eatCarrot();// DOES NOT COMPILE
     }
     private static void eatCarrot() throws NoMoreCarrotsException {
     }
     }
     The problem is that NoMoreCarrotsException is a checked exception. Checked exceptions must be handled or declared.
     The code would compile if we changed the main() method to either of these:
     public static void main(String[] args)
     throws NoMoreCarrotsException {// declare exception
     eatCarrot();
     }
     public static void main(String[] args) {
     try {
     eatCarrot();
     } catch (NoMoreCarrotsException e ) {// handle exception
     System.out.print("sad rabbit");
     }
     }
     You might have noticed that eatCarrot() didn’t actually throw an exception; it just
     declared that it could. This is enough for the compiler to require the caller to handle or
     declare the exception.
     The compiler is still on the lookout for unreachable code. Declaring an unused exception
     isn’t considered unreachable code. It gives the method the option to change the implementation to throw that
     exception in the future. Do you see the issue here?
     public void bad() {
     try {
     eatCarrot();
     } catch (NoMoreCarrotsException e ) {// DOES NOT COMPILE
     System.out.print("sad rabbit");
     }
     }
     public void good() throws NoMoreCarrotsException {
     eatCarrot();
     }
     private static void eatCarrot() { }
     Java knows that eatCarrot() can’t throw a checked exception—which means there’s no
     way for the catch block in bad() to be reached. In comparison, good() is free to declare
     other exceptions.

     **/
}
