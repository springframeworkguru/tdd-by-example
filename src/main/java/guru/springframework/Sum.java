package guru.springframework;

/**
 * Created by jt on 10/10/18.
 */
public class Sum implements Expression {
    Money augmend;
    Money addmend;

    public Sum(Money augmend, Money addmend) {
        this.augend = augmend;
        this.addend = addmend;
    }

    public Money reduce(String to) {
        int amount = augmend.amount + addmend.amount;
        return new Money(amount, to);
    }
}
