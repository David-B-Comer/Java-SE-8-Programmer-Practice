package Chapter5;

public class ClassDesign {
    /**

     At its core, proper Java class design is about code reusability, increased functionality,
     and standardization. For example, by creating a new class that extends an existing class,
     you may gain access to a slew of inherited primitives, objects, and methods. Alternatively,
     by designing a standard interface for your application, you ensure that any class that implements
     the interface has certain required methods defined. Finally, by creating abstract class
     definitions, you’re defining a platform that other developers can extend and build on top of.




     Introducing Class Inheritance
     When creating a new class in Java, you can define the class to inherit from an existing class.
     Inheritance is the process by which the new child subclass automatically includes any
     public or protected primitives, objects, or methods defined in the parent class.
     For illustrative purposes, we refer to any class that inherits from another class as a child
     class, or a descendant of that class. Alternatively, we refer to the class that the child inherits
     from as the parent class, or an ancestor of the class. If child X inherits from class Y, which
     in turn inherits from class Z, then X would be considered an indirect child, or descendant,
     of class Z.
     Java supports single inheritance, by which a class may inherit from only one direct parent class.
     Java also supports multiple levels of inheritance, by which one class may extend
     another class, which in turn extends another class. You can extend a class any number of
     times, allowing each descendant to gain access to its ancestor’s members.
     To truly understand single inheritance, it may helpful to contrast it with multiple inheritance,
     by which a class may have multiple direct parents. By design, Java doesn’t support
     multiple inheritance in the language because studies have shown that multiple inheritance
     can lead to complex, often difficult-to-maintain code. Java does allow one exception to the
     single inheritance rule: classes may implement multiple interfaces, as you’ll see later in this
     chapter.



     It is possible in Java to prevent a class from being extended by marking the class with
     the final modifier. If you try to define a class that inherits from a final class, the compiler
     will throw an error and not compile. Unless otherwise specified, throughout this chapter
     you can assume the classes we work with are not marked as final.



     Applying Class Access Modifiers
     As discussed in Chapter 4, you can apply access modifiers (public, private, protected,
     default) to both class methods and variables. It probably comes as no surprise that you can
     also apply access modifiers to class definitions, since we have been adding the public access
     modifier to nearly every class up to now.


     For the OCA exam, you should only be familiar with public and default
     package-level class access modifiers, because these are the only ones that
     can be applied to top-level classes within a Java file. The protected and
     private modifiers can only be applied to inner classes, which are classes
     that are defined within other classes, but this is well out of scope for the
     OCA exam.



     **/
}
