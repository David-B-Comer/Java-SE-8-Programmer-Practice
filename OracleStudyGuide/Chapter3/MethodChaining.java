package Chapter3;

public class MethodChaining {
    /**

     It is common to call multiple methods on the same String, as shown here:
     String start = "AniMaL ";
     String trimmed = start.trim(); // "AniMaL"
     String lowercase = trimmed.toLowerCase(); // "animal"
     String result = lowercase.replace('a', 'A'); // "Animal"
     System.out.println(result);
     This is just a series of String methods. Each time one is called, the returned value is put
     in a new variable. There are four String values along the way, and Animal is output.
     However, on the exam there is a tendency to cram as much code as possible into a small
     space. You’ll see code using a technique called method chaining. Here’s an example:
     String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
     System.out.println(result);
     This code is equivalent to the previous example. It also creates four String objects and
     outputs Animal. To read code that uses method chaining, start at the left and evaluate the
     first method. Then call the next method on the returned value of the fi rst method. Keep
     going until you get to the semicolon.
     Remember that String is immutable. What do you think the result of this code is?
     5: String a = "abc";
     6: String b = a.toUpperCase();
     7: b = b.replace("B", "2").replace('C', '3');
     8: System.out.println("a=" + a);
     9: System.out.println("b=" + b);
     On line 5, we set a to point to "abc" and never pointed a to anything else. Since we are
     dealing with an immutable object, none of the code on lines 6 or 7 changes a.
     b is a little trickier. Line 6 has b pointing to "ABC", which is straightforward. On line 7,
     we have method chaining. First, “ABC".replace("B", "2") is called. This returns "A2C".
     Next, "A2C".replace("'C', '3') is called. This returns "A23". Finally, b changes to point
     to this returned String. When line 9 executes, b is "A23".

     **/
}
