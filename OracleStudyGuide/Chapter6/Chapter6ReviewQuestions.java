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

     **/
}
