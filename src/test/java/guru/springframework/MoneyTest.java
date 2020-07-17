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
    
    @Test
    void testSimpleAddition() {
    	Money five = Money.dollar(5);
    	Expression sum = five.plus(five);
    	Bank bank = new Bank();
    	Money reduced = bank.reduce(sum, "USD");
    		
    	assertEquals(Money.dollar(10), reduced);
    }
    
    @Test
    void testPlusReturnsSum() {
    	Money five = Money.dollar(5);
    	Expression result = five.plus(five);
    	Sum sum = (Sum) result;
    	
    	assertEquals(five, sum.augmend);
    	assertEquals(five, sum.addmend);
    }
    
    @Test
    void testReduceSum() {
    	Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
    	Bank bank = new Bank();
    	Money result = bank.reduce(sum, "USD");
    	
    	assertEquals(Money.dollar(7), result);
    }
    
    @Test
    void testReduceMoney() {
    	Bank bank = new Bank();
    	Money result = bank.reduce(Money.dollar(1), "USD");
    	
    	assertEquals(Money.dollar(1), result);
    }
    
    @Test
    void testReduceMoneyDifferentCurrency() {
    	Bank bank = new Bank();
    	bank.addRate("CHF", "USD", 2);
    	Money result = bank.reduce(Money.franc(2), "USD");
    	
    	assertEquals(Money.dollar(1), result);
    }
    
    @Test
    void testIdentityRate() {
    	assertEquals(1, new Bank().rate("USD", "USD"));
    	assertEquals(1, new Bank().rate("CHF", "CHF"));
    }
    
    @Test
    void testMixedAddition() {
    	Expression fiveBucks = Money.dollar(5);
    	Expression tenFrancs = Money.franc(10);
    	Bank bank = new Bank();
    	
    	bank.addRate("CHF", "USD", 2);
    	Money result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");
    	
    	assertEquals(Money.dollar(10), result);
    }
    
    @Test
    public void testSumPlusMoney() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = new Sum(fiveBucks, tenFrancs).plus(fiveBucks);
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(15), result);
    }

    @Test
    public void testSumTimes() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = new Sum(fiveBucks, tenFrancs).times(2);
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(20), result);
    }
}
