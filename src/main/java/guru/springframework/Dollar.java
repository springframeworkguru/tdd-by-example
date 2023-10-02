package guru.springframework;

public class Dollar {

    int amount;
    public Dollar(int amount) {
        this.amount=amount;
    }
    Dollar times(int multiplyBy){
        return new Dollar(amount*multiplyBy);
    }

    public boolean equals(Object object){
        Dollar testObject =(Dollar) object;
        return testObject.amount == amount;
    }
}
