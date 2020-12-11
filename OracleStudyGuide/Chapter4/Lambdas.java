package Chapter4;

public class Lambdas {
    /**


     Writing Simple Lambdas
     Java is an object-oriented language at heart. You’ve seen plenty of objects by now. In Java
     8, the language added the ability to write code using another style. Functional programming is a way of
     writing code more declaratively. You specify what you want to do rather
     than dealing with the state of objects. You focus more on expressions than loops.
     Functional programming uses lambda expressions to write code. A lambda expression
     is a block of code that gets passed around. You can think of a lambda expression as an
     anonymous method. It has parameters and a body just like full-fl edged methods do, but it
     doesn’t have a name like a real method. Lambda expressions are often referred to as lambdas for short.
     You might also know them as closures if Java isn’t your fi rst language. If you
     had a bad experience with closures in the past, don’t worry. They are far simpler in Java.
     In other words, a lambda expression is like a method that you can pass as if it were a
     variable. For example, there are different ways to calculate age. One human year is equivalent to seven dog years.
     You want to write a method that that takes an age() method as
     input. To do this in an object-oriented program, you’d need to defi ne a Human subclass and a
     Dog subclass. With lambdas, you can just pass in the relevant expression to calculate age.
     Lambdas allow you to write powerful code in Java. Only the simplest lambda expressions are on the OCA exam.
     The goal is to get you comfortable with the syntax and the
     concepts. This means you aren’t truly doing functional programming yet. You’ll see
     lambdas again on the OCP exam.
     In this section, we’ll cover an example of why lambdas are helpful, the syntax of
     lambdas, and how to use predicates.








     Lambda Example
     Our goal is to print out all the animals in a list according to some criteria. We’ll show you
     how to do this without lambdas to illustrate how lambdas are useful. We start out with the
     Animal class:
     public class Animal {
     private String species;
     private boolean canHop;
     private boolean canSwim;
     public Animal(String speciesName, boolean hopper, boolean swimmer) {
     species = speciesName;
     canHop = hopper;
     canSwim = swimmer;
     }
     public boolean canHop() { return canHop; }
     public boolean canSwim() { return canSwim; }
     public String toString() { return species; }
     }
     The Animal class has three instance variables, which are set in the constructor. It has
     two methods that get the state of whether the animal can hop or swim. It also has a
     toString() method so we can easily identify the Animal in programs.
     We plan to write a lot of different checks, so we want an interface. You’ll learn more
     about interfaces in the next chapter. For now, it is enough to remember that an interface
     specifi es the methods that our class needs to implement:
     public interface CheckTrait {
     boolean test(Animal a);
     }
     The first thing we want to check is whether the Animal can hop. We provide
     a class that can check this:
     public class CheckIfHopper implements CheckTrait {
     public boolean test(Animal a) {
     return a.canHop();
     }
     }
     This class may seem simple—and it is. This is actually part of the problem that lambdas
     solve. Just bear with us for a bit. Now we have everything that we need to write our code to
     fi nd the Animals that hop:
     1: public class TraditionalSearch {
     2: public static void main(String[] args) {
     3: List<Animal> animals = new ArrayList<Animal>(); // list of animals
     4: animals.add(new Animal("fish", false, true));
     5: animals.add(new Animal("kangaroo", true, false));
     6: animals.add(new Animal("rabbit", true, false));
     7: animals.add(new Animal("turtle", false, true));
     8:
     9: print(animals, new CheckIfHopper()); // pass class that does check
     10: }
     11: private static void print(List<Animal> animals, CheckTrait checker) {
     12: for (Animal animal : animals) {
     13: if (checker.test(animal)) // the general check
     14: System.out.print(animal + " ");
     15: }
     16: System.out.println();
     17: }
     18: }
     The print() method on line 11 method is very general—it can check for any trait. This
     is good design. It shouldn’t need to know what specifi cally we are searching for in order to
     print a list of animals.
     Now what happens if we want to print the Animals that swim? Sigh. We need to write
     another class CheckIfSwims. Granted, it is only a few lines. Then we need to add a new line
     under line 9 that instantiates that class. That’s two things just to do another check.
     Why can’t we just specify the logic we care about right here? Turns out that we can with
     lambda expressions. We could repeat that whole class here and make you fi nd the one line
     that changed. Instead, we’ll just show you. We could replace line 9 with the following, which
     uses a lambda:
     9: print(animals, a -> a.canHop());
     Don’t worry that the syntax looks a little funky. You’ll get used to it and we’ll describe it
     in the next section. We’ll also explain the bits that look like magic. For now, just focus on
     how easy it is to read. We are telling Java that we only care about Animals that can hop.
     It doesn’t take much imagination to fi gure how we would add logic to get the Animals
     that can swim. We only have to add one line of code—no need for an extra class to do
     something simple. Here’s that other line:
     print(animals, a -> a.canSwim());
     How about Animals that cannot swim?
     print(animals, a -> ! a.canSwim());
     The point here is that it is really easy to write code that uses lambdas once you get the
     basics in place. This code uses a concept called deferred execution. Deferred execution
     means that code is specified now but will run later. In this case, later is when the print()
     method calls it.

     **/
}
