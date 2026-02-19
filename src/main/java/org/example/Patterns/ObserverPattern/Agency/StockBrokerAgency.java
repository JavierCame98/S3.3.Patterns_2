package org.example.Patterns.ObserverPattern.Agency;

import org.example.Patterns.ObserverPattern.Observer.Observer;
import org.example.Patterns.ObserverPattern.Stock.StockState;

public class StockBrokerAgency implements Observer {

    private String name;
    private StockState state;
    private double price;

    public StockBrokerAgency(String name) {
        this.name = name;
        this.state = StockState.UNDEFINED;
        this.price = 0.0;
    }

    @Override
    public void update(StockState state, double price) {
        this.state = state;
        this.price = price;
    }

    public static String template = "%s agency received notification: Stock market went %s | Current Value: $%.2f";

    @Override
    public String toString() {
        return String.format(template, name, state, price);
    }
}
