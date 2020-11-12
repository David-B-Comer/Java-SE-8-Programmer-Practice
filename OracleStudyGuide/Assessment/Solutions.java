package Assessment;

/**

Question 1

What is the result of the following class? (Choose all that apply)
        public class _C {
        private static int $;
        public static void main(String[] main) {
        String a_b;
        System.out.print($);
        System.out.print(a_b);
        } }

        A. Compiler error on line 1.
        B. Compiler error on line 2.
        C. Compiler error on line 4.
        D. Compiler error on line 5.
        E. Compiler error on line 6.
        F. 0null
        G. nullnull

 Answer E



 Question 2

 What is the result of the following code?
 String s1 = "Java";
 String s2 = "Java";
 StringBuilder sb1 = new StringBuilder();
 sb1.append("Ja").append("va");
 System.out.println(s1 == s2);
 System.out.println(s1.equals(s2));
 System.out.println(sb1.toString() == s1);
 System.out.println(sb1.toString().equals(s1));

 A. true is printed out exactly once.
 B. true is printed out exactly twice.
 C. true is printed out exactly three times.
 D. true is printed out exactly four times.
 E. The code does not compile.

 Answer C



 Question 3

 What is the output of the following code? (Choose all that apply)
 1: interface HasTail { int getTailLength(); }
 2: abstract class Puma implements HasTail {
 3: protected int getTailLength() {return 4;}
 4: }
 5: public class Cougar extends Puma {
 xxxii Introduction
 fl ast.indd 1½ 4/2014 Page xxxii
 6: public static void main(String[] args) {
 7: Puma puma = new Puma();
 8: System.out.println(puma.getTailLength());
 9: }
 10:
 11: public int getTailLength(int length) {return 2;}
 12: }


 A. 2
 B. 4
 C. The code will not compile because of line 3.
 D. The code will not compile because of line 5.
 E. The code will not compile because of line 7.
 F. The code will not compile because of line 11.
 G. The output cannot be determined from the code provided.

 **/

public class Solutions {
}
