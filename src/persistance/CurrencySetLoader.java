package persistance;

import java.util.HashMap;
import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    public CurrencySetLoader() {
    }
    
    public CurrencySet load(){
        CurrencySet currencySet = new CurrencySet();
        currencySet.add(new Currency ("Euro","€","EUR"));
        return currencySet;
    }
}
