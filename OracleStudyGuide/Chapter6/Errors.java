package Chapter6;

public class Errors {
    /**

     Errors

     Errors extend the Error class. They are thrown by the JVM and should not be handled or
     declared. Errors are rare, but you might see these:

     ExceptionInInitializerError Thrown by the JVM when a static initializer throws
     an exception and doesn’t handle it

     StackOverflowError Thrown by the JVM when a method calls itself too many times
     (this is called infinite recursion because the method typically calls itself without end)

     NoClassDefFoundError Thrown by the JVM when a class that the code uses is available
     at compile time but not runtime





     ExceptionInInitializerError

     Java runs static initializers the first time a class is used. If one of the static initializers
     throws an exception, Java can’t start using the class. It declares defeat by throwing an
     ExceptionInInitializerError. This code shows an ArrayIndexOutOfBounds in a static
     initializer:
     static {
     int[] countsOfMoose = new int[3];
     int num = countsOfMoose[-1];
     }
     public static void main(String[] args) { }
     This code yields information about two exceptions:
     Exception in thread "main" java.lang.ExceptionInInitializerError
     Caused by: java.lang.ArrayIndexOutOfBoundsException: -1
     We get the ExceptionInInitializerError because the error happened in a static initializer.
     That information alone wouldn’t be particularly useful in fixing the problem. Therefore,
     Java also tells us the original cause of the problem: the ArrayIndexOutOfBoundsException that
     we need to fix.
     The ExceptionInInitializerError is an error because Java failed to load the whole
     class. This failure prevents Java from continuing.





     StackOverflowError

     When Java calls methods, it puts parameters and local variables on the stack. After doing
     this a very large number of times, the stack runs out of room and overflows. This is called a
     StackOverflowError. Most of the time, this error occurs when a method calls itself.
     public static void doNotCodeThis(int num) {
     doNotCodeThis(1);
     }
     The output contains this line:
     Exception in thread "main" java.lang.StackOverflowError
     Since the method calls itself, it will never end. Eventually, Java runs out of room on the
     stack and throws the error. This is called infinite recursion. It is better than an infinite loop
     because at least Java will catch it and throw the error. With an infinite loop, Java just uses
     all your CPU until you can kill it.







     NoClassDefFoundError

     This error won’t show up in code on the exam—you just need to know that it is an error.
     NoClassDefFoundError occurs when Java can’t find the class at runtime.

     **/
}
