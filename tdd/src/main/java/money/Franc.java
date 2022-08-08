package money;

public class Franc extends Money {
    private int amount; // = 10;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        // this.amount *= multiplier;
        return new Franc(amount * multiplier);
    }
}
