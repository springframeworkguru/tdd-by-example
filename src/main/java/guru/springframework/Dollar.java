package guru.springframework;

/**
 * Created by jt on 2018-10-04.
 */
public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    void times( int multiplier) {
        amount *= multiplier;
    }
}
