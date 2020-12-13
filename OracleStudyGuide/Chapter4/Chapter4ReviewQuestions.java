package Chapter4;

public class Chapter4ReviewQuestions {
    /**

     1. Which of the following can fill in the blank in this code to make it compile? (Choose all
     that apply)

     public class Ant {
     _____ void method() { }
     }

     A. default
     B. final
     C. private
     D. Public
     E. String
     F. zzz:


     Answer B, C





     2. Which of the following compile? (Choose all that apply)

     A. final static void method4() { }
     B. public final int void method() { }
     C. private void int method() { }
     D. static final void method3() { }
     E. void final method() {}
     F. void public method() { }


     Answer A, D





     3. Which of the following methods compile? (Choose all that apply)

     A. public void methodA() { return;}
     B. public void methodB() { return null;}
     C. public void methodD() {}
     D. public int methodD() { return 9;}
     E. public int methodE() { return 9.0;}
     F. public int methodF() { return;}
     G. public int methodG() { return null;}


     Answer A, C, D





     4. Which of the following compile? (Choose all that apply)

     A. public void moreA(int... nums) {}
     B. public void moreB(String values, int... nums) {}
     C. public void moreC(int... nums, String values) {}
     D. public void moreD(String... values, int... nums) {}
     E. public void moreE(String[] values, ...int nums) {}
     F. public void moreF(String... values, int[] nums) {}
     G. public void moreG(String[] values, int[] nums) {}


     Answer A, B, G





     5. Given the following method, which of the method calls return 2? (Choose all that apply)

     public int howMany(boolean b, boolean... b2) {
     return b2.length;
     }

     A. howMany();
     B. howMany(true);
     C. howMany(true, true);
     D. howMany(true, true, true);
     E. howMany(true, {true});
     F. howMany(true, {true, true});
     G. howMany(true, new boolean[2]);


     Answer D, G




     6. Which of the following are true? (Choose all that apply)

     A. Package private access is more lenient than protected access.
     B. A public class that has private fields and package private methods is not visible to
     classes outside the package.
     C. You can use access modifiers so only some of the classes in a package see a particular
     package private class.
     D. You can use access modifiers to allow read access to all methods, but not any instance
     variables.
     E. You can use access modifiers to restrict read access to all classes that begin with the
     word Test.


     Answer D





     7. Given the following my.school.ClassRoom and my.city.School class definitions, which
     line numbers in main() generate a compiler error? (Choose all that apply)

     1: package my.school;
     2: public class Classroom {
     3: private int roomNumber;
     4: protected String teacherName;
     5: static int globalKey = 54321;
     6: public int floor = 3;
     7: Classroom(int r, String t) {
     8: roomNumber = r;
     9: teacherName = t; } }

     1: package my.city;
     2: import my.school.*;
     3: public class School {
     4: public static void main(String[] args) {
     5: System.out.println(Classroom.globalKey);
     6: Classroom room = new Classroom(101, ""Mrs. Anderson");
     7: System.out.println(room.roomNumber);
     8: System.out.println(room.floor);
     9: System.out.println(room.teacherName); } }

     A. None, the code compiles fine.
     B. Line 5
     C. Line 6
     D. Line 7
     E. Line 8
     F. Line 9


     Answer B, C, D, F





     8. Which of the following are true? (Choose all that apply)

     A. Encapsulation uses package private instance variables.
     B. Encapsulation uses private instance variables.
     C. Encapsulation allows setters.
     D. Immutability uses package private instance variables.
     E. Immutability uses private instance variables.
     F. Immutability allows setters.


     Answer B, C, E





     9. Which are methods using JavaBeans naming conventions for accessors and mutators?
     (Choose all that apply)

     A. public boolean getCanSwim() { return canSwim;}
     B. public boolean canSwim() { return numberWings;}
     C. public int getNumWings() { return numberWings;}
     D. public int numWings() { return numberWings;}
     E. public void setCanSwim(boolean b) { canSwim = b;}


     Answer C, E




     10. What is the output of the following code?

     1: package rope;
     2: public class Rope {
     3: public static int LENGTH = 5;
     4: static {
     5: LENGTH = 10;
     6: }
     7: public static void swing() {
     8: System.out.print("swing ");
     9: }
     10: }

     1: import rope.*;
     2: import static rope.Rope.*;
     3: public class Chimp {
     4: public static void main(String[] args) {
     5: Rope.swing();
     6: new Rope().swing();
     7: System.out.println(LENGTH);
     8: }
     9: }

     A. swing swing 5
     B. swing swing 10
     C. Compiler error on line 2 of Chimp.
     D. Compiler error on line 5 of Chimp.
     E. Compiler error on line 6 of Chimp.
     F. Compiler error on line 7 of Chimp.


     Answer B





     11. Which are true of the following code? (Choose all that apply)

     1: public class Rope {
     2: public static void swing() {
     3: System.out.print("swing ");
     4: }
     5: public void climb() {
     6: System.out.println("climb ");
     7: }
     8: public static void play() {
     9: swing();
     10: climb();
     11: }
     12: public static void main(String[] args) {
     13: Rope rope = new Rope();
     14: rope.play();
     15: Rope rope2 = null;
     16: rope2.play();
     17: }
     18: }

     A. The code compiles as is.
     B. There is exactly one compiler error in the code.
     C. There are exactly two compiler errors in the code.
     D. If the lines with compiler errors are removed, the output is climb climb.
     E. If the lines with compiler errors are removed, the output is swing swing.
     F. If the lines with compile errors are removed, the code throws a NullPointerException.


     Answer B, E






     12. What is the output of the following code?

     import rope.*;
     import static rope.Rope.*;
     public class RopeSwing {
     private static Rope rope1 = new Rope();
     private static Rope rope2 = new Rope();
     {
     System.out.println(rope1.length);
     }
     public static void main(String[] args) {
     rope1.length = 2;
     rope2.length = 8;
     System.out.println(rope1.length);
     }
     }
     package rope;
     public class Rope {
     public static int length = 0;
     }

     A. 02
     B. 08
     C. 2
     D. 8
     E. The code does not compile.
     F. An exception is thrown.


     Answer D






     13. How many compiler errors are in the following code?

     1: public class RopeSwing {
     2: private static final String leftRope;
     3: private static final String rightRope;
     4: private static final String bench;
     5: private static final String name = "name";
     6: static {
     7: leftRope = "left";
     8: rightRope = "right";
     9: }
     10: static {
     11: name = "name";
     12: rightRope = "right";
     13: }
     14: public static void main(String[] args) {
     15: bench = "bench";
     16: }
     17: }

     A. 0
     B. 1
     C. 2
     D. 3
     E. 4
     F. 5


     Answer E






     14. Which of the following can replace line 2 to make this code compile? (Choose
     all that apply)

     1: import java.util.*;
     2: // INSERT CODE HERE
     3: public class Imports {
     4: public void method(ArrayList<String> list) {
     5: sort(list);
     6: }
     7: }

     A. import static java.util.Collections;
     B. import static java.util.Collections.*;
     C. import static java.util.Collections.sort(ArrayList<String>);
     D. static import java.util.Collections;
     E. static import java.util.Collections.*;
     F. static import java.util.Collections.sort(ArrayList<String>);


     Answer B




     15. What is the result of the following statements?

     1: public class Test {
     2: public void print(byte x) {
     3: System.out.print("byte");
     4: }
     5: public void print(int x) {
     6: System.out.print("int");
     7: }
     8: public void print(float x) {
     9: System.out.print("float");
     10: }
     11: public void print(Object x) {
     12: System.out.print("Object");
     13: }
     14: public static void main(String[] args) {
     15: Test t = new Test();
     16: short s = 123;
     17: t.print(s);
     18: t.print(true);
     19: t.print(6.789);
     20: }
     21: }

     A. bytefloatObject
     B. intfloatObject
     C. byteObjectfloat
     D. intObjectfloat
     E. intObjectObject
     F. byteObjectObject


     Answer E





     16. What is the result of the following program?

     1: public class Squares {
     2: public static long square(int x) {
     3: long y = x * (long) x;
     4: x = -1;
     5: return y;
     6: }
     7: public static void main(String[] args) {
     8: int value = 9;
     9: long result = square(value);
     10: System.out.println(value);
     11: } }

     A. -1
     B. 9
     C. 81
     D. Compiler error on line 9.
     E. Compiler error on a different line.

     **/
}
