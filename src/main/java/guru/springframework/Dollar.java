package guru.springframework;

public class Dollar extends Money{
    public Dollar(int amount, String currency) {
        super(amount,currency);
    }

    @Override
    public Money times(int multiplyBy) {
        return Money.dollar(super.amount*multiplyBy);

    }
}
