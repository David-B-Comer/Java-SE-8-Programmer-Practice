package Chapter3;

public class TheStringPool {
    /**

     Since strings are everywhere in Java, they use up a lot of memory. In some production applications,
     they can use up 25–40 percent of the memory in the entire program. Java realizes
     that many strings repeat in the program and solves this issue by reusing common ones. The
     string pool, also known as the intern pool, is a location in the Java virtual machine (JVM)
     that collects all these strings.
     The string pool contains literal values that appear in your program. For example,
     “name” is a literal and therefore goes into the string pool. myObject.toString() is a string
     but not a literal, so it does not go into the string pool. Strings not in the string pool are garbage
     collected just like any other object.

     **/
}
