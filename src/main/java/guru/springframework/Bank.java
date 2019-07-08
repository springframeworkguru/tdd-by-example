package guru.springframework;

public class Bank {

    public Money reduce(Expression source, String toCurrency){
        return Money.dollar(10);
    }

    public void halloBrille(){
        System.out.println("Brile");
    }
}
