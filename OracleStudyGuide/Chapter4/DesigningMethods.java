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

     **/
}
