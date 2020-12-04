package Chapter3;

public class Chapter3ReviewQuestions {
    /**

     1. What is output by the following code? (Choose all that apply)

     1: public class Fish {
     2: public static void main(String[] args) {
     3: int numFish = 4;
     4: String fishType = "tuna";
     5: String anotherFish = numFish + 1;
     6: System.out.println(anotherFish + " " + fishType);
     7: System.out.println(numFish + " " + 1);
     8: } }

     A. 4 1
     B. 41
     C. 5
     D. 5 tuna
     E. 5tuna
     F. 51tuna
     G. The code does not compile.


     Answer G




     2. Which of the following are output by this code? (Choose all that apply)

     3: String s = "Hello";
     4: String t = new String(s);
     5: if ("Hello".equals(s)) System.out.println("one");
     6: if (t == s) System.out.println("two");
     7: if (t.equals(s)) System.out.println("three");
     8: if ("Hello" == s) System.out.println("four");
     9: if ("Hello" == t) System.out.println("five");

     A. one
     B. two
     C. three
     D. four
     E. five
     F. The code does not compile


     Answer A, C, D




     3. Which are true statements? (Choose all that apply)

     A. An immutable object can be modified.
     B. An immutable object cannot be modified.
     C. An immutable object can be garbage collected.
     D. An immutable object cannot be garbage collected.
     E. String is immutable.
     F. StringBuffer is immutable.
     G. StringBuilder is immutable.


     Answer B, C, E





     4. What is the result of the following code?

     7: StringBuilder sb = new StringBuilder();
     8: sb.append("aaa").insert(1, "bb").insert(4, "ccc");
     9: System.out.println(sb);

     A. abbaaccc
     B. abbaccca
     C. bbaaaccc
     D. bbaaccca
     E. An exception is thrown.
     F. The code does not compile.


     Answer B




     5. What is the result of the following code?

     2: String s1 = "java";
     3: StringBuilder s2 = new StringBuilder("java");
     4: if (s1 == s2)
     5: System.out.print("1");
     6: if (s1.equals(s2))
     7: System.out.print("2");

     A. 1
     B. 2
     C. 12
     D. No output is printed.
     E. An exception is thrown.
     F. The code does not compile.

     **/
}
