package src.test.zad1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.main.zad1.Cup;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("Orange Juice",85.5);
        assertEquals("Orange Juice", c.getLiquidType());
    }

    @Test
    void getPercentageFull() {
        Cup c = new Cup("Orange Juice",85.5);
        assertEquals(85.5, c.getPercentFull(), 0.001);
    }
}