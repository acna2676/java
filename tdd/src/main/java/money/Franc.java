package money;

public class Franc {
    private int amount; // = 10;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        // this.amount *= multiplier;
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}
