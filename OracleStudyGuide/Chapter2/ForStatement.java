package Chapter2;

public class ForStatement {
    /**

     A basic for loop has the same conditional boolean expression and statement, or block of
     statements, as the other loops you have seen, as well as two new sections: an initialization
     block and an update statement.

     Variables declared in the initialization block of a for loop have limited scope and
     are only accessible within the for loop. Be wary of any exam questions in which a variable declared within the initialization block of a for loop is available outside the loop.
     Alternatively, variables declared before the for loop and assigned a value in the initialization block may be used outside the for loop because their scope precedes the for loop
     creation.


     1. Creating an Infinite Loop
     for( ; ; ) {
     System.out.println("Hello World");
     }


     2. Adding Multiple Terms to the for Statement
     int x = 0;
     for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
     System.out.print(y + " ");
     }
     System.out.print(x);

     This code demonstrates three variations of the for loop you may not have seen. First, you
     can declare a variable, such as x in this example, before the loop begins and use it after it
     completes. Second, your initialization block, boolean expression, and update statements
     can include extra variables that may not reference each other. For example, z is defi ned in
     the initialization block and is never used. Finally, the update statement can modify multiple
     variables.

     **/
}
