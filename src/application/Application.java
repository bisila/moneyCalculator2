package application;

import control.ExchangeOperation;
import model.Currency;
import model.CurrencySet;
import persistance.CurrencySetLoader;

public class Application {
    public static void main(String[] args){
        new ExchangeOperation().execute(new CurrencySetLoader().load());
    }
}
