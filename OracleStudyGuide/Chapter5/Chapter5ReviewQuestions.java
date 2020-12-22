package Chapter5;

public class Chapter5ReviewQuestions {
/**
    1. What modifiers are implicitly applied to all interface methods? (Choose all that apply)

    A. protected
    B. public
    C. static
    D. void
    E. abstract
    F. default


    Answer B





    2. What is the output of the following code?

    1: class Mammal {
    2: public Mammal(int age) {
    3: System.out.print("Mammal");
    4: }
    5: }
    6: public class Platypus extends Mammal {
    7: public Platypus() {
    8: System.out.print("Platypus");
    9: }
    10: public static void main(String[] args) {
    11: new Mammal(5);
    12: }
    13: }

    A. Platypus
    B. Mammal
    C. PlatypusMammal
    D. MammalPlatypus
    E. The code will not compile because of line 8.
    F. The code will not compile because of line 11.




    Answer E







    3. Which of the following statements can be inserted in the blank line so that the code will
    compile successfully? (Choose all that apply)

    public interface CanHop {}
    public class Frog implements CanHop {
    public static void main(String[] args) {
    _________ frog = new TurtleFrog();
    }
    }
    public class BrazilianHornedFrog extends Frog {}
    public class TurtleFrog extends Frog {}

    A. Frog
    B. TurtleFrog
    C. BrazilianHornedFrog
    D. CanHop
    E. Object
    F. Long


    Answer A, B, D, E






    4. Which statement(s) are correct about the following code? (Choose all that apply)

    public class Rodent {
    protected static Integer chew() throws Exception {
    System.out.println("Rodent is chewing");
    return 1;
    }
    }
    public class Beaver extends Rodent {
    public Number chew() throws RuntimeException {
    System.out.println("Beaver is chewing on wood");
    return 2;
    }
    }

    A. It will compile without issue.
    B. It fails to compile because the type of the exception the method throws is a subclass of
    the type of exception the parent method throws.
    C. It fails to compile because the return types are not covariant.
    D. It fails to compile because the method is protected in the parent class and public in
    the subclass.
    E. It fails to compile because of a static modifier mismatch between the two methods.


    Answer C, E





    5. Which of the following may only be hidden and not overridden? (Choose all that apply)

    A. private instance methods
    B. protected instance methods
    C. public instance methods
    D. static methods
    E. public variables
    F. private variables


    Answer A, D, E, F

 **/
}
