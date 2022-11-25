import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void shouldNotBeReturnPlayerHasKey() {
        Player player = new Player();

        assertEquals(false, player.hasKey());
    }

    @Test
    void shouldBeReturnPlayerHasKeyVest() {
        Player player = new Player();
        Vest.getInstancia().addPlayerWithKey(player);

        assertEquals(true, player.hasKey());
    }

    @Test
    void shouldBeReturnPlayerHasKeyBag() {
        Player player = new Player();
        Bag.getInstancia().addPlayerWithKey(player);

        assertEquals(true, player.hasKey());
    }
}