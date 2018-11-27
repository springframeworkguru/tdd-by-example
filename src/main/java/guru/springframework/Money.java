package guru.springframework;

public abstract class Money {
    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money frank(int amount) {
        return new Frank(amount);
    }

    public abstract Money times(int multiplier);

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Money money = (Money) object;
        return amount == money.amount;
    }
}
