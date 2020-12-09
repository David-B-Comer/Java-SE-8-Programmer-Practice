package Chapter4;

public class DesigningStaticMethodsAndFields {
    /**

     Designing Static Methods and Fields
     Except for the main() method, we’ve been looking at instance methods. Static methods
     don’t require an instance of the class. They are shared among all users of the class. You can
     think of statics as being a member of the single class object that exist independently of any
     instances of that class.



     Does Each Class Have Its Own Copy of the Code?
     Each class has a copy of the instance variables. There is only one copy of the code for the
     instance methods. Each instance of the class can call it as many times as it would like.
     However, each call of an instance method (or any method) gets space on the stack for
     method parameters and local variables.
     The same thing happens for static methods. There is one copy of the code. Parameters
     and local variables go on the stack.
     Just remember that only data gets its “own copy.” There is no need to duplicate copies of
     the code itself.


     In addition to main() methods, static methods have two main purposes:
     ■ For utility or helper methods that don’t require any object state. Since there is no need
     to access instance variables, having static methods eliminates the need for the caller to
     instantiate the object just to call the method.
     ■ For state that is shared by all instances of a class, like a counter. All instances must
     share the same state. Methods that merely use that state should be static as well.





     Calling a Static Variable or Method
     Usually, accessing a static member is easy. You just put the classname before the method or
     variable and you are done.




     Remember to look at the reference type for a variable when you see a
     static method or variable. The exam creators will try to trick you into thinking a NullPointerException is
     thrown because the variable happens to be null. Don’t be fooled!



     Static vs. Instance
     There’s another way the exam creators will try to trick you regarding static and instance
     members. (Remember that “member” means fi eld or method.) A static member cannot call
     an instance member. This shouldn’t be a surprise since static doesn’t require any instances
     of the class to be around.






     The exam creators like this topic. A static method or instance method can call a static
     method because static methods don’t require an object to use. Only an instance method can
     call another instance method on the same class without using a reference variable, because
     instance methods do require an object. Similar logic applies for the instance and static variables.




     Static vs. instance calls
     Type                   Calling                                     Legal?              How?

     Static method          Another static method or variable           Yes                  Using the classname

     Static method          An instance method or variable              No

     Instance method        A static method or variable                 Yes                 Using the classname or a reference variable

     Instance method        Another instance method or variable         Yes                 Using a reference variable




     Static Variables
     Some static variables are meant to change as the program runs. Counters are a common
     example of this. We want the count to increase over time. Just as with instance variables,
     you can initialize a static variable on the line it is declared:
     public class Initializers {
     private static int counter = 0; // initialization
     }



     Other static variables are meant to never change during the program. This type of variable is known as a constant. It uses the final modifier to ensure the variable never changes.
     static final constants use a different naming convention than other variables. They use
     all uppercase letters with underscores between “words.” For example:
     public class Initializers {
     private static final int NUM_BUCKETS = 45;
     public static void main(String[] args) {
     NUM_BUCKETS = 5; // DOES NOT COMPILE
     } }
     The compiler will make sure that you do not accidentally try to update a final variable.




     Static Initialization
     In Chapter 1, we covered instance initializers that looked like unnamed methods. Just code
     inside braces. Static initializers look similar. They add the static keyword to specify they
     should be run when the class is first used. The static initializer runs when the class is first used.
     The statements in it run and assign any static variables as needed.



     Try to Avoid Static and Instance Initializers
     Using static and instance initializers can make your code much harder to read.
     Everything that could be done in an instance initializer could be done in a constructor instead.
     The constructor approach is easier to read. There is a common case to use a static initializer:
     when you need to initialize a static field and the code to do so requires more than one line. This often occurs
     when you want to initialize a collection like an ArrayList. When you do need to
     use a static initializer, put all the static initialization in the same block. That way,
     the order is obvious.

     **/
}
