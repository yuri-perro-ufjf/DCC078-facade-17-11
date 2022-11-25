public class Player {
    public boolean hasKey() {
        return PlayerFacade.checkInventory(this);
    }
}
