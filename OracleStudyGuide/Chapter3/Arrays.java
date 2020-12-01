package Chapter3;

public class Arrays {
    /**

     An array is an area of memory on the heap with space for a designated number of elements. A String is
     implemented as an array with some methods that you might want to use when dealing with
     characters specifically. A StringBuilder is implemented as an array where the array object is
     replaced with a new bigger array object when it runs out of space to store all the characters. A
     big difference is that an array can be of any other Java type. If we didn’t want to use a String
     for some reason, we could use an array of char primitives directly:
     char[] letters;
     This wouldn’t be very convenient because we’d lose all the special properties String
     gives us, such as writing “Java”. Keep in mind that letters is a reference variable and not
     a primitive. char is a primitive. But char is what goes into the array and not the type of the
     array itself. The array itself is of type char[]. You can mentally read the brackets ([]) as
     “array.”
     In other words, an array is an ordered list. It can contain duplicates. You will learn
     about data structures that cannot contain duplicates for the OCP exam. In this section,
     we’ll look at creating an array of primitives and objects, sorting, searching, varargs, and
     multidimensional arrays.



     Multiple “Arrays” in Declarations
     What types of reference variables do you think the following code creates?
     int[] ids, types;
     The correct answer is two variables of type int[]. This seems logical enough. After all,
     int a, b; created two int variables. What about this example?
     int ids[], types;
     All we did was move the brackets, but it changed the behavior. This time we get one variable of type int[] and
     one variable of type int. Java sees this line of code and thinks
     something like this: “They want two variables of type int. The fi rst one is called ids[].
     This one is a int[] called ids. The second one is just called types. No brackets, so it is a
     regular integer.”
     Needless to say, you shouldn’t write code that looks like this. But you do still need to
     understand it for the exam.



     Using an Array
     Now that we know how to create an array, let’s try accessing one:
     4: String[] mammals = {"monkey", "chimp", "donkey"};
     5: System.out.println(mammals.length); // 3
     6: System.out.println(mammals[0]); // monkey
     7: System.out.println(mammals[1]); // chimp
     8: System.out.println(mammals[2]); // donkey
     Line 4 declares and initializes the array. Line 5 tells us how many elements the array
     can hold. The rest of the code prints the array. Notice elements are indexed starting with 0.
     This should be familiar from String and StringBuilder, which also start counting with 0.
     Those classes also counted length as the number of elements.




     Java makes it easy to sort an array by providing a sort method—or rather, a bunch of sort
     methods. Just like StringBuilder allowed you to pass almost anything to append(), you
     can pass almost any array to Arrays.sort().
     There is one exception, although it doesn’t come up often on the exam. You can write
     java.util.Arrays every time it is used in the class instead of specifying it as an import.
     Remember that if you are shown a code snippet with a line number that doesn’t begin
     with 1, you can assume the necessary imports are there. Similarly, you can assume the
     imports are present if you are shown a snippet of a method.
     **/
}
