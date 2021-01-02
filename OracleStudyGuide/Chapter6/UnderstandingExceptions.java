package Chapter6;

public class UnderstandingExceptions {
    /**

     Understanding Exceptions
     A program can fail for just about any reason. Here are just a few possibilities:
     ■ The code tries to connect to a website, but the Internet connection is down.
     ■ You made a coding mistake and tried to access an invalid index in an array.
     ■ One method calls another with a value that the method doesn’t support.
     As you can see, some of these are coding mistakes. Others are completely beyond your
     control. Your program can’t help it if the Internet connection goes down. What it can do is
     deal with the situation.
     First, we’ll look at the role of exceptions. Then we’ll cover the various types of exceptions,
     followed by an explanation of how to throw an exception in Java.




     The Role of Exceptions
     An exception is Java’s way of saying, “I give up. I don’t know what to do right now. You
     deal with it.” When you write a method, you can either deal with the exception or make it
     the calling code’s problem.
     As an example, think of Java as a child who visits the zoo. The happy path is when
     nothing goes wrong. The child continues to look at the animals until the program nicely
     ends. Nothing went wrong and there were no exceptions to deal with.
     This child’s younger sister doesn’t experience the happy path. In all the excitement she
     trips and falls. Luckily, it isn’t a bad fall. The little girl gets up and proceeds to look at
     more animals. She has handled the issue all by herself. Unfortunately, she falls again later
     in the day and starts crying. This time, she has declared she needs help by crying. The
     story ends well. Her daddy rubs her knee and gives her a hug. Then they go back to seeing
     more animals and enjoy the rest of the day.
     These are the two approaches Java uses when dealing with exceptions. A method can
     handle the exception case itself or make it the caller’s responsibility. You saw both in the
     trip to the zoo. Exceptions can and do occur all the time, even in solid program code. In our example,
     toddlers falling is a fact of life. When you write more advanced programs, you’ll need to
     deal with failures in accessing fi les, networks, and outside services. On the OCA exam,
     exceptions deal largely with mistakes in programs. For example, a program might try to
     access an invalid position in an array. The key point to remember is that exceptions alter
     the program flow.






     Return Codes vs. Exceptions
     Exceptions are used when “something goes wrong.” However, the word “wrong” is
     subjective. The following code returns –1 instead of throwing an exception if no match is
     found:
     public int indexOf(String[] names, String name) {
     for (int i = 0; i < names.length; i++) {
     if (names[i].equals(name)) { return i; }
     }
     return -1;
     }
     This approach is common when writing a method that does a search. For example,
     imagine being asked to find the name Joe in the array. It is perfectly reasonable that
     Joe might not appear in the array. When this happens, a special value is returned. An
     exception should be reserved for exceptional conditions like names being null.
     In general, try to avoid return codes. Return codes are commonly used in searches, so
     programmers are expecting them. In other methods, you will take your callers by surprise
     by returning a special value. An exception forces the program to deal with them or end
     with the exception if left unhandled, whereas a return code could be accidentally ignored
     and cause problems later in the program. An exception is like shouting, “Deal with me!”





     Understanding Exception Types
     As we’ve explained, an exception is an event that alters program fl ow. Java has a Throwable
     superclass for all objects that represent these events. Not all of them have the word exception
     in their classname, which can be confusing.




                    Categories of exception

                    java.lang.Object
                            ^
                    java.lang.Throwable
            ^                              ^
     java.lang.Exception            java.lang.Error
                            ^
                    java.lang.RuntimeException





     Error means something went so horribly wrong that your program should not attempt to
     recover from it. For example, the disk drive “disappeared.” These are abnormal conditions
     that you aren’t likely to encounter.
     A runtime exception is defined as the RuntimeException class and its subclasses. Runtime
     exceptions tend to be unexpected but not necessarily fatal. For example, accessing an invalid
     array index is unexpected. Runtime exceptions are also known as unchecked exceptions.
     A checked exception includes Exception and all subclasses that do not extend
     RuntimeException. Checked exceptions tend to be more anticipated—for example, trying
     to read a file that doesn’t exist.
     Checked exceptions? What are we checking? Java has a rule called the handle or declare
     rule. For checked exceptions, Java requires the code to either handle them or declare them
     in the method signature.





     Runtime vs. at the Time the Program is Run
     A runtime (unchecked) exception is a specific type of exception. All exceptions occur at the
     time that the program is run. (The alternative is compile time, which would be a compiler
     error.) People don’t refer to them as run time exceptions because that would be too easy to
     confuse with runtime! When you see runtime, it means unchecked.




     Notice that you’re using two different keywords here. throw tells Java that you want to
     throw an Exception. throws simply declares that the method might throw an Exception. It
     also might not. You will see the throws keyword more later in the chapter.
     Because checked exceptions tend to be anticipated, Java enforces that the programmer do
     something to show the exception was thought about. Maybe it was handled in the method.
     Or maybe the method declares that it can’t handle the exception and someone else should.
     An example of a runtime exception is a NullPointerException, which happens when
     you try to call a member on a null reference. This can occur in any method. If you had to
     declare runtime exceptions everywhere, every single method would have that clutter!




     Checked vs. Unchecked (Runtime) Exceptions
     In the past, developers used checked exceptions more often than they do now. According to Oracle,
     they are intended for issues a programmer “might reasonably be expected
     to recover from.” Then developers started writing code where a chain of methods kept
     declaring the same exception and nobody actually handled it. Some libraries started
     using runtime exceptions for issues a programmer might reasonably be expected to
     recover from. Many programmers can hold a debate with you on which approach is better.
     For the OCA exam, you need to know the rules for how checked versus unchecked
     exceptions function. You don’t have to decide philosophically whether an exception
     should be checked or unchecked.






     Throwing an Exception
     Any Java code can throw an exception; this includes code you write. For the OCP exam,
     you’ll learn how to create your own exception classes. The OCA exam is limited to
     exceptions that someone else has created. Most likely, they will be exceptions that are
     provided with Java. You might encounter an exception that was made up for the exam.
     This is fine. The question will make it obvious that these are exceptions by having the
     classname end with exception. For example, “MyMadeUpException” is clearly an
     exception.
     On the exam, you will see two types of code that result in an exception. The first is code
     that’s wrong. For example:
     String[] animals = new String[0];
     System.out.println(animals[0]);
     This code throws an ArrayIndexOutOfBoundsException. That means questions about
     exceptions can be hidden in questions that appear to be about something else.
     The second way for code to result in an exception is to explicitly request Java to throw
     one. Java lets you write statements like these:
     throw new Exception();
     throw new Exception("Ow! I fell.");
     throw new RuntimeException();
     throw new RuntimeException("Ow! I fell.");
     The throw keyword tells Java you want some other part of the code to deal with the
     exception. This is the same as the young girl crying for her daddy. Someone else needs to
     figure out what to do about the exception.
     When creating an exception, you can usually pass a String parameter with a message or
     you can pass no parameters and use the defaults. We say usually because this is a convention.
     Someone could create an exception class that does not have a constructor that takes
     a message. The first two examples create a new object of type Exception and throw it.
     The last two show that the code looks the same regardless of which type of exception you
     throw.






     Types of exceptions

     Type                   How to recognize                    Okay for program to catch?      Is program required to handle or declare?

     Runtime exception      Subclass of RuntimeException        Yes                             No

     Checked exception      Subclass of Exception but           Yes                             Yes
                            not subclass of RuntimeException

     Error                  Subclass of Error                   No                              No





     Using a try Statement
     Now that you know what exceptions are, let’s explore how to handle them. Java uses a try
     statement to separate the logic that might throw an exception from the logic to handle that
     exception.



     The code in the try block is run normally. If any of the statements throw an exception
     that can be caught by the exception type listed in the catch block, the try block stops running and execution goes to the catch statement. If none of the statements in the try block
     throw an exception that can be caught, the catch clause is not run.
     You probably noticed the words “block” and “clause” used interchangeably. The
     exam does this as well, so we are getting you used to it. Both are correct. “Block” is
     correct because there are braces present. “Clause” is correct because they are part of a
     try statement.
     There aren’t a ton of syntax rules here. The curly braces are required for the try and
     catch blocks.



     Adding a finally Block
     The try statement also lets you run code at the end with a fi nally clause regardless of
     whether an exception is thrown.
     There are two paths through code with both a catch and a finally. If an exception
     is thrown, the finally block is run after the catch block. If no exception is thrown, the
     finally block is run after the try block completes.


     On the OCA exam, a try statement must have catch and/or finally.
     Having both is fine. Having neither is a problem. On the OCP exam, you’ll
     learn about a special syntax for a try statement called try-with-resources
     that allows neither a catch nor a finally block. On the OCA exam, you get
     to assume a try statement is just a regular try statement and not a try-with-resources statement.




     Catching Various Types of Exceptions
     So far, you have been catching only one type of exception. Now let’s see what happens
     when different types of exceptions can be thrown from the same method.
     Creating your own exceptions is not on the OCA exam, but it is on the OCP exam.
     However, the OCA exam can defi ne basic exceptions to show you the hierarchy. You only
     need to do two things with this information. First, you must be able to recognize if the
     exception is a checked or an unchecked exception. Second, you need to determine if any of
     the exceptions are subclasses of the others.
     class AnimalsOutForAWalk extends RuntimeException { }
     class ExhibitClosed extends RuntimeException { }
     class ExhibitClosedForLunch extends ExhibitClosed { }
     In this example, there are three custom exceptions. All are unchecked exceptions
     because they directly or indirectly extend RuntimeException. Now we catch both types of
     exceptions and handle them by printing out the appropriate message:
     public void visitPorcupine() {
     try {
     seeAnimal();
     } catch (AnimalsOutForAWalk e) {// first catch block
     System.out.print("try back later");
     } catch (ExhibitClosed e) {// second catch block
     System.out.print("not today");
     }
     }





     Recognizing Common Exception Types
     You need to recognize three types of exceptions for the OCA exam: runtime exceptions,
     checked exceptions, and errors. We’ll look at common examples of each type. For the
     exam, you’ll need to recognize which type of an exception it is and whether it’s thrown by
     the JVM or a programmer. So you can recognize them, we’ll show you some code examples
     for those exceptions.



     Runtime Exceptions
     Runtime exceptions extend RuntimeException. They don’t have to be handled or declared.
     They can be thrown by the programmer or by the JVM. Common runtime exceptions
     include the following:

     ArithmeticException Thrown by the JVM when code attempts to divide by zero

     ArrayIndexOutOfBoundsException Thrown by the JVM when code uses an illegal
     index to access an array

     ClassCastException Thrown by the JVM when an attempt is made to cast an exception to a subclass of which it is not an instance

     IllegalArgumentException Thrown by the programmer to indicate that a method has
     been passed an illegal or inappropriate argument

     NullPointerException Thrown by the JVM when there is a null reference where an
     object is required

     NumberFormatException Thrown by the programmer when an attempt is made to convert a string
     to a numeric type but the string doesn’t have an appropriate format





     ArithmeticException

     Trying to divide an int by zero gives an undefined result. When this occurs, the JVM will
     throw an ArithmeticException:
     int answer = 11 / 0;
     Running this code results in the following output:
     Exception in thread "main" java.lang.ArithmeticException: / by zero
     Java doesn’t spell out the word “divide.” That’s okay, though, because we know that / is
     the division operator and that Java is trying to tell us division by zero occurred.
     The thread "main" is telling us the code was called directly or indirectly from a program
     with a main method. On the OCA exam, this is all the output we will see. Next comes the
     name of the exception, followed by extra information (if any) that goes with the exception.



     ArrayIndexOutOfBoundsException

     You know by now that array indexes start with 0 and go up to 1 less than the length of the
     array—which means this code will throw an ArrayIndexOutOfBoundsException:
     int[] countsOfMoose = new int[3];
     System.out.println(countsOfMoose[-1]);
     This is a problem because there’s no such thing as a negative array index. Running this
     code yields the following output:
     Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
     At least Java tells us what index was invalid. Can you see what’s wrong with this one?
     int total = 0;
     int[] countsOfMoose = new int[3];
     for (int i = 0; i <= countsOfMoose.length; i++)
     total += countsOfMoose[i];
     The problem is that the for loop should have < instead of <=. On the fi nal iteration of
     the loop, Java tries to call countsOfMoose[3], which is invalid. The array includes only
     three elements, making 2 the largest possible index. The output looks like this:
     Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3




     ClassCastException

     Java tries to protect you from impossible casts. This code doesn’t compile because Integer
     is not a subclass of String:
     String type = "moose";
     Integer number = (Integer) type; // DOES NOT COMPILE
     More complicated code thwarts Java’s attempts to protect you. When the cast fails at
     runtime, Java will throw a ClassCastException:
     String type = "moose";
     Object obj = type;
     Integer number = (Integer) obj;
     The compiler sees a cast from Object to Integer. This could be okay. The compiler
     doesn’t realize there’s a String in that Object. When the code runs, it yields the following
     output:
     Exception in thread "main" java.lang.ClassCastException: java.lang.String
     cannot be cast to java.lang.Integer
     Java tells us both types that were involved in the problem, making it apparent what’s
     wrong.





     IllegalArgumentException

     IllegalArgumentException is a way for your program to protect itself. We first saw the
     following setter method in the Swan class in Chapter 4, “Methods and Encapsulation.”
     6: public void setNumberEggs(int numberEggs) {// setter
     7: if (numberEggs >= 0) // guard condition
     8: this.numberEggs = numberEggs;
     9: }
     This code works, but we don’t really want to ignore the caller’s request when they tell
     us a Swan has –2 eggs. We want to tell the caller that something is wrong—preferably in a
     very obvious way that the caller can’t ignore so that the programmer will fix the problem.
     Exceptions are an efficient way to do this. Seeing the code end with an exception is a great
     reminder that something is wrong:
     public static void setNumberEggs(int numberEggs) {
     if (numberEggs < 0)
     throw new IllegalArgumentException(
     "# eggs must not be negative");
     this.numberEggs = numberEggs;
     }
     The program throws an exception when it’s not happy with the parameter values. The
     output looks like this:
     Exception in thread "main" java.lang.IllegalArgumentException: # eggs must not
     be negative
     Clearly this is a problem that must be fixed if the programmer wants the program to do
     anything useful.




     NullPointerException

     Instance variables and methods must be called on a non-null reference. If the reference is
     null, the JVM will throw a NullPointerException. It’s usually subtle, such as this example,
     which checks whether you remember instance variable references default to null.
     String name;
     public void printLength() throws NullPointerException {
     System.out.println(name.length());
     }
     Running this code results in this output:
     Exception in thread "main" java.lang.NullPointerException





     NumberFormatException

     Java provides methods to convert strings to numbers. When these are passed
     an invalid value, they throw a NumberFormatException. The idea is similar to
     IllegalArgumentException. Since this is a common problem, Java gives it a separate class.
     In fact, NumberFormatException is a subclass of IllegalArgumentException. Here’s an
     example of trying to convert something non-numeric into an int:
     Integer.parseInt("abc");
     The output looks like this:
     Exception in thread "main" java.lang.NumberFormatException: For input string:
     "abc"



     Checked Exceptions

     Checked exceptions have Exception in their hierarchy but not RuntimeException. They
     must be handled or declared. They can be thrown by the programmer or by the JVM.
     Common runtime exceptions include the following:
     FileNotFoundException Thrown programmatically when code tries to reference a fi le
     that does not exist
     IOException Thrown programmatically when there’s a problem reading or writing a fi le
     For the OCA exam, you only need to know that these are checked exceptions. Also keep
     in mind that FileNotFoundException is a subclass of IOException, although the exam will
     remind you of that fact if it comes up. You’ll see these two exceptions in more detail on the
     OCP exam.


     **/
}
