public class ElementsOfAClass {
    /**

     Element                    Example                 Required?           Where does it go?
     Package declaration        package abc;            No                  First line in the file
     Import statements          import java.util.*;     No                  Immediately after the package
     Class declaration          public class C          Yes                 Immediately after the import
     Field declarations         int value;              No                  Anywhere inside a class
     Method declarations        void method()           No                  Anywhere inside a class

     **/

    /**

    package structure; // package must be first non-comment
    import java.util.*; // import must come after package
    public class Meerkat { // then comes the class
        double weight; // fields and methods can go in either order
        public double getWeight() {
            return weight; }
        double height; // another field – they don't need to be together
    }

     */
}
