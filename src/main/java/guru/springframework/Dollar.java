package guru.springframework;

/**
 * Created by jt on 2018-10-04.
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times( int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
