package guru.springframework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {


    @Test
    public void testSimpleAddition(){
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }


    @Test
    public void testMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
        five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }


    @Test
    public void testEquality(){
        assertEquals(Money.dollar(10), Money.dollar(10));
        assertNotEquals(Money.dollar(10), Money.dollar(5));
        assertNotEquals(Money.franc(10), Money.dollar(10));
        assertEquals(Money.franc(10), Money.franc(10));
        assertNotEquals(Money.franc(10), Money.franc(5));
        assertNotEquals(Money.dollar(10), Money.franc(10));
    }

    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency);
        assertEquals("CHF", Money.franc(1).currency);
    }



}
