package Chapter3;

public class Immutability {
    /**

    Once a String object is created, it is not allowed to change. It cannot be made larger or
    smaller, and you cannot change one of the characters inside it.
    You can think of a string as a storage box you have perfectly full and whose sides can’t
    bulge. There’s no way to add objects, nor can you replace objects without disturbing the
    entire arrangement. The trade-off for the optimal packing is zero fl exibility.
    Mutable is another word for changeable. Immutable is the opposite—an object that
    can’t be changed once it’s created. On the OCA exam, you need to know that String is
    immutable.


     class Mutable {
     private String s;
     public void setS(String newS){ s = newS; } // Setter makes it mutable
     public String getS() { return s; }
     }
     final class Immutable {
     private String s = "name";
     public String getS() { return s; }
     }

     Immutable only has a getter. There's no way to change the value of s once it's set.
     Mutable has a setter as well. This allows the reference s to change to point to a different
     String later. Note that even though the String class is immutable, it can still be used in
     a mutable class. You can even make the instance variable final so the compiler reminds
     you if you accidentally change s.
     Also, immutable classes in Java are final, and subclasses can’t add mutable behavior.

     **/
}
