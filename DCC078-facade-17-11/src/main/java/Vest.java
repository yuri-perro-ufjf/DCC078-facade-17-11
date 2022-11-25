public class Vest extends Inventory{
    private static Vest vest = new Vest();

    private Vest() {};

    public static Vest getInstancia() {
        return vest;
    }
}
