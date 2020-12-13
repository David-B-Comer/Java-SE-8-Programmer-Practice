package Chapter4;

public class Predicates {
    /**

     In our earlier example, we created an interface with one method:
     boolean test(Animal a);
     Lambdas work with interfaces that have only one method. These are called functional
     interfaces—interfaces that can be used with functional programming. (It’s actually more
     complicated than this, but for the OCA exam this definition is fine.)
     You can imagine that we’d have to create lots of interfaces like this to use lambdas. We
     want to test Animals and Strings and Plants and anything else that we come across.
     Luckily, Java recognizes that this is a common problem and provides such an interface
     for us. It’s in the package java.util.function and the gist of it is as follows:
     public interface Predicate<T> {
     boolean test(T t);
     }
     That looks a lot like our method. The only difference is that it uses this type T instead of
     Animal. That’s the syntax for generics. It’s like when we created an ArrayList and got to
     specify any type that goes in it.

     **/
}
