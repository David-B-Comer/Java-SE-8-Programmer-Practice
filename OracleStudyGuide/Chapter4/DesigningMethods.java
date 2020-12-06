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

     **/
}
