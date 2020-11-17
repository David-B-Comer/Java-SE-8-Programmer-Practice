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


     **/
}
