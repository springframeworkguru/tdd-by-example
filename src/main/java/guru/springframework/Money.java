package guru.springframework;

public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;

    }
    protected String currency() {
        return currency;
    };

    public static Money dollar (int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc (int amount) {
        return new Franc(amount, "CHF");
    }
    public int getAmount() {
        return amount;
    }

    public abstract Money times(int multiplier);

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        } else if (object.getClass() != this.getClass()) {
            return false;
        }

        Money other = (Money) object;
        if (amount == other.getAmount()) {
            return true;
        }
        return false;
    }
}
