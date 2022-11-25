public class Bag extends Inventory{
    private static Bag bag = new Bag();

    private Bag() {};

    public static Bag getInstancia() {
        return bag;
    }
}
