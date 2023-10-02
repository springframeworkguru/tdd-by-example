package guru.springframework;

import java.util.Currency;

public class Sum implements Expression {
    Money augmend;
    Money addmend;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    public Money reduce(String curr){
        return new Money(augmend.amount + addmend.amount, curr);
    }
}
