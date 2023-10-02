package guru.springframework;

public class Bank {

    Money reduce(Expression expr, String currency){
        return expr.reduce(currency);
//        if (expr instanceof Money) return (Money) expr;
//        Sum expressionCasted= (Sum) expr;
//        return expressionCasted.reduce(currency);
    }
}
