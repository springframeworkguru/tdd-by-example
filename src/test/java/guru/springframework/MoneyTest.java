package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
//TODO on Dell 16, Project Structure was running Java 17. Had to be rolled back to Java 11 to avoid warnings
    @Test
    void testMultiplicationFranc(){
        Franc five = new Franc(5);
        five.times(2);
        Franc product = five.times(2);
        assertEquals(new Franc(10), product);
        product = five.times(3);
        assertEquals(new Franc(15), product);
    }

    @Test
    void testEqualityFranc(){
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8));
    }
}
