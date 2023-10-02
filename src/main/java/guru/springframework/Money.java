package guru.springframework;

public class Money implements Expression {

    protected int amount;
    protected String currency;

    public Money(int amount,String currency) {
        this.amount=amount;
        this.currency=currency;
    }

    protected String currency(){
        return currency;
    };

    public boolean equals(Object object){
        Money testObject =(Money) object;
        return testObject.amount == amount
                && currency==testObject.currency;
    }

    public Money times(int multiplyBy) {
        return new Money(amount * multiplyBy,currency);

    }

    public static Money dollar(int amount){
        return new Money(amount, "USD") {
        };
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF") {
        };
    }

    public Expression plus(Money money){
        return new Money(amount+money.amount,currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
