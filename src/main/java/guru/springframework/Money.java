package guru.springframework;

public abstract class Money {

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
                && this.currency==testObject.currency;
    }

    public Money times(int multiplyBy) {
        return Money.dollar(amount*multiplyBy);

    }

    public static Money dollar(int amount){
        return new Dollar(amount,"USD");
    }

    public static Money franc(int amount){
        return new Franc(amount,"CHF");
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
