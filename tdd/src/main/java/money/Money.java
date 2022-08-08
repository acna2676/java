package money;

public class Money {
    protected int amount; // = 10;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
