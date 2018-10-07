package guru.springframework;

/**
 * Created by jt on 2018-10-05.
 */
public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times( int multiplier) {
        return new Franc(amount * multiplier);
    }
}
