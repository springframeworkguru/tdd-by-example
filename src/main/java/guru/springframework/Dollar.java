package guru.springframework;

public class Dollar extends Money{
    // private int amount; This was transfer to the Money class because of inheritance
    public Dollar(int amount, String currency){
        super(amount, currency);
    }


    public Money times(int multiplier){
        return Money.dollar(amount * multiplier);
    }


}
