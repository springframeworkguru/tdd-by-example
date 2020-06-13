package guru.springframework;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(5);
        assertEquals(25, five.currency);

    }
}

