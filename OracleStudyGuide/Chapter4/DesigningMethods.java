package Chapter4;

public class DesigningMethods {
    /**


     public final void nap(int minutes) throws InterruptedException {
        // take a nap
     }


     Parts of a method declaration
     Element                    Value in nap() example             Required?
     Access modifier            public                              No
     Optional specifier         final                               No
     Return type                void                                Yes
     Method name                nap                                 Yes
     Parameter list             (int minutes)                       Yes, but can be empty parentheses
     Optional exception list    throws InterruptedException         No
     Method body                {// take a nap }                    Yes, but can be empty brace





     Access Modifiers
     Java offers four choices of access modifier:

     public The method can be called from any class.

     private The method can only be called from within the same class.

     protected The method can only be called from classes in the same package or subclasses.
     You’ll learn about subclasses in Chapter 5.

     Default (Package Private) Access The method can only be called from classes in the same
     package. This one is tricky because there is no keyword for default access. You simply omit
     the access modifier



     Optional Specifiers
     There are a number of optional specifiers, but most of them aren’t on the exam. Optional
     specifiers come from the following list. Unlike with access modifiers, you can have multiple
     specifiers in the same method (although not all combinations are legal). When this happens,
     you can specify them in any order. And since it is optional, you can’t have any of them at
     all. This means you can have zero or more specifiers in a method declaration.

     static Covered later in this chapter. Used for class methods.

     abstract Covered in Chapter 5. Used when not providing a method body.

     final Covered in Chapter 5. Used when a method is not allowed to be overridden by a
     subclass.

     synchronized On the OCP but not the OCA exam.

     native Not on the OCA or OCP exam. Used when interacting with code written in
     another language such as C++.

     strictfp Not on the OCA or OCP exam. Used for making floating-point calculations portable.




     Return Type
     The next item in a method declaration is the return type. The return type might be an
     actual Java type such as String or int. If there is no return type, the void keyword is used.
     This special return type comes from the English language: void means without contents. In
     Java, we have no type there. Remember that a method must have a return type. If no value is returned,
     the return type is void. You cannot omit the return type.


     Method Name
     Method names follow the same rules as we practiced with variable names in Chapter 1,
     “Java Building Blocks.” To review, an identifi er may only contain letters, numbers, $, or _.
     Also, the fi rst character is not allowed to be a number, and reserved words are not allowed.
     By convention, methods begin with a lowercase letter but are not required to.



     Parameter List
     Although the parameter list is required, it doesn’t have to contain any parameters. This
     means you can just have an empty pair of parentheses after the method name, such as void
     nap(){}. If you do have multiple parameters, you separate them with a comma. There are
     a couple more rules for the parameter list that you’ll see when we cover varargs shortly.




     Optional Exception List
     In Java, code can indicate that something went wrong by throwing an exception. We’ll cover
     this in Chapter 6, “Exceptions.” For now, you just need to know that it is optional and
     where in the method signature it goes if present. In the example, InterruptedException is a
     type of Exception. You can list as many types of exceptions as you want in this clause separated by commas.






     Method Body
     The final part of a method declaration is the method body (except for abstract methods and
     interfaces, but you don’t need to know about either of those until next chapter). A method
     body is simply a code block. It has braces that contain zero or more Java statements.




     Working with Varargs
     As you saw in the previous chapter, a method may use a vararg parameter (variable argument) as if it is an array. It is a little different than an array, though. A vararg parameter
     must be the last element in a method’s parameter list. This implies you are only allowed to
     have one vararg parameter per method.



     When calling a method with a vararg parameter, you have a choice. You can pass in an
     array, or you can list the elements of the array and let Java create it for you. You can even
     omit the vararg values in the method call and Java will create an array of length zero for
     you.



     Passing Data Among Methods
     Java is a “pass-by-value” language. This means that a copy of the variable is made and the
     method receives that copy. Assignments made in the method do not affect the caller.


     To review, Java uses pass-by-value to get data into a method. Assigning a new primitive
     or reference to a parameter doesn’t change the caller. Calling methods on a reference to an
     object does affect the caller.
     Getting data back from a method is easier. A copy is made of the primitive or reference
     and returned from the method. Most of the time, this returned value is used. For example,
     it might be stored in a variable. If the returned value is not used, the result is ignored.
     Watch for this on the exam. Ignored returned values are tricky.


     Overloading Methods
     Now that you are familiar with the rules for declaring methods, it is time to look at creating methods
     with the same signature in the same class. Method overloading occurs when
     there are different method signatures with the same name but different type parameters.
     We’ve been calling overloaded methods for a while. System.out.println and
     StringBuilder’s append methods provide many overloaded versions so you can pass just
     about anything to them without having to think about it. In both of these examples, the only change was the
     type of the parameter. Overloading also allows different numbers
     of parameters. Everything other than the method signature can vary for overloaded methods. This
     means there can be different access modifi ers, specifi ers (like static), return types, and
     exception lists.

     **/
}
