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
                && getClass().equals(testObject.getClass());
    }

    public abstract Money times(int multiplyBy);

    public static Money dollar(int amount){
        return new Dollar(amount,"USD");
    }

    public static Money franc(int amount){
        return new Franc(amount,"CHF");
    }
}
