package guru.springframework;

public class Money {
	protected int amount;

	@Override
	public boolean equals(Object object) {
		Money money = (Money) object;
		
		return amount == money.amount;
	}
}
