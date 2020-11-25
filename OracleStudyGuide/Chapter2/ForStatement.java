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




     3. Redeclaring a Variable in the Initialization Block
     int x = 0;
     for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
     System.out.print(x + " ");
     }


     This example looks similar to the previous one, but it does not compile because of the initialization block.
     The difference is that x is repeated in the initialization block after already
     being declared before the loop, resulting in the compiler stopping because of a duplicate
     variable declaration. We can fi x this loop by changing the declaration of x and y as follows:
     int x = 0;
     long y = 10;
     for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
     System.out.print(x + " ");
     }
     Note that this variation will now compile because the initialization block simply assigns a
     value to x and does not declare it.




     4. Using Incompatible Data Types in the Initialization Block
     for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
     System.out.print(x + " ");
     }


     This example also looks a lot like our second example, but like the third example will not
     compile, although this time for a different reason. The variables in the initialization block
     must all be of the same type. In the fi rst example, y and z were both long, so the code compiled without issue,
     but in this example they have differing types, so the code will not compile.

     **/
}
