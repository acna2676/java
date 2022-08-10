package money;

public class Dollar extends Money {

    Dollar(int amount, String currency) {
        super(amount, currency);
    }


    Money times(int multiplier) {
        // this.amount *= multiplier;
        return Money.dollar(amount * multiplier);
    }

}
