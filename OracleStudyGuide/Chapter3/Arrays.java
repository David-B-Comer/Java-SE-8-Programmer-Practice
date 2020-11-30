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

     **/
}
