package guru.springframework;

/**
 * Created by jt on 2018-10-05.
 */
public class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
