package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
    }

    @Test
    void testMultiplicationFrank() {
        Frank five = new Frank(5);
        Frank product = five.times(2);
        assertEquals(new Frank(10), product);
        product = five.times(3);
        assertEquals(new Frank(15), product);
    }

    @Test
    void testEqualityFrank() {
        assertEquals(new Frank(5), new Frank(5));
        assertNotEquals(new Frank(5), new Frank(8));
    }
}
