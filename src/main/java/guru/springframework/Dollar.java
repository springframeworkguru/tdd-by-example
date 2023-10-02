package guru.springframework;

public class Dollar {

    int amount;
    public Dollar(int amount) {
        this.amount=amount;
    }
    int times(int multiplyBy){
        return this.amount=amount*multiplyBy;
    }
}
