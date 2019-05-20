package guru.springframework;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier){
        return new Franc(amount * multiplier);

    }

    public int getAmount() {
        return amount;
    }

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
}
