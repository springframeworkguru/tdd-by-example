package guru.springframework;

public class Franc {
    private int amount;
    public Franc(int amount){
        this.amount = amount;
    }

    Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object){
        Franc Franc = (Franc) object;
        return amount == Franc.amount;
    }
}
