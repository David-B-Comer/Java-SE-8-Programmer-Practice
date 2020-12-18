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


     Overloading vs. Overriding
     Overloading a method and overriding a method are similar in that they both involve
     redefining a method using the same name. They differ in that an overloaded method will
     use a different signature than an overridden method. This distinction allows overloaded
     methods a great deal more freedom in syntax than an overridden method would have.



     Redeclaring private Methods
     The previous section defined the behavior if you override a public or protected method in
     the class. Now let’s expand our discussion to private methods. In Java, it is not possible to
     override a private method in a parent class since the parent method is not accessible from
     the child class. Just because a child class doesn’t have access to the parent method, doesn’t
     mean the child class can’t define its own version of the method. It just means, strictly speaking,
     that the new method is not an overridden version of the parent class’s method.
     Java permits you to redeclare a new method in the child class with the same or modified signature
     as the method in the parent class. This method in the child class is a separate
     and independent method, unrelated to the parent version’s method, so none of the rules for
     overriding methods are invoked.




     Hiding Static Methods
     A hidden method occurs when a child class defines a static method with the same name
     and signature as a static method defined in a parent class. Method hiding is similar but
     not exactly the same as method overriding. First, the four previous rules for overriding a
     method must be followed when a method is hidden. In addition, a new rule is added for
     hiding a method, namely that the usage of the static keyword must be the same between
     parent and child classes. The following list summarizes the five rules for hiding a method:
     1. The method in the child class must have the same signature as the method in the parent
     class.
     2. The method in the child class must be at least as accessible or more accessible than the
     method in the parent class.
     3. The method in the child class may not throw a checked exception that is new or
     broader than the class of any exception thrown in the parent class method.
     4. If the method returns a value, it must be the same or a subclass of the method in the
     parent class, known as covariant return types.
     5. The method defined in the child class must be marked as static if it is marked as
     static in the parent class (method hiding). Likewise, the method must not be marked
     as static in the child class if it is not marked as static in the parent class (method
     overriding).

     Note that the first four are the same as the rules for overriding a method.




     As you saw in the previous example, hiding static methods is fraught
     with pitfalls and potential problems and as a practice should be avoided.
     Though you might see questions on the exam that contain hidden static
     methods that are syntactically correct, avoid hiding static methods in your
     own work, since it tends to lead to confusing and difficult-to-read code.
     You should not reuse the name of a static method in your class if it is
     already used in the parent class.



     Overriding vs. Hiding Methods
     In our description of hiding of static methods, we indicated there was a distinction between
     overriding and hiding methods. Unlike overriding a method, in which a child method
     replaces the parent method in calls defined in both the parent and child, hidden methods
     only replace parent methods in the calls defined in the child class.
     At runtime the child version of an overridden method is always executed for an instance
     regardless of whether the method call is defined in a parent or child class method. In this
     manner, the parent method is never used unless an explicit call to the parent method is
     referenced, using the syntax ParentClassName.method(). Alternatively, at runtime the parent version
     of a hidden method is always executed if the call to the method is defined in the parent class.




     Creating final methods
     We conclude our discussion of method inheritance with a somewhat self-explanatory
     rule: final methods cannot be overridden. If you recall our discussion of modifi ers from
     Chapter 4, you can create a method with the final keyword. By doing so, though, you forbid a child
     class from overriding this method. This rule is in place both when you override
     a method and when you hide a method. In other words, you cannot hide a static method in
     a parent class if it is marked as final.




     Why Mark a Method as final?
     Although marking methods as final prevents them from being overridden, it does have
     advantages in practice. For example, you’d mark a method as final when you’re defining a
     parent class and want to guarantee certain behavior of a method in the parent class,
     regardless of which child is invoking the method.
     For example, in the previous example with Birds, the author of the parent class may want
     to ensure the method hasFeathers() always returns true, regardless of the child class
     instance on which it is invoked. The author is confident that there is no example of a Bird in
     which feathers are not present.
     The reason methods are not commonly marked as final in practice, though, is that it
     may be difficult for the author of a parent class method to consider all of the possible
     ways her child class may be used. For example, although all adult birds have feathers, a
     baby chick doesn’t; therefore, if you have an instance of a Bird that is a chick, it would
     not have feathers. In short, the final modifier is only used on methods when the author
     of the parent method wants to guarantee very precise behavior.





     Inheriting Variables
     As you saw with method overriding, there were a lot of rules when two methods have the
     same signature and are defined in both the parent and child classes. Luckily, the rules for
     variables with the same name in the parent and child classes are a lot simpler, because Java
     doesn’t allow variables to be overridden but instead hidden.

     **/
}
