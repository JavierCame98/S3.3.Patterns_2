package org.example.Patterns.ObserverPattern.Observer;

import org.example.Patterns.ObserverPattern.Stock.StockState;

public interface Observer {
    void update(StockState state, double price);

}
