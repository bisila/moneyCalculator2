package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CurrencySet implements Iterable {
    private Map <String,Currency> currencySet;

    public CurrencySet() {
        this.currencySet = new HashMap <> ();
    }

    public int size() {
        return currencySet.size();
    }

    public boolean isEmpty() {
        return currencySet.isEmpty();
    }

    public Currency get(String code) {
        return currencySet.get(code);
    }
       
    public void add(Currency currency){
        currencySet.put(currency.getCode(),currency);
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
