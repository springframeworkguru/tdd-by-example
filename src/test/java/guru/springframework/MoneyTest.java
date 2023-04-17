package guru.springframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void should_GiveCorrectAmount_when_MultipliedByFactor() {
		
		// given
		Dollar money = new Dollar(5);
		
		// when
		money.multiply(2);
		
		// then
		assertEquals(10, money.getAmount());
		
	}
	
	@Test
	void should_GiveCorrectAmounts_when_CalledMultipleTimes() {
		
		// given
		final int DOLLARS_AMOUNT = 5;
		final int MULTIPLICATION_FACTOR = 2;
		final int EXPECTED = 10;
		Dollar money = new Dollar(DOLLARS_AMOUNT);
		
		// when
		money.multiply(MULTIPLICATION_FACTOR);
		
		// then
		assertEquals(EXPECTED, money.getAmount());
		
	}

}
