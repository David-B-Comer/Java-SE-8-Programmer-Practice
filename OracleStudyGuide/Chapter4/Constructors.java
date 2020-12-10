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

     **/
}
