package money;

public class Dollar {
    private int amount; // = 10;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        // this.amount *= multiplier;
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}