package guru.springframework;

public abstract class Money {
    private final String currency;
    protected final int amount;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    protected String currency() {
        return currency;
    }

    public abstract Money times(int multiplier);

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money  = (Money) object;
        return amount == money.amount && this.getClass().equals(object.getClass());
    }
}
