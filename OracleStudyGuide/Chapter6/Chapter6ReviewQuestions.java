package Chapter6;

public class Chapter6ReviewQuestions {
    /**

    1. Which of the following statements are true? (Choose all that apply)

    A. Runtime exceptions are the same thing as checked exceptions.
    B. Runtime exceptions are the same thing as unchecked exceptions.
    C. You can declare only checked exceptions.
    D. You can declare only unchecked exceptions.
    E. You can handle only Exception subclasses.


     Answer B




     2. Which of the following pairs fill in the blanks to make this code compile? (Choose all that
     apply)

     7: public void ohNo() _____ Exception {
     8: _____________ Exception();
     9: }

     A. On line 7, fill in throw
     B. On line 7, fill in throws
     C. On line 8, fill in throw
     D. On line 8, fill in throw new
     E. On line 8, fill in throws
     F. On line 8, fill in throws new


    Answer B, D






     3. When are you required to use a finally block in a regular try statement (not a try-withresources)?

     A. Never.
     B. When the program code doesn’t terminate on its own.
     C. When there are no catch blocks in a try statement.
     D. When there is exactly one catch block in a try statement.
     E. When there are two or more catch blocks in a try statement.


     Answer C





     4. Which exception will the following throw?

     Object obj = new Integer(3);
     String str = (String) obj;
     System.out.println(str);

     A. ArrayIndexOutOfBoundsException
     B. ClassCastException
     C. IllegalArgumentException
     D. NumberFormatException
     E. None of the above.


     Answer B




     5. Which of the following exceptions are thrown by the JVM? (Choose all that apply)

     A. ArrayIndexOutOfBoundsException
     B. ExceptionInInitializerError
     C. java.io.IOException
     D. NullPointerException
     E. NumberFormatException


     Answer A, B, D




     6. What will happen if you add the statement System.out.println(5 / 0); to a working
     main() method?

     A. It will not compile.
     B. It will not run.
     C. It will run and throw an ArithmeticException.
     D. It will run and throw an IllegalArgumentException.
     E. None of the above.


     Answer C





     7. What is printed besides the stack trace caused by the NullPointerException from line 16?

     1: public class DoSomething {
     2: public void go() {
     3: System.out.print("A");
     4: try {
     5: stop();
     6: } catch (ArithmeticException e) {
     7: System.out.print("B");
     8: } finally {
     9: System.out.print("C");
     10: }
     11: System.out.print("D");
     12: }
     13: public void stop() {
     14: System.out.print("E");
     15: Object x = null;
     16: x.toString();
     17: System.out.print("F");
     18: }
     19: public static void main(String[] args) {
     20: new DoSomething().go();
     21: }
     22: }

     A. AE
     B. AEBCD
     C. AEC
     D. AECD
     E. No output appears other than the stack trace.


     Answer C





     8. What is the output of the following snippet, assuming a and b are both 0?

     3: try {
     4: return a / b;
     5: } catch (RuntimeException e) {
     6: return -1;
     7: } catch (ArithmeticException e) {
     8: return 0;
     9: } finally {
     10: System.out.print("done");
     11: }

     A. -1
     B. 0
     C. done-1
     D. done0
     E. The code does not compile.
     F. An uncaught exception is thrown


     Answer E


     **/
}
