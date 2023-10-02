package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    void testMultiplication(){
        Dollar five= new Dollar(5);
        Money product= five.times(2);
        assertEquals(new Dollar(10), product);
        product= five.times(3);
        assertEquals(new Dollar(15), product);
    }
    @Test
    void testEquality(){
        assertEquals(false,new Dollar(1).equals(new Dollar(2)));
        assertEquals(true,new Dollar(1).equals(new Dollar(1)));
    }

    @Test
    void testMultiplicationFranc(){
        Franc five= new Franc(5);
        Money product= five.times(2);
        assertEquals(new Franc(10), product);
        product= five.times(3);
        assertEquals(new Franc(15), product);
    }
    @Test
    void testEqualityFranc(){
        assertEquals(false,new Franc(1).equals(new Franc(2)));
        assertEquals(true,new Franc(1).equals(new Franc(1)));
    }

}
