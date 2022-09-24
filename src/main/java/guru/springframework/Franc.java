package guru.springframework;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    @Override
    protected Money times(int multiplier) {
        return (new Franc(amount * multiplier));
    }
}
