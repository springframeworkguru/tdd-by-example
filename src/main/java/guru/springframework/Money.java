package guru.springframework;

public class Money {

    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object object){
        Money testObject =(Money) object;
        return testObject.amount == amount
                && getClass().equals(testObject.getClass());
    }

    Money times(int multiplyBy){
        return new Money(amount*multiplyBy);
    }
}
