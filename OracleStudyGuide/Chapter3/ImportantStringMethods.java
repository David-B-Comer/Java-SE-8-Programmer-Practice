package Chapter3;

public class ImportantStringMethods {
    /**

     The exam creators pick most of the methods developers use in the real world.
     For all these methods, you need to remember that a string is a sequence of characters
     and Java counts from 0 when indexed.



     length()
     The method length() returns the number of characters in the String. The method signature is as follows:
     int length()
     The following code shows how to use length():
     String string = "animals";
     System.out.println(string.length()); // 7
     Wait. It outputs 7? Didn’t we just tell you that Java counts from 0? The difference is
     that zero counting happens only when you’re using indexes or positions within a list. When
     determining the total size or length, Java uses normal counting again.


     charAt()
     The method charAt() lets you query the string to fi nd out what character is at a specifi c
     index. The method signature is as follows:
     char charAt(int index)
     The following code shows how to use charAt():
     String string = "animals";
     System.out.println(string.charAt(0)); // a
     System.out.println(string.charAt(6)); // s
     System.out.println(string.charAt(7)); // throws exception
     Since indexes start counting with 0, charAt(0) returns the “fi rst” character in the
     sequence. Similarly, charAt(6) returns the “seventh” character in the sequence. charAt(7)
     is a problem. It asks for the “eighth” character in the sequence, but there are only seven
     characters present. When something goes wrong that Java doesn’t know how to deal with,
     it throws an exception, as shown here. You’ll learn more about exceptions in Chapter 6,
     “Exceptions.”
     java.lang.StringIndexOutOfBoundsException: String index out of range: 7


     **/
}
