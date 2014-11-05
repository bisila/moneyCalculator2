package ui;

import model.Exchange;

public class ExchangeDialog {
    private Exchange exchange;

    public ExchangeDialog(Exchange exchange) {
        this.exchange = exchange;
    }

    public Exchange getExchange() {
        return exchange;
    }
}