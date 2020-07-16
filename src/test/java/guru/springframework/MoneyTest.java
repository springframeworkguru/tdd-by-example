package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Money fiveDollars = Money.dollar(5);
        assertEquals(Money.dollar(10), fiveDollars.times(2));
        assertEquals(Money.dollar(15), fiveDollars.times(3));
        
        Money fiveFrancs = Money.franc(5);
        assertEquals(Money.franc(10), fiveFrancs.times(2));
        assertEquals(Money.franc(15), fiveFrancs.times(3));
    }
    
    @Test
    void testEquality() {
    	assertEquals(Money.dollar(5), Money.dollar(5));
    	assertNotEquals(Money.dollar(5), Money.dollar(8));
    	assertEquals(Money.franc(5), Money.franc(5));
    	assertNotEquals(Money.dollar(5), Money.franc(5));
    }
    
    @Test
    void testCurrency() {
    	assertEquals("USD", Money.dollar(1).currency());
    	assertEquals("CHF", Money.franc(1).currency());
    }
    
}
