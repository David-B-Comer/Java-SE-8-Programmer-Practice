package Chapter4;

public class Constructors {
    /**

     Creating Constructors
     As you learned in Chapter 1, a constructor is a special method that matches the name of
     the class and has no return type. Here’s an example:
     public class Bunny {
     public Bunny() {
     System.out.println("constructor");
     }
     }
     The name of the constructor, Bunny, matches the name of the class, Bunny, and there is
     no return type, not even void. That makes this a constructor. Can you tell why these two
     are not valid constructors for the Bunny class?
     public bunny() { } // DOES NOT COMPILE
     public void Bunny() { }
     The fi rst one doesn't match the classname because Java is case sensitive. Since it doesn't
     match, Java knows it can't be a constructor and is supposed to be a regular method.
     However, it is missing the return type and doesn't compile. The second method is a perfectly good method, but is not a constructor because it has a return type.
     Constructors are used when creating a new object. This process is called instantiation
     because it creates a new instance of the class. A constructor is called when we write new
     followed by the name of the class we want to instantiate. For example:
     new Bunny()
     When Java sees the new keyword, it allocates memory for the new object. Java also looks
     for a constructor and calls it.
     A constructor is typically used to initialize instance variables. The this keyword tells
     Java you want to reference an instance variable. Most of the time, this is optional. The
     problem is that sometimes there are two variables with the same name. In a constructor,
     one is a parameter and one is an instance variable. If you don’t say otherwise, Java gives
     you the one with the most granular scope, which is the parameter. Using this.name tells
     Java you want the instance variable.
     Here’s a common way of writing a constructor:
     1: public class Bunny {
     2: private String color;
     3: public Bunny(String color) {
     4: this.color = color;
     5: } }





     Default Constructor
     Every class in Java has a constructor whether you code one or not. If you don’t include any
     constructors in the class, Java will create one for you without any parameters.
     This Java-created constructor is called the default constructor. Sometimes we call it the
     default no-arguments constructor for clarity. Here’s an example:
     public class Rabbit {
     public static void main(String[] args) {
     Rabbit rabbit = new Rabbit(); // Calls default constructor
     }
     }
     In the Rabbit class, Java sees no constructor was coded and creates one. This default
     constructor is equivalent to typing this:
     public Rabbit() {}
     The default constructor has an empty parameter list and an empty body. It is fi ne for you
     to type this in yourself. However, since it doesn't do anything, Java is happy to supply it for
     you and save you some typing.
     We keep saying generated. This happens during the compile step. If you look at the fi le
     with the .java extension, the constructor will still be missing. It is only in the compiled fi le
     with the.class extension that it makes an appearance.
     Remember that a default constructor is only supplied if there are no constructors
     present.


     Constructor Chaining
     Overloaded constructors often call each other. One common technique is to have each
     constructor add one parameter until getting to the constructor that does all the work.
     This approach is called constructor chaining.



     Final Fields
     As you saw earlier in the chapter, final instance variables must be assigned a value exactly
     once. We saw this happen in the line of the declaration and in an instance initializer. There
     is one more location this assignment can be done: in the constructor.
     public class MouseHouse {
     private final int volume;
     private final String name = "The Mouse House";
     public MouseHouse(int length, int width, int height) {
     volume = length * width * height;
     }}
     The constructor is part of the initialization process, so it is allowed to assign final
     instance variables in it. By  the time the constructor completes, all final instance variables
     must have been set.



     Encapsulating Data
     Encapsulation means we set up the class so only methods
     in the class with the variables can refer to the instance variables. Callers are required to use
     these methods.

     **/
}
