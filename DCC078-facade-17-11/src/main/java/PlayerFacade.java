public class PlayerFacade {

    public static boolean checkInventory(Player player) {
        if (Bag.getInstancia().checkPlayerWithKeys(player)) {
            return true;
        }
        if (Vest.getInstancia().checkPlayerWithKeys(player)) {
            return true;
        }
        return false;
    }
}
