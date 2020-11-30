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



     **/
}
