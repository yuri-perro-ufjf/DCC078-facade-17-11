import java.util.ArrayList;
import java.util.List;

public abstract class Inventory {
    private List<Player> playersWithKeys = new ArrayList<>();

    public void addPlayerWithKey(Player player) {
        this.playersWithKeys.add(player);
    }

    public boolean checkPlayerWithKeys(Player player) {
        return this.playersWithKeys.contains(player);
    }
}
