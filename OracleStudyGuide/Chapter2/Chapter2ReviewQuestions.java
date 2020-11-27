package Chapter2;

public class Chapter2ReviewQuestions {

    /**

     1. Which of the following Java operators can be used with boolean variables? (Choose all that
     apply)

     A. ==
     B. +
     C. --
     D. !
     E. %
     F. <=


     Answer A, D




     2. What data type (or types) will allow the following code snippet to compile? (Choose all that
     apply)

     byte x = 5;
     byte y = 10;
     _____ z = x + y;

     A. int
     B. long
     C. boolean
     D. double
     E. short
     F. byte


     Answer A, B, D





     3. What is the output of the following application?

     1: public class CompareValues {
     2: public static void main(String[] args) {
     3: int x = 0;
     4: while(x++ < 10) {}
     5: String message = x > 10 ? "Greater than" : false;
     6: System.out.println(message+","+x);
     7: }
     8: }

     A. Greater than,10
     B. false,10
     C. Greater than,11
     D. false,11
     E. The code will not compile because of line 4.
     F. The code will not compile because of line 5.


     Answer F





     4. What change would allow the following code snippet to compile? (Choose all that apply)

     3: long x = 10;
     4: int y = 2 * x;

     A. No change; it compiles as is.
     B. Cast x on line 4 to int.
     C. Change the data type of x on line 3 to short.
     D. Cast 2 * x on line 4 to int.
     E. Change the data type of y on line 4 to short.
     F. Change the data type of y on line 4 to long.


     Answer B, C, D, F




     5. What is the output of the following code snippet?

     3: java.util.List<Integer> list = new java.util.ArrayList<Integer>();
     4: list.add(10);
     5: list.add(14);
     6: for(int x : list) {
     7: System.out.print(x + ", ");
     8: break;
     9: }

     A. 10, 14,
     B. 10, 14
     C. 10,
     D. The code will not compile because of line 7.
     E. The code will not compile because of line 8.
     F. The code contains an infinite loop and does not terminate.


     Answer C



     6. What is the output of the following code snippet?

     3: int x = 4;
     4: long y = x * 4 - x++;
     5: if(y<10) System.out.println("Too Low");
     6: else System.out.println("Just right");
     7: else System.out.println("Too High");

     A. Too Low
     B. Just Right
     C. Too High
     D. Compiles but throws a NullPointerException.
     E. The code will not compile because of line 6.
     F. The code will not compile because of line 7.

     **/
}
