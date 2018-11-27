package guru.springframework;

public class Frank extends Money{
    public Frank(int amount) {
        this.amount = amount;
    }

    Frank times(int multiplier) {
        return new Frank(amount * multiplier);
    }
}
