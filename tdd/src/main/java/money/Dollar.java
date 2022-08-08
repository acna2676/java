package money;

public class Dollar extends Money {

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        // this.amount *= multiplier;
        return new Dollar(amount * multiplier);
    }

}
