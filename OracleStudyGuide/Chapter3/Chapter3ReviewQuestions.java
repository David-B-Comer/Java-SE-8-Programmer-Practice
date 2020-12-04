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


     Answer F




     6. What is the result of the following code?

     public class Lion {
     public void roar(String roar1, StringBuilder roar2) {
     roar1.concat("!!!");
     roar2.append("!!!");
     }
     public static void main(String[] args) {
     String roar1 = "roar";
     StringBuilder roar2 = new StringBuilder("roar");
     new Lion().roar(roar1, roar2);
     System.out.println(roar1 + " " + roar2);
     } }

     A. roar roar
     B. roar roar!!!
     C. roar!!! roar
     D. roar!!! roar!!!
     E. An exception is thrown.
     F. The code does not compile.


     Answer B




     7. Which are the results of the following code? (Choose all that apply)

     String letters = "abcdef";
     System.out.println(letters.length());
     System.out.println(letters.charAt(3));
     System.out.println(letters.charAt(6));

     A. 5
     B. 6
     C. c
     D. d
     E. An exception is thrown.
     F. The code does not compile.


     Answer B, D, E




     8. Which are the results of the following code? (Choose all that apply)

     String numbers = "012345678";
     System.out.println(numbers.substring(1, 3));
     System.out.println(numbers.substring(7, 7));
     System.out.println(numbers.substring(7));

     A. 12
     B. 123
     C. 7
     D. 78
     E. A blank line.
     F. An exception is thrown.
     G. The code does not compile


     Answer A, D, E




     9. What is the result of the following code?

     3: String s = "purr";
     4: s.toUpperCase();
     5: s.trim();
     6: s.substring(1, 3);
     7: s += " two";
     8: System.out.println(s.length());

     A. 2
     B. 4
     C. 8
     D. 10
     E. An exception is thrown.
     F. The code does not compile.


     Answer C





     10. What is the result of the following code? (Choose all that apply)

     13: String a = "";
     14: a += 2;
     15: a += 'c';
     16: a += false;
     17: if ( a == "2cfalse") System.out.println("==");
     18: if ( a.equals("2cfalse")) System.out.println("equals");

     A. Compile error on line 14.
     B. Compile error on line 15.
     C. Compile error on line 16.
     D. Compile error on another line.
     E. ==
     F. equals
     G. An exception is thrown.


     Answer F




     11. What is the result of the following code?

     4: int total = 0;
     5: StringBuilder letters = new StringBuilder("abcdefg");
     6: total += letters.substring(1, 2).length();
     7: total += letters.substring(6, 6).length();
     8: total += letters.substring(6, 5).length();
     9: System.out.println(total);

     A. 1
     B. 2
     C. 3
     D. 7
     E. An exception is thrown.
     F. The code does not compile.


     Answer E




     12. What is the result of the following code? (Choose all that apply)

     StringBuilder numbers = new StringBuilder("0123456789");
     numbers.delete(2, 8);
     numbers.append("-").insert(2, "+");
     System.out.println(numbers);

     A. 01+89–
     B. 012+9–
     C. 012+–9
     D. 0123456789
     E. An exception is thrown.
     F. The code does not compile.


     Answer A




     13. What is the result of the following code?

     StringBuilder b = "rumble";
     b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
     System.out.println(b);

     A. rum
     B. rum4
     C. rumb4
     D. rumble4
     E. An exception is thrown.
     F. The code does not compile.


     Answer F




     14. Which of the following can replace line 4 to print "avaJ"? (Choose all that apply)

     3: StringBuilder puzzle = new StringBuilder("Java");
     4: // INSERT CODE HERE
     5: System.out.println(puzzle);

     A. puzzle.reverse();
     B. puzzle.append("vaJ$").substring(0, 4);
     C. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
     D. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
     E. None of the above.


     Answer A, C




     15. Which of these array declarations is not legal? (Choose all that apply)

     A. int[][] scores = new int[5][];
     B. Object[][][] cubbies = new Object[3][0][5];
     C. String beans[] = new beans[6];
     D. java.util.Date[] dates[] = new java.util.Date[2][];
     E. int[][] types = new int[];
     F. int[][] java = new int[][];


     Answer C, E, F





     16. Which of these compile when replacing line 8? (Choose all that apply)

     7: char[]c = new char[2];
     8: // INSERT CODE HERE

     A. int length = c.capacity;
     B. int length = c.capacity();
     C. int length = c.length;
     D. int length = c.length();
     E. int length = c.size;
     F. int length = c.size();
     G. None of the above.

     **/
}
