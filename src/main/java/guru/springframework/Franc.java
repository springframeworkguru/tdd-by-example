package guru.springframework;

public class Franc extends Money{
    public Franc(int amount, String currency) {
        super(amount,currency);
    }

    @Override
    public Money times(int multiplyBy) {
        return Money.franc(super.amount*multiplyBy);

    }
}
