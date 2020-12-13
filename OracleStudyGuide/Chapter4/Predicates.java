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





     Java 8 even integrated the Predicate interface into some existing classes. There is only
     one you need to know for the exam. ArrayList declares a removeIf() method that takes a
     Predicate. Imagine we have a list of names for pet bunnies. We decide we want to remove
     all of the bunny names that don’t begin with the letter h because our little cousin really
     wants us to choose an H name. We could solve this problem by writing a loop. Or we could
     solve it in one line:
     3: List<String> bunnies = new ArrayList<>();
     4: bunnies.add("long ear");
     5: bunnies.add("floppy");
     6: bunnies.add("hoppy");
     7: System.out.println(bunnies); // [long ear, floppy, hoppy]
     8: bunnies.removeIf(s -> s.charAt(0) != 'h');
     9: System.out.println(bunnies); // [hoppy]
     Line 8 takes care of everything for us. It defi nes a predicate that takes a String and
     returns a boolean. The removeIf() method does the rest

     **/
}
