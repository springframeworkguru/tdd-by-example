package guru.springframework;

public class Dollar {
   int currency;
    public Dollar(int currency) {
        this.currency=currency;
    }

    public void times (int amount){
        currency = currency*amount;
    }
}
