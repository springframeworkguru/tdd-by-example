package guru.springframework;

/**
 * Created by jt on 2018-10-07.
 */
public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

    Expression times(int multiplier);
}
