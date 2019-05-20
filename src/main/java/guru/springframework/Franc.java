package guru.springframework;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount, currency);
;    }


    public Money times(int multiplier){
        return Money.franc(amount * multiplier);

    }


    /*
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        } else if (object.getClass() != this.getClass()) {
            return false;
        }

        Franc other = (Franc) object;
        if (amount == other.getAmount()) {
            return true;
        }
        return false;
    }

    */
}
