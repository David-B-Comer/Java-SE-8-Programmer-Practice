package Chapter4;

public class ApplyingAccessModifiers {
    /**

     Applying Access Modifiers
     You already saw that there are four access modifiers: public, private, protected, and
     default access. We are going to discuss them in order from most restrictive to least restrictive:
     ■ private: Only accessible within the same class
     ■ default (package private) access: private and other classes in the same package
     ■ protected: default access and child classes
     ■ public: protected and classes in the other packages




     Private Access
     Private access is easy. Only code in the same class can call private methods or access
     private fields.



     Default (Package Private) Access
     Luckily, MotherDuck is more accommodating about what her ducklings can do. She allows
     classes in the same package to access her members. When there is no access modifi er, Java
     uses the default, which is package private access. This means that the member is “private”
     to classes in the same package. In other words, only classes in the package may access it.



     Protected Access
     Protected access allows everything that default (package private) access allows and more.
     The protected access modifier adds the ability to access members of a parent class.



     Public Access
     public means anyone can access the member from anywhere.





     Access modifiers

     Can access If that member is private?      If that member has default (package private) access?        If that member is protected?        If that member is public?

     Member in the same class                   Yes                                        Yes                                                         Yes                                 Yes

     Member in another                          No                                         Yes                                                         Yes                                 Yes
     class in same package

     Member in a superclass in a                No                                         No                                                          Yes                                 Yes
     different package

     Method/field in a nonsuperclass            No                                         No                                                          No                                  Yes
     class in a different package






     **/
}
