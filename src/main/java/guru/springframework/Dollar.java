package guru.springframework;

public class Dollar {

	private int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public void multiply(int factor) {
		amount = getAmount() * factor;
	}

	public int getAmount() {
		return amount;
	}

}
