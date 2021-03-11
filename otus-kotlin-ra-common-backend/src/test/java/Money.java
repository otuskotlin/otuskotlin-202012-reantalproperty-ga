import java.util.Objects;

public class Money {
    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    double amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Double.compare(money.amount, amount) == 0 && Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    String currency;
}



