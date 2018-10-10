package guru.springframework;

/**
 * Created by jt on 2018-10-07.
 */
public class Bank {

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(toCurrency);
    }
}
