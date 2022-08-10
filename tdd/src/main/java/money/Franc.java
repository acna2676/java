package money;

public class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        // this.amount *= multiplier;
        return new Franc(amount * multiplier);
    }
}
