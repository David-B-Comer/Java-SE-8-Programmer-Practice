package Chapter3;

public class StringBuilder {
    /**

     The StringBuilder class
     creates a String without storing all those interim String values. Unlike the String class,
     StringBuilder is not immutable. The exam will likely try to trick you with respect to String and
     StringBuilder being mutable.
     Chaining makes this even more interesting. When we chained String method calls, the
     result was a new String with the answer. Chaining StringBuilder objects doesn’t work
     this way. Instead, the StringBuilder changes its own state and returns a reference to itself!



     Creating a StringBuilder
     There are three ways to construct a StringBuilder:
     StringBuilder sb1 = new StringBuilder();
     StringBuilder sb2 = new StringBuilder("animal");
     StringBuilder sb3 = new StringBuilder(10);
     The first says to create a StringBuilder containing an empty sequence of characters and
     assign sb1 to point to it. The second says to create a StringBuilder containing a specific
     value and assign sb2 to point to it. For the first two, it tells Java to manage the implementation details.
     The final example tells Java that we have some idea of how big the eventual value
     will be and would like the StringBuilder to reserve a certain number of slots for characters.




     Size vs. Capacity
     The behind-the-scenes process of how objects are stored isn’t on the exam, but some
     knowledge of this process may help you better understand and remember StringBuilder.
     Size is the number of characters currently in the sequence, and capacity is the number
     of characters the sequence can currently hold. Since a String is immutable, the size and
     capacity are the same. The number of characters appearing in the String is both the size
     and capacity.
     For StringBuilder, Java knows the size is likely to change as the object is used. When
     StringBuilder is constructed, it may start at the default capacity (which happens to be
     16) or one of the programmer’s choosing. In the example, we request a capacity of 5. At
     this point, the size is 0 since no characters have been added yet, but we have space for 5.
     Next we add four characters. At this point, the size is 4 since four slots are taken. The
     capacity is still 5. Then we add three more characters. The size is now 7 since we have
     used up seven slots. Because the capacity wasn’t large enough to store seven characters,
     Java automatically increased it for us.



     StringBuilder vs. StringBuffer
     When writing new code that concatenates a lot of String objects together, you should
     use StringBuilder. StringBuilder was added to Java in Java 5. If you come across older
     code, you will see StringBuffer used for this purpose. StringBuffer does the same thing
     but more slowly because it is thread safe. You’ll learn about threads for the OCP exam. In
     theory, you don’t need to know about StringBuffer on the exam at all. However, we bring
     this up anyway, since an older question might still be left on the exam.

     **/
}
