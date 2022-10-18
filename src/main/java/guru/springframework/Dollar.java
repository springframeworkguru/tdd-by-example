package guru.springframework;

public class Dollar extends Money{
    // private int amount; This was transfer to the Money class because of inheritance
    public Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object){
        Money dollar = (Money) object;
        return amount == dollar.amount;
    }
}
