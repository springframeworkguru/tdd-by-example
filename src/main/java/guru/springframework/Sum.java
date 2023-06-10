package guru.springframework;

public class Sum implements Expression{

    Expression augend;
    Expression addmend;

    public Sum(Expression augend, Expression addmend) {
        this.augend = augend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount + addmend.reduce(bank,to).amount;
        return new Money(amount,to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this,addend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augend.times(multiplier),addmend.times(multiplier));
    }
}
