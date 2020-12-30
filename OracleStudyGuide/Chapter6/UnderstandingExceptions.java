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

     **/
}
