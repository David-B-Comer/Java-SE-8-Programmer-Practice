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




     add()
     The add() methods insert a new value in the ArrayList. The method signatures are as
     follows:
     boolean add(E element)
     void add(int index, E element)
     Don’t worry about the boolean return value. It always returns true. It is there because
     other classes in the collections family need a return value in the signature when adding an
     element.
     Since add() is the most critical ArrayList method you need to know for the exam, we are
     going to show a few sets of examples for it. Let’s start with the most straightforward case:
     ArrayList list = new ArrayList();
     list.add("hawk"); // [hawk]
     list.add(Boolean.TRUE); // [hawk, true]
     System.out.println(list); // [hawk, true]
     add() does exactly what we expect: it stores the String in the no longer empty
     ArrayList. It then does the same thing for the boolean. This is okay because we didn’t
     specify a type for ArrayList; therefore, the type is Object, which includes everything
     except primitives. It may not have been what we intended, but the compiler doesn’t know
     that. Now, let’s use generics to tell the compiler we only want to allow String objects in
     our ArrayList:
     ArrayList<String> safer = new ArrayList<>();
     safer.add("sparrow");
     safer.add(Boolean.TRUE); // DOES NOT COMPILE
     This time the compiler knows that only String objects are allowed in and prevents the
     attempt to add a boolean. Now let’s try adding multiple values to different positions.
     4: List<String> birds = new ArrayList<>();
     5: birds.add("hawk"); // [hawk]
     6: birds.add(1, "robin"); // [hawk, robin]
     7: birds.add(0, "blue jay"); // [blue jay, hawk, robin]
     8: birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
     9: System.out.println(birds); // [blue jay, cardinal, hawk, robin]
     When a question has code that adds objects at indexed positions, draw it so that you
     won’t lose track of which value is at which index. In this example, line 5 adds "hawk" to the
     end of birds. Then line 6 adds "robin" to index 1 of birds, which happens to be the end.
     Line 7 adds "blue jay" to index 0, which happens to be the beginning of birds. Finally,
     line 8 adds "cardinal” to index 1, which is now near the middle of birds.





     remove()
     The remove() methods remove the fi rst matching value in the ArrayList or remove the
     element at a specifi ed index. The method signatures are as follows:
     boolean remove(Object object)
     E remove(int index)
     This time the boolean return value tells us whether a match was removed. The E return
     type is the element that actually got removed. The following shows how to use these
     methods:
     3: List<String> birds = new ArrayList<>();
     4: birds.add("hawk"); // [hawk]
     5: birds.add("hawk"); // [hawk, hawk]
     6: System.out.println(birds.remove("cardinal")); // prints false
     7: System.out.println(birds.remove("hawk")); // prints true
     8: System.out.println(birds.remove(0)); // prints hawk
     9: System.out.println(birds); // []
     Line 6 tries to remove an element that is not in birds. It returns false because no such
     element is found. Line 7 tries to remove an element that is in birds and so returns true.
     Notice that it removes only one match. Line 8 removes the element at index 0, which is the
     last remaining element in the ArrayList.
     Since calling remove() with an int uses the index, an index that doesn’t exist will throw
     an exception. For example, birds.remove(100) throws an IndexOutOfBoundsException.
     There is also a removeIf() method. We’ll cover it in the next chapter because it uses
     lambda expressions (a topic in that chapter).




     set()
     The set() method changes one of the elements of the ArrayList without changing the size.
     The method signature is as follows:
     E set(int index, E newElement)
     The E return type is the element that got replaced. The following shows how to use this
     method:
     15: List<String> birds = new ArrayList<>();
     16: birds.add("hawk"); // [hawk]
     17: System.out.println(birds.size()); // 1
     18: birds.set(0, "robin"); // [robin]
     19: System.out.println(birds.size()); // 1
     20: birds.set(1, "robin"); // IndexOutOfBoundsException
     Line 16 adds one element to the array, making the size 1. Line 18 replaces that one element and the size stays at 1. Line 20 tries to replace an element that isn’t in the ArrayList.
     Since the size is 1, the only valid index is 0. Java throws an exception because this isn’t
     allowed.





     isEmpty() and size()
     The isEmpty() and size() methods look at how many of the slots are in use. The method
     signatures are as follows:
     boolean isEmpty()
     int size()
     The following shows how to use these methods:
     System.out.println(birds.isEmpty()); // true
     System.out.println(birds.size()); // 0
     birds.add("hawk"); // [hawk]
     birds.add("hawk"); // [hawk, hawk]
     System.out.println(birds.isEmpty()); // false
     System.out.println(birds.size()); // 2
     At the beginning, birds has a size of 0 and is empty. It has a capacity that is greater
     than 0. However, as with StringBuilder, we don’t use the capacity in determining size or
     length. After adding elements, the size becomes positive and it is no longer empty.




     clear()
     The clear() method provides an easy way to discard all elements of the ArrayList. The
     method signature is as follows:
     void clear()
     The following shows how to use this method:
     List<String> birds = new ArrayList<>();
     birds.add("hawk"); // [hawk]
     birds.add("hawk"); // [hawk, hawk]
     System.out.println(birds.isEmpty()); // false
     System.out.println(birds.size()); // 2
     birds.clear(); // []
     System.out.println(birds.isEmpty()); // true
     System.out.println(birds.size()); // 0
     After we call clear(), birds is back to being an empty ArrayList of size 0.




     contains()
     The contains() method checks whether a certain value is in the ArrayList. The method
     signature is as follows:
     boolean contains(Object object)
     The following shows how to use this method:
     List<String> birds = new ArrayList<>();
     birds.add("hawk"); // [hawk]
     System.out.println(birds.contains("hawk")); // true
     System.out.println(birds.contains("robin")); // false
     This method calls equals() on each element of the ArrayList to see whether there are
     any matches. Since String implements equals(), this works out well.




     equals()
     Finally, ArrayList has a custom implementation of equals() so you can compare two lists
     to see if they contain the same elements in the same order.
     boolean equals(Object object)
     The following shows an example:
     31: List<String> one = new ArrayList<>();
     32: List<String> two = new ArrayList<>();
     33: System.out.println(one.equals(two)); // true
     34: one.add("a"); // [a]
     35: System.out.println(one.equals(two)); // false
     36: two.add("a"); // [a]
     37: System.out.println(one.equals(two)); // true
     38: one.add("b"); // [a,b]
     39: two.add(0, "b"); // [b,a]
     40: System.out.println(one.equals(two)); // false
     On line 33, the two ArrayList objects are equal. An empty list is certainly the same
     elements in the same order. On line 35, the ArrayList objects are not equal because the size
     is different. On line 37, they are equal again because the same one element is in each. On
     line 40, they are not equal. The size is the same and the values are the same, but they are
     not in the same order.

     **/
}
