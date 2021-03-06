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




     Hiding Variables
     When you hide a variable, you define a variable with the same name as a variable in a parent class.
     This creates two copies of the variable within an instance of the child class: one
     instance defined for the parent reference and another defined for the child reference.
     As when hiding a static method, you can’t override a variable; you can only hide it. Also
     similar to hiding a static method, the rules for accessing the parent and child variables are
     quite similar. If you’re referencing the variable from within the parent class, the variable
     defined in the parent class is used. Alternatively, if you’re referencing the variable from
     within a child class, the variable defined in the child class is used. Likewise, you can reference
     the parent value of the variable with an explicit use of the super keyword.



     Don’t Hide Variables in Practice
     Although Java allows you to hide a variable defi ned in a parent class with one defined in
     a child class, it is considered an extremely poor coding practice.





     Creating Abstract Classes
     Let’s say you want to define a parent class that other developers are going to subclass. Your
     goal is to provide some reusable variables and methods to developers in the parent class,
     whereas the developers provide specific implementations or overrides of other methods in
     the child classes. Furthermore, let’s say you also don’t want an instance of the parent class
     to be instantiated unless it is an instance of the child class.
     For example, you might define an Animal parent class that a number of classes extend
     from and use but for which an instance of Animal itself cannot be instantiated. All subclasses
     of the Animal class, such as Swan, are required to implement a getName() method,
     but there is no implementation for the method in the parent Animal class. How do you
     ensure all classes that extend Animal provide an implementation for this method?
     In Java, you can accomplish this task by using an abstract class and abstract method. An
     abstract class is a class that is marked with the abstract keyword and cannot be instantiated.
     An abstract method is a method marked with the abstract keyword defined in an
     abstract class, for which no implementation is provided in the class in which it is declared.



     Defining an Abstract Class
     The previous sample code illustrates a number of important rules about abstract classes.
     For example, an abstract class may include non-abstract methods and variables, as you saw
     with the variable age and the method eat(). In fact, an abstract class is not required to
     include any abstract methods.



     Default Method Implementations in Abstract Classes
     Although you can’t provide a default implementation to an abstract method in an abstract
     class, you can still define a method with a body—you just can’t mark it as abstract. As
     long as you do not mark it as final, the subclass still has the option to override it, as
     explained in the previous section.



     Next, we note that an abstract class cannot be marked as final for a somewhat obvious reason.
     By definition, an abstract class is one that must be extended by another class to
     be instantiated, whereas a final class can’t be extended by another class. By marking an
     abstract class as final, you’re saying the class can never be instantiated, so the compiler
     refuses to process the code.


     Likewise, an abstract method may not be marked as final for the same reason that
     an abstract class may not be marked as final. Once marked as final, the method can
     never be overridden in a subclass, making it impossible to create a concrete instance of the
     abstract class.



     Finally, a method may not be marked as both abstract and private. This rule makes
     sense if you think about it. How would you define a subclass that implements a required
     method if the method is not accessible by the subclass itself? The answer is you can’t.



     Creating a Concrete Class
     When working with abstract classes, it is important to remember that by themselves, they
     cannot be instantiated and therefore do not do much other than define static variables and
     methods.



     An abstract class becomes useful when it is extended by a concrete subclass. A concrete
     class is the first non-abstract subclass that extends an abstract class and is required to
     implement all inherited abstract methods. When you see a concrete class extending an abstract
     class on the exam, check that it implements all of the required abstract methods.




     Extending an Abstract Class
     Let’s expand our discussion of abstract classes by introducing the concept of extending an
     abstract class with another abstract.
     Here’s one way to think about this: if an intermediate class provides an implementation
     for an abstract method, that method is inherited by subclasses as a concrete method, not
     as an abstract one. In other words, the subclasses do not consider it an inherited abstract
     method because it is no longer abstract by the time it reaches the subclasses.




     The following are lists of rules for abstract classes and abstract methods that we have
     covered in this section. Review and understand these rules before taking the exam.
     Abstract Class Definition Rules:
     1. Abstract classes cannot be instantiated directly.
     2. Abstract classes may be defined with any number, including zero, of abstract and non-abstract methods.
     3. Abstract classes may not be marked as private or final.
     4. An abstract class that extends another abstract class inherits all of its abstract methods
     as its own abstract methods.
     5. The first concrete class that extends an abstract class must provide an implementation
     for all of the inherited abstract methods.



     Abstract Method Definition Rules:
     1. Abstract methods may only be defined in abstract classes.
     2. Abstract methods may not be declared private or final.
     3. Abstract methods must not provide a method body/implementation in the abstract
     class for which is it declared.
     4. Implementing an abstract method in a subclass follows the same rules for overriding a
     method. For example, the name and signature must be the same, and the visibility of
     the method in the subclass must be at least as accessible as the method in the parent
     class.



     Implementing Interfaces
     Although Java doesn’t allow multiple inheritance, it does allow classes to implement any
     number of interfaces. An interface is an abstract data type that defines a list of abstract
     public methods that any class implementing the interface must provide. An interface can
     also include a list of constant variables and default methods, which we’ll cover in this section.
     In Java, an interface is defined with the interface keyword, analogous to the class
     keyword used when defining a class. A class invokes the interface by using the implements
     keyword in its class definition.



     Defining an Interface
     It may be helpful to think of an interface as a specialized kind of abstract class, since it
     shares many of the same properties and rules as an abstract class. The following is a list
     of rules for creating an interface, many of which you should recognize as adaptions of the
     rules for defining abstract classes.
     1. Interfaces cannot be instantiated directly.
     2. An interface is not required to have any methods.
     3. An interface may not be marked as final.
     4. All top-level interfaces are assumed to have public or default access, and they must
     include the abstract modifier in their definition. Therefore, marking an interface as
     private, protected, or final will trigger a compiler error, since this is incompatible
     with these assumptions.
     5. All non-default methods in an interface are assumed to have the modifiers abstract
     and public in their definition. Therefore, marking a method as private, protected,
     or final will trigger compiler errors as these are incompatible with the abstract and
     public keywords.
     The fourth rule doesn’t apply to inner interfaces, although inner classes and interfaces
     are not in scope for the OCA exam. The first three rules are identical to the fi rst three rules
     for creating an abstract class.




     Inheriting an Interface
     There are two inheritance rules you should keep in mind when extending an interface:
     1. An interface that extends another interface, as well as an abstract class that
     implements an interface, inherits all of the abstract methods as its own abstract
     methods.
     2. The first concrete class that implements an interface, or extends an abstract class
     that implements an interface, must provide an implementation for all of the inherited
     abstract methods.
     Like an abstract class, an interface may be extended using the extend keyword. In this
     manner, the new child interface inherits all the abstract methods of the parent interface.
     Unlike an abstract class, though, an interface may extend multiple interfaces.



     Classes, Interfaces, and Keywords
     The exam creators are fond of questions that mix class and interface terminology. Although
     a class can implement an interface, a class cannot extend an interface. Likewise, whereas
     an interface can extend another interface, an interface cannot implement another interface.




     Interface Variables
     Let’s expand our discussion of interfaces to include interface variables, which can be
     defined within an interface. Like interface methods, interface variables are assumed to
     be public. Unlike interface methods, though, interface variables are also assumed to be
     static and final.
     Here are two interface variables rules:
     1. Interface variables are assumed to be public, static, and final. Therefore, marking
     a variable as private or protected will trigger a compiler error, as will marking any
     variable as abstract.
     2. The value of an interface variable must be set when it is declared since it is marked as
     final.
     In this manner, interface variables are essentially constant variables defined on the
     interface level. Because they are assumed to be static, they are accessible even without
     an instance of the interface.




     Default Interface Methods
     With the release of Java 8, the authors of Java have introduced a new type of method to an
     interface, referred to as a default method. A default method is a method defined within an
     interface with the default keyword in which a method body is provided. Contrast default
     methods with “regular” methods in an interface, which are assumed to be abstract and
     may not have a method body.
     A default method within an interface defines an abstract method with a default implementation.
     In this manner, classes have the option to override the default method if they
     need to, but they are not required to do so. If the class doesn’t override the method, the
     default implementation will be used. In this manner, the method definition is concrete, not
     abstract.
     The purpose of adding default methods to the Java language was in part to help with
     code development and backward compatibility. Imagine you have an interface that is
     shared among dozens or even hundreds of users that you would like to add a new method
     to. If you just update the interface with the new method, the implementation would break
     among all of your subscribers, who would then be forced to update their code. In practice,
     this might even discourage you from making the change altogether. By providing a default
     implementation of the method, though, the interface becomes backward compatible with
     the existing codebase, while still providing those individuals who do want to use the new
     method with the option to override it.




     The following are the default interface method rules you need to be familiar with:
     1. A default method may only be declared within an interface and not within a class or
     abstract class.
     2. A default method must be marked with the default keyword. If a method is marked as
     default, it must provide a method body.
     3. A default method is not assumed to be static, final, or abstract, as it may be used
     or overridden by a class that implements the interface.
     4. Like all methods in an interface, a default method is assumed to be public and will not
     compile if marked as private or protected.
     The first rule should give you some comfort in that you’ll only see default methods in
     interfaces. If you see them in a class on the exam, assume the code will not compile. The
     second rule just denotes syntax, as default methods must use the default keyword.



     Static Interface Methods
     Java 8 also now includes support for static methods within interfaces. These methods are
     defined explicitly with the static keyword and function nearly identically to static methods
     defined in classes, as discussed in Chapter 4. In fact, there is really only one distinction
     between a static method in a class and an interface. A static method defined in an interface
     is not inherited in any classes that implement the interface.
     Here are the static interface method rules you need to be familiar with:
     1. Like all methods in an interface, a static method is assumed to be public and will not
     compile if marked as private or protected.
     2. To reference the static method, a reference to the name of the interface must be used.




     Understanding Polymorphism
     Java supports polymorphism, the property of an object to take on many different forms. To
     put this more precisely, a Java object may be accessed using a reference with the same type
     as the object, a reference that is a superclass of the object, or a reference that defines an
     interface the object implements, either directly or through a superclass. Furthermore, a cast
     is not required if the object is being reassigned to a super type or interface of the object.



     Object vs. Reference
     In Java, all objects are accessed by reference, so as a developer you never have direct access
     to the object itself. Conceptually, though, you should consider the object as the entity that
     exists in memory, allocated by the Java runtime environment. Regardless of the type of the
     reference you have for the object in memory, the object itself doesn’t change. For example,
     since all objects inherit java.lang.Object, they can all be reassigned to java.lang.Object


     We can summarize this principle with the following two rules:
     1. The type of the object determines which properties exist within the object in memory.
     2. The type of the reference to the object determines which methods and variables are
     accessible to the Java program.
     It therefore follows that successfully changing a reference of an object to a new reference
     type may give you access to new properties of the object, but those properties existed before
     the reference change occurred.






     Casting Objects
     In the previous example, we created a single instance of a Lemur object and accessed it
     via superclass and interface references. Once we changed the reference type, though,
     we lost access to more specific methods defined in the subclass that still exist within the
     object. We can reclaim those references by casting the object back to the specific subclass it came from:
     Primate primate = lemur;
     Lemur lemur2 = primate; // DOES NOT COMPILE
     Lemur lemur3 = (Lemur)primate;
     System.out.println(lemur3.age);
     In this example, we first try to convert the primate reference back to a lemur reference,
     lemur2, without an explicit cast. The result is that the code will not compile. In the second
     example, though, we explicitly cast the object to a subclass of the object Primate and we
     gain access to all the methods available to the Lemur class.
     Here are some basic rules to keep in mind when casting variables:
     1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
     2. Casting an object from a superclass to a subclass requires an explicit cast.
     3. The compiler will not allow casts to unrelated types.
     4. Even when the code compiles without issue, an exception may be thrown at runtime if
     the object being cast is not actually an instance of that class.
     The third rule is important; the exam may try to trick you with a cast that the compiler
     doesn’t allow. For example, we were able to cast a Primate reference to a Lemur reference,
     because Lemur is a subclass of Primate and therefore related.




     Virtual Methods
     The most important feature of polymorphism—and one of the primary reasons we have
     class structure at all—is to support virtual methods. A virtual method is a method in which
     the specific implementation is not determined until runtime. In fact, all non-final, non-static,
     and non-private Java methods are considered virtual methods, since any of them can
     be overridden at runtime. What makes a virtual method special in Java is that if you call a
     method on an object that overrides a method, you get the overridden method, even if the
     call to the method is on a parent reference or within the parent class.




     Polymorphic Parameters
     One of the most useful applications of polymorphism is the ability to pass instances of
     a subclass or interface to a method. For example, you can define a method that takes an
     instance of an interface as a parameter. In this manner, any class that implements the interface
     can be passed to the method. Since you’re casting from a subtype to a supertype, an
     explicit cast is not required. This property is referred to as polymorphic parameters of a
     method




     Polymorphic Parameters and Code Reusability
     If you’re defining a method that will be accessible outside the current class, either to
     subclasses of the current class or publicly to objects outside the current class, it is considered
     good coding practice to use the superclass or interface type of input parameters whenever possible.
     As you may remember from Chapter 3, “Core Java APIs,” the type java.util.List is an
     interface, not a class. Although there are many classes that implement java.util.List,
     such as java.util.ArrayList and java.util.Vector, when you’re passing an existing
     List you’re not usually interested in the particular subclass of the List. In this manner, a
     method that passes a List should use the interface type java.util.List as the polymorphic parameter
     type, rather than a specific class that implements List, as the code will be more reusable for other
     types of lists. For example, it is common to see code such as the following that uses the interface
     reference type over the class type for greater reusability: java.util.List list = new java.util.ArrayList();

     **/
}
