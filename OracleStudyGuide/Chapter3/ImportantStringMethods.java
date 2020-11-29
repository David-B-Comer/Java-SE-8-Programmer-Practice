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




     indexOf()
     The method indexOf()looks at the characters in the string and fi nds the fi rst index that
     matches the desired value. indexOf can work with an individual character or a whole String
     as input. It can also start from a requested position. The method signatures are as follows:
     int indexOf(char ch)
     int indexOf(char ch, index fromIndex)
     int indexOf(String str)
     int indexOf(String str, index fromIndex)
     The following code shows how to use indexOf():
     String string = "animals";
     System.out.println(string.indexOf('a')); // 0
     System.out.println(string.indexOf("al")); // 4
     System.out.println(string.indexOf('a', 4)); // 4
     System.out.println(string.indexOf("al", 5)); // -1
     Since indexes begin with 0, the fi rst 'a' matches at that position. The second statement
     looks for a more specifi c string and so matches later on. The third statement says Java
     shouldn’t even look at the characters until it gets to index 4. The fi nal statement doesn’t
     fi nd anything because it starts looking after the match occurred. Unlike charAt(), the
     indexOf() method doesn’t throw an exception if it can’t fi nd a match. indexOf() returns
     –1 when no match is found. Because indexes start with 0, the caller knows that –1 couldn’t
     be a valid index. This makes it a common value for a method to signify to the caller that no
     match is found.

     **/
}
