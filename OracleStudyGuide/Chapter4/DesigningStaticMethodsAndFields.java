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

     **/
}
