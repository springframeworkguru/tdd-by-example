package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrancTest {

    @Test
    void times() {
        Money tenFrancs = Money.franc(10);
        assertEquals(new Franc(30), tenFrancs.times(3));
    }

    @Test
    void FrancEqualities() {
        assertEquals(Money.franc(10), Money.franc(10));
        assertNotEquals(Money.dollar(10), Money.franc(10));
    }
}