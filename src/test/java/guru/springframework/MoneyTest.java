package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplication(){
        Money five= new Money(5);
        Money product= five.times(2);
        assertEquals(new Money(10), product);
        product= five.times(3);
        assertEquals(new Money(15), product);
    }
    @Test
    void testEquality(){
        assertEquals(false,new Currency(1).equals(new Currency(2)));
        assertEquals(true,new Currency(1).equals(new Currency(1)));
//        assertNotEquals(new Currency(5),new Currency(5));
    }

    @Test
    void testMultiplicationFranc(){
        Money five= new Money(5);
        Money product= five.times(2);
        assertEquals(new Money(10), product);
        product= five.times(3);
        assertEquals(new Money(15), product);
    }
    @Test
    void testEqualityFranc(){
        assertEquals(false,new Money(1).equals(new Money(2)));
        assertEquals(true,new Money(1).equals(new Money(1)));
    }

}
