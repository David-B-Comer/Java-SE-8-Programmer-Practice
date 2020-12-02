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

     **/
}
