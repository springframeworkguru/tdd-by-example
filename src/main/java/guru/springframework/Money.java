package guru.springframework;


/**
 * Created by jt on 2018-10-05.
 */
public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    protected String currency() {
        return currency;
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && this.currency == money.currency;
    }

    @Override
    public Money reduce(Bank bank, String to){
        return new Money(amount / bank.rate(this.currency, to), to);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, this.currency);
    }

    public Expression plus(Expression addend){
        return new Sum(this, addend);
    }
}
