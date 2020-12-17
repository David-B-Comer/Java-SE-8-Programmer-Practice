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

     **/
}
