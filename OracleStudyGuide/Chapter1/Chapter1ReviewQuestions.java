package Chapter1;

public class Chapter1ReviewQuestions {

    /**

    1. Which of the following are valid Java identifiers? (Choose all that apply)

     A. A$B
     B. _helloWorld
     C. true
     D. java.lang
     E. Public
     F. 1980_s


     Answer A, B, E



     2. What is the output of the following program?

     1: public class WaterBottle {
     2: private String brand;
     3: private boolean empty;
     4: public static void main(String[] args) {
     5: WaterBottle wb = new WaterBottle();
     6: System.out.print("Empty = " + wb.empty);
     7: System.out.print(", Brand = " + wb.brand);
     8: } }

     A. Line 6 generates a compiler error.
     B. Line 7 generates a compiler error.
     C. There is no output.
     D. Empty = false, Brand = null
     E. Empty = false, Brand =
     F. Empty = null, Brand = null

     Answer D



     3. Which of the following are true? (Choose all that apply)

     4: short numPets = 5;
     5: int numGrains = 5.6;
     6: String name = "Scruffy";
     7: numPets.length();
     8: numGrains.length();
     9: name.length();

     A. Line 4 generates a compiler error.
     B. Line 5 generates a compiler error.
     C. Line 6 generates a compiler error.
     D. Line 7 generates a compiler error.
     E. Line 8 generates a compiler error.
     F. Line 9 generates a compiler error.
     G. The code compiles as is.


     Answer B, D, E



     4. Given the following class, which of the following is true? (Choose all that apply)

     1: public class Snake {
     2:
     3: public void shed(boolean time) {
     4:
     5: if (time) {
     6:
     7: }
     8: System.out.println(result);
     9:
     10: }
     11: }

     A. If String result = "done"; is inserted on line 2, the code will compile.
     B. If String result = "done"; is inserted on line 4, the code will compile.
     C. If String result = "done"; is inserted on line 6, the code will compile.
     D. If String result = "done"; is inserted on line 9, the code will compile.
     E. None of the above changes will make the code compile.


     Answer A, B



     5. Given the following classes, which of the following can independently replace INSERT
     IMPORTS HERE to make the code compile? (Choose all that apply)

     package aquarium;
     public class Tank { }
     package aquarium.jellies;
     public class Jelly { }
     package visitor;
     INSERT IMPORTS HERE
     public class AquariumVisitor {
     public void admire(Jelly jelly) { } }

     A. import aquarium.*;
     B. import aquarium.*.Jelly;
     C. import aquarium.jellies.Jelly;
     D. import aquarium.jellies.*;
     E. import aquarium.jellies.Jelly.*;
     F. None of these can make the code compile.


    Answer C, D



     6. Given the following classes, what is the maximum number of imports that can be removed
     and have the code still compile?

     package aquarium; public class Water { }
     package aquarium;
     import java.lang.*;
     import java.lang.System;
     import aquarium.Water;
     import aquarium.*;
     public class Tank {
     public void print(Water water) {
     System.out.println(water); } }

     A. 0
     B. 1
     C. 2
     D. 3
     E. 4
     F. Does not compile


    Answer E



     7. Given the following classes, which of the following snippets can be inserted in place of
     INSERT IMPORTS HERE and have the code compile? (Choose all that apply)

     package aquarium;
     public class Water {
     boolean salty = false;
     }
     package aquarium.jellies;
     public class Water {
     boolean salty = true;
     }
     package employee;
     INSERT IMPORTS HERE
     public class WaterFiller {
     Water water;
     }

     A. import aquarium.*;
     B. import aquarium.Water;
     import aquarium.jellies.*;
     C. import aquarium.*;
     import aquarium.jellies.Water;
     D. import aquarium.*;
     import aquarium.jellies.*;
     E. import aquarium.Water;
     import aquarium.jellies.Water;
     F. None of these imports can make the code compile

    Answer A, B, C




     8. Given the following class, which of the following calls print out Blue Jay? (Choose all that
     apply)

     public class BirdDisplay {
     public static void main(String[] name) {
     System.out.println(name[1]);
     } }

     A. java BirdDisplay Sparrow Blue Jay
     B. java BirdDisplay Sparrow "Blue Jay"
     C. java BirdDisplay Blue Jay Sparrow
     D. java BirdDisplay "Blue Jay" Sparrow
     E. java BirdDisplay.class Sparrow "Blue Jay"
     F. java BirdDisplay.class "Blue Jay" Sparrow
     G. Does not compile.


     Answer B



     9. Which of the following legally fill in the blank so you can run the main() method from the
     command line? (Choose all that apply)

     public static void main( )

     A. String[] _names
     B. String[] 123
     C. String abc[]
     D. String _Names[]
     E. String... $n
     F. String names
     G. None of the above


    Answer A, C, D, E



     10. Which of the following are legal entry point methods that can be run from the command
     line? (Choose all that apply)

     A. private static void main(String[] args)
     B. public static final main(String[] args)
     C. public void main(String[] args)
     D. public static void test(String[] args)
     E. public static void main(String[] args)
     F. public static main(String[] args)
     G. None of the above.

    Answer E



     11. Which of the following are true? (Choose all that apply)

     A. An instance variable of type double defaults to null.
     B. An instance variable of type int defaults to null.
     C. An instance variable of type String defaults to null.
     D. An instance variable of type double defaults to 0.0.
     E. An instance variable of type int defaults to 0.0.
     F. An instance variable of type String defaults to 0.0.
     G. None of the above


     Answer C, D



     12. Which of the following are true? (Choose all that apply)

     A. A local variable of type boolean defaults to null.
     B. A local variable of type float defaults to 0.
     C. A local variable of type Object defaults to null.
     D. A local variable of type boolean defaults to false.
     E. A local variable of type boolean defaults to true.
     F. A local variable of type float defaults to 0.0.
     G. None of the above


     Answer G



     13. Which of the following are true? (Choose all that apply)

     A. An instance variable of type boolean defaults to false.
     B. An instance variable of type boolean defaults to true.
     C. An instance variable of type boolean defaults to null.
     D. An instance variable of type int defaults to 0.
     E. An instance variable of type int defaults to 0.0.
     F. An instance variable of type int defaults to null.
     G. None of the above.


     Answer A, D



     14. Given the following class in the file /my/directory/named/A/Bird.java:
     INSERT CODE HERE

     public class Bird { }
     Which of the following replaces INSERT CODE HERE if we compile from /my/directory?
     (Choose all that apply)

     A. package my.directory.named.a;
     B. package my.directory.named.A;
     C. package named.a;
     D. package named.A;
     E. package a;
     F. package A;
     G. Does not compile


     Answer D



     15. Which of the following lines of code compile? (Choose all that apply)

     A. int i1 = 1_234;
     B. double d1 = 1_234_.0;
     C. double d2 = 1_234._0;
     D. double d3 = 1_234.0_;
     E. double d4 = 1_234.0;
     F. None of the above


     Answer A, E



     16. Given the following class, which of the following lines of code can replace INSERT CODE
     HERE to make the code compile? (Choose all that apply)

     public class Price {
     public void admission() {
     INSERT CODE HERE
     System.out.println(amount);
     } }

     A. int amount = 9L;
     B. int amount = 0b101;
     C. int amount = 0xE;
     D. double amount = 0xE;
     E. double amount = 1_2_.0_0;
     F. int amount = 1_2_;
     G. None of the above.


     Answer B, C, D



     17. Which of the following are true? (Choose all that apply)

     public class Bunny {
     public static void main(String[] args) {
     Bunny bun = new Bunny();
     } }

     A. Bunny is a class.
     B. bun is a class.
     C. main is a class.
     D. Bunny is a reference to an object.
     E. bun is a reference to an object.
     F. main is a reference to an object.
     G. None of the above.

     **/
}
