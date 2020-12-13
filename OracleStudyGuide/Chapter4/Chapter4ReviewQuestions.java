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

     **/
}
