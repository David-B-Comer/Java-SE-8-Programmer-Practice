public class Chick {
    private String name = "Fluffy";
    { System.out.println("setting field"); }

    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
        }
}
