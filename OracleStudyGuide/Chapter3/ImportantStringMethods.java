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
     The method indexOf()looks at the characters in the string and finds the first index that
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
     Since indexes begin with 0, the first 'a' matches at that position. The second statement
     looks for a more specific string and so matches later on. The third statement says Java
     shouldn’t even look at the characters until it gets to index 4. The final statement doesn’t
     find anything because it starts looking after the match occurred. Unlike charAt(), the
     indexOf() method doesn’t throw an exception if it can’t find a match. indexOf() returns
     –1 when no match is found. Because indexes start with 0, the caller knows that –1 couldn’t
     be a valid index. This makes it a common value for a method to signify to the caller that no
     match is found.






     substring()
     The method substring() also looks for characters in a string. It returns parts of the string.
     The first parameter is the index to start with for the returned string. As usual, this is a
     zero-based index. There is an optional second parameter, which is the end index you want
     to stop at.
     Notice we said “stop at” rather than “include.” This means the endIndex parameter is
     allowed to be 1 past the end of the sequence if you want to stop at the end of the sequence.
     That would be redundant, though, since you could omit the second parameter entirely in
     that case. In your own code, you want to avoid this redundancy. Don’t be surprised if the
     exam uses it though. The method signatures are as follows:
     int substring(int beginIndex)
     int substring(int beginIndex, int endIndex)
     The following code shows how to use substring():
     String string = "animals";
     System.out.println(string.substring(3)); // mals
     System.out.println(string.substring(string.indexOf('m'))); // mals
     System.out.println(string.substring(3, 4)); // m
     System.out.println(string.substring(3, 7)); // mals
     The substring() method is the trickiest String method on the exam. The first example
     says to take the characters starting with index 3 through the end, which gives us "mals".
     The second example does the same thing: it calls indexOf() to get the index rather than
     hard-coding it. This is a common practice when coding because you may not know the
     index in advance.
     The third example says to take the characters starting with index 3 until, but not including,
     the character at index 4—which is a complicated way of saying we want a String with
     one character: the one at index 3. This results in "m". The final example says to take the
     characters starting with index 3 until we get to index 7. Since index 7 is the same as the end
     of the string, it is equivalent to the first example.
     We hope that wasn’t too confusing. The next examples are less obvious:
     System.out.println(string.substring(3, 3)); // empty string
     System.out.println(string.substring(3, 2)); // throws exception
     System.out.println(string.substring(3, 8)); // throws exception
     The first example in this set prints an empty string. The request is for the characters starting with
     index 3 until you get to index 3. Since we start and end with the same index, there
     are no characters in between. The second example in this set throws an exception because
     the indexes can be backward. Java knows perfectly well that it will never get to index 2 if
     it starts with index 3. The third example says to continue until the eighth character. There
     is no eighth position, so Java throws an exception. Granted, there is no seventh character
     either, but at least there is the “end of string” invisible position.
     Let’s review this one more time since substring() is so tricky. The method returns the
     string starting from the requested index. If an end index is requested, it stops right before
     that index. Otherwise, it goes to the end of the string.




     toLowerCase() and toUpperCase()
     Whew. After that mental exercise, it is nice to have methods that do exactly what they
     sound like! These methods make it easy to convert your data. The method signatures are as
     follows:
     String toLowerCase(String str)
     String toUpperCase(String str)
     The following code shows how to use these methods:
     String string = "animals";
     System.out.println(string.toUpperCase()); // ANIMALS
     System.out.println("Abc123".toLowerCase()); // abc123
     These methods do what they say. toUpperCase() converts any lowercase characters to
     uppercase in the returned string. toLowerCase() converts any uppercase characters to lowercase in the returned string. These methods leave alone any characters other than letters.
     Also, remember that strings are immutable, so the original string stays the same.




     equals() and equalsIgnoreCase()
     The equals() method checks whether two String objects contain exactly the same characters in the same order. The equalsIgnoreCase() method checks whether two String
     objects contain the same characters with the exception that it will convert the characters’
     case if needed. The method signatures are as follows:
     boolean equals(String str)
     boolean equalsIgnoreCase(String str)
     The following code shows how to use these methods:
     System.out.println("abc".equals("ABC")); // false
     System.out.println("ABC".equals("ABC")); // true
     System.out.println("abc".equalsIgnoreCase("ABC")); // true
     This example should be fairly intuitive. In the fi rst example, the values aren’t exactly the
     same. In the second, they are exactly the same. In the third, they differ only by case, but it
     is okay because we called the method that ignores differences in case.



     startsWith() and endsWith()
     The startsWith() and endsWith() methods look at whether the provided value matches
     part of the String. The method signatures are as follows:
     boolean startsWith(String prefix)
     boolean endsWith(String suffix)
     The following code shows how to use these methods:
     System.out.println("abc".startsWith("a")); // true
     System.out.println("abc".startsWith("A")); // false
     System.out.println("abc".endsWith("c")); // true
     System.out.println("abc".endsWith("a")); // false
     Again, nothing surprising here. Java is doing a case-sensitive check on the values provided.





     contains()
     The contains() method also looks for matches in the String. It isn’t as particular as
     startsWith() and endsWith()—the match can be anywhere in the String. The method
     signature is as follows:
     boolean contains(String str)
     The following code shows how to use these methods:
     System.out.println("abc".contains("b")); // true
     System.out.println("abc".contains("B")); // false
     Again, we have a case-sensitive search in the String.
     The contains() method is a convenience method so you don’t have to write str.indexOf(otherString) != -1.




     replace()
     The replace() method does a simple search and replace on the string. There’s a version that takes char parameters
     as well as a version that takes CharSequence parameters.
     A CharSequence is a general way of representing several classes, including String and
     StringBuilder. It’s called an interface, which we’ll cover in Chapter 5, “Class Design.”
     The method signatures are as follows:
     String replace(char oldChar, char newChar)
     String replace(CharSequence oldChar, CharSequence newChar)
     The following code shows how to use these methods:
     System.out.println("abcabc".replace('a', 'A')); // AbcAbc
     System.out.println("abcabc".replace("a", "A")); // AbcAbc
     The first example uses the first method signature, passing in char parameters. The
     second example uses the second method signature, passing in String parameters.



     **/
}
