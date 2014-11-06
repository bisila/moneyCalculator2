package process;

import model.ExchangeRate;
import model.Money;

public class Exchanger {

    public Money exchange(Money money, ExchangeRate exchangeRate) {
        if (money.getCurrency() != exchangeRate.getFrom()) return null;
        return new Money(money.getAmount()*exchangeRate.getValue(), exchangeRate.getTo());
    }
}
