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

     **/
}
