package Chapter3;

public class WrapperClasses {
    /**

     Up to now, we’ve only put String objects in the ArrayList. What happens if we want to
     put primitives in? Each primitive type has a wrapper class, which is an object type that
     corresponds to the primitive.

     Wrapper classes
     Primitive type                         Wrapper class                   Example of constructing
     boolean                                Boolean                         new Boolean(true)
     byte                                   Byte                            new Byte((byte) 1)
     short                                  Short                           new Short((short) 1)
     int                                    Integer                         new Integer(1)
     long                                   Long                            new Long(1)
     float                                  Float                           new Float(1.0)
     double                                 Double                          new Double(1.0)
     char                                   Character                       new Character('c')




     The wrapper classes also have a method that converts back to a primitive. You don’t
     need to know much about the constructors or intValue() type methods for the exam
     because autoboxing has removed the need for them (see the next section). You might
     encounter this syntax on questions that have been on the exam for many years. However,
     you just need to be able to read the code and not look for tricks in it.
     There are also methods for converting a String to a primitive or wrapper class. You do
     need to know these methods. The parse methods, such as parseInt(), return a primitive,
     and the valueOf() method returns a wrapper class. This is easy to remember because the
     name of the returned primitive is in the method name. For example:
     int primitive = Integer.parseInt("123");
     Integer wrapper = Integer.valueOf("123");
     The fi rst line converts a String to an int primitive. The second converts a String to an
     Integer wrapper class. If the String passed in is not valid for the given type, Java throws
     an exception. In these examples, letters and dots are not valid for an integer value:
     int bad1 = Integer.parseInt("a"); // throws NumberFormatException
     Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException
     Before you worry, the exam won’t make you recognize that the method parseInt()
     is used rather than parseInteger(). You simply need to be able to recognize the methods when put in front of you.
     Also, the Character class doesn’t participate in the parse/
     valueOf methods. Since a String is made up of characters, you can just call charAt()
     normally.



     Converting from a String
     Wrapper class                  Converting String to primitive                    Converting String to wrapper class
     Boolean                        Boolean.parseBoolean("true");                     Boolean.valueOf("TRUE");
     Byte                           Byte.parseByte("1");                              Byte.valueOf("2");
     Short                          Short.parseShort("1");                            Short.valueOf("2");
     Integer                        Integer.parseInt("1");                            Integer.valueOf("2");
     Long                           Long.parseLong("1");                              Long.valueOf("2");
     Float                          Float.parseFloat("1");                            Float.valueOf("2.2");
     Double                         Double.parseDouble("1");                          Double.valueOf("2.2");
     Character                      None                                              None





     Autoboxing
     Why won’t you need to be concerned with whether a primitive or wrapper class is returned,
     you ask? Since Java 5, you can just type the primitive value and Java will convert it to the
     relevant wrapper class for you. This is called autoboxing. Let’s look at an example:
     4: List<Double> weights = new ArrayList<>();
     5: weights.add(50.5); // [50.5]
     6: weights.add(new Double(60)); // [50.5, 60.0]
     7: weights.remove(50.5); // [60.0]
     8: double first = weights.get(0); // 60.0
     Line 5 autoboxes the double primitive into a Double object and adds that to the List.
     Line 6 shows that you can still write code the long way and pass in a wrapper object. Line
     7 again autoboxes into the wrapper object and passes it to remove(). Line 8 retrieves the
     Double and unboxes it into a double primitive.
     What do you think happens if you try to unbox a null?
     3: List<Integer> heights = new ArrayList<>();
     4: heights.add(null);
     5: int h = heights.get(0); // NullPointerException
     On line 4, we add a null to the list. This is legal because a null reference can be assigned
     to any reference variable. On line 5, we try to unbox that null to an int primitive. This is
     a problem. Java tries to get the int value of null. Since calling any method on null gives a
     NullPointerException, that is just what we get. Be careful when you see null in relation to
     autoboxing.
     Be careful when autoboxing into Integer. What do you think this code outputs?
     List<Integer> numbers = new ArrayList<>();
     numbers.add(1);
     numbers.add(2);
     numbers.remove(1);
     System.out.println(numbers);
     It actually outputs 1. After adding the two values, the List contains [1, 2]. We then request
     the element with index 1 be removed. That’s right: index 1. Because there’s already a remove()
     method that takes an int parameter, Java calls that method rather than autoboxing. If you
     want to remove the 2, you can write numbers.remove(new Integer(2)) to force wrapper
     class use.





     Converting Between array and List
     You should know how to convert between an array and an ArrayList. Let’s start with
     turning an ArrayList into an array:
     3: List<String> list = new ArrayList<>();
     4: list.add("hawk");
     5: list.add("robin");
     6: Object[] objectArray = list.toArray();
     7: System.out.println(objectArray.length); // 2
     8: String[] stringArray = list.toArray(new String[0]);
     9: System.out.println(stringArray.length); // 2
     Line 6 shows that an ArrayList knows how to convert itself to an array. The only problem is that it defaults to an
     array of class Object. This isn’t usually what you want. Line 8
     specifies the type of the array and does what we actually want. The advantage of specifying
     a size of 0 for the parameter is that Java will create a new array of the proper size for the
     return value. If you like, you can suggest a larger array to be used instead. If the ArrayList
     fi ts in that array, it will be returned. Otherwise, a new one will be created.
     Converting from an array to a List is more interesting. The original array and created
     array backed List are linked. When a change is made to one, it is available in the other. It
     is a fi xed-size list and is also known a backed List because the array changes with it. Pay
     careful attention to the values here:
     20: String[] array = { "hawk", "robin" }; // [hawk, robin]
     21: List<String> list = Arrays.asList(array); // returns fixed size list
     22: System.out.println(list.size()); // 2
     23: list.set(1, "test"); // [hawk, test]
     24: array[0] = "new"; // [new, test]
     25: for (String b : array) System.out.print(b + " "); // new test
     26: list.remove(1); // throws UnsupportedOperation Exception
     Line 21 converts the array to a List. Note that it isn’t the java.util.ArrayList we’ve
     grown used to. It is a fixed-size, backed version of a List. Line 23 is okay because set()
     merely replaces an existing value. It updates both array and list because they point to the
     same data store. Line 24 also changes both array and list. Line 25 shows the array has
     changed to new test. Line 26 throws an exception because we are not allowed to change
     the size of the list.




     A Cool Trick with Varargs
     This topic isn’t on the exam, but merging varargs with ArrayList conversion allows you
     to create an ArrayList in a cool way:
     List<String> list = Arrays.asList("one", "two");
     asList() takes varargs, which let you pass in an array or just type out the String values.
     This is handy when testing because you can easily create and populate a List on one line.




     Sorting an ArrayList is very similar to sorting an array. You just use a different helper class:
     List<Integer> numbers = new ArrayList<>();
     numbers.add(99);
     numbers.add(5);
     numbers.add(81);
     Collections.sort(numbers);
     System.out.println(numbers); [5, 81, 99]
     As you can see, the numbers got sorted, just like you’d expect. Isn’t it nice to have something that works just like you think it will?

     **/
}
