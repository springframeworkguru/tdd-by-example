package guru.springframework;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    protected Money times(int multiplier) {
        return (new Dollar(amount * multiplier));
    }
}
