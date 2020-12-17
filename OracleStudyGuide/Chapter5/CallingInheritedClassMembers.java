package Chapter5;

public class CallingInheritedClassMembers {
    /**

     Calling Inherited Class Members
     Java classes may use any public or protected member of the parent class, including methods, primitives, or object references. If the parent class and child class are part of the same
     package, the child class may also use any default members defi ned in the parent class.
     Finally, a child class may never access a private member of the parent class, at least not
     through any direct reference. As you saw in the fi rst example in this chapter, a private
     member age may be accessed indirectly via a public or protected method.
     To reference a member in a parent class, you can just call it directly



     super() vs. super
     As discussed in Chapter 4, this() and this are unrelated in Java. Likewise, super() and
     super are quite different but may be used in the same methods on the exam. The first,
     super(), is a statement that explicitly calls a parent constructor and may only be used in
     the first line of a constructor of a child class. The second, super, is a keyword used to reference
     a member defined in a parent class and may be used throughout the child class.
     The exam may try to trick you by using both super() and super in a constructor.



     Inheriting Methods
     Inheriting a class grants us access to the public and protected members of the parent
     class, but also sets the stage for collisions between methods defi ned in both the parent class
     and the subclass. In this section, we’ll review the rules for method inheritance and how
     Java handles such scenarios.



     Overriding a Method
     What if there is a method defined in both the parent and child class? For example, you may
     want to define a new version of an existing method in a child class that makes use of the
     definition in the parent class. In this case, you can override a method a method by declaring
     a new method with the signature and return type as the method in the parent class. As
     you may recall from Chapter 4, the method signature includes the name and list of input
     parameters.


     When you override a method, you may reference the parent version of the method
     using the super keyword. In this manner, the keywords this and super allow you to select
     between the current and parent version of a method, respectively



     Overriding a method is not without limitations, though. The compiler performs the following checks
     when you override a non-private method:
     1. The method in the child class must have the same signature as the method in the parent
     class.
     2. The method in the child class must be at least as accessible or more accessible than the
     method in the parent class.
     3. The method in the child class may not throw a checked exception that is new or
     broader than the class of any exception thrown in the parent class method.
     4. If the method returns a value, it must be the same or a subclass of the method in the
     parent class, known as covariant return types.

     The first rule of overriding a method is somewhat self-explanatory. If two methods have
     the same name but different signatures, the methods are overloaded, not overridden. As you
     may recall from our discussion of overloaded methods in Chapter 4, the methods are unrelated
     to each other and do not share any properties.

     **/
}
