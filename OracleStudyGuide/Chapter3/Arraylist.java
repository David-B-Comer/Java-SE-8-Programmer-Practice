package Chapter3;

public class Arraylist {
    /**

     Understanding an ArrayList
     An array has one glaring shortcoming: you have to know how many elements will be in the
     array when you create it and then you are stuck with that choice. Just like a StringBuilder,
     ArrayList can change size at runtime as needed. Like an array, an ArrayList is an ordered
     sequence that allows duplicates.
     As when we used Arrays.sort, ArrayList requires an import. To use it, you must have
     either of the following two statements in your class:
     import java.util.* // import whole package including ArrayList
     import java.util.ArrayList; // import just ArrayList
     Remember that if you are shown a code snippet with a line number that doesn’t begin
     with 1, you can assume the necessary imports are there. Similarly, you can assume the
     imports are present if you are shown a snippet of a method.
     In this section, we’ll look at creating an ArrayList, common methods, autoboxing,
     conversion, and sorting.
     Experienced programmers, take note: This section is simplified and doesn’t cover a
     number of topics that are out of scope for the OCA exam.





     Creating an ArrayList
     As with StringBuilder, there are three ways to create an ArrayList:
     ArrayList list1 = new ArrayList();
     ArrayList list2 = new ArrayList(10);
     ArrayList list3 = new ArrayList(list2);
     The first says to create an ArrayList containing space for the default number of
     elements but not to fi ll any slots yet. The second says to create an ArrayList containing a
     specific number of slots, but again not to assign any. The fi nal example tells Java that we
     want to make a copy of another ArrayList. We copy both the size and contents of that
     ArrayList. Granted, list2 is empty in this example so it isn’t particularly interesting.
     Although these are the only three constructors you need to know, you do need to learn
     some variants of it. The previous examples were the old pre–Java 5 way of creating an
     ArrayList. They still work and you still need to know they work. You also need to know
     the new and improved way. Java 5 introduced generics, which allow you to specify the type
     of class that the ArrayList will contain.
     ArrayList<String> list4 = new ArrayList<String>();
     ArrayList<String> list5 = new ArrayList<>();
     Java 5 allows you to tell the compiler what the type would be by specifying it between <
     and >. Starting in Java 7, you can even omit that type from the right side. The < and > are
     still required, though. This is called the diamond operator because <> looks like a diamond.
     Just when you thought you knew everything about creating an ArrayList, there is one
     more thing you need to know. ArrayList implements an interface called List. In other
     words, an ArrayList is a List. You will learn about interfaces in Chapter 5. In the meantime, just know that you can store an ArrayList in a List reference variable but not vice
     versa. The reason is that List is an interface and interfaces can’t be instantiated.
     List<String> list6 = new ArrayList<>();
     ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE



     Using an ArrayList
     ArrayList has many methods, but you only need to know a handful of them—even fewer
     than you did for String and StringBuilder.
     Before reading any further, you are going to see something new in the method signatures:
     a “class” named E. Don’t worry—it isn’t really a class. E is used by convention in generics
     to mean “any class that this array can hold.” If you didn’t specify a type when creating the
     ArrayList, E means Object. Otherwise, it means the class you put between < and >.
     You should also know that ArrayList implements toString() so you can easily see the
     contents just by printing it. Arrays do not do produce such pretty output.

     **/
}
