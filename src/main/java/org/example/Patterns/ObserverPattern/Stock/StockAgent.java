package org.example.Patterns.ObserverPattern.Stock;

import org.example.Patterns.ObserverPattern.Observer.Observer;
import org.example.Patterns.ObserverPattern.Observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class StockAgent implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private double currentPrice;
    private StockState status;

    public StockAgent(){
        this.currentPrice = 0.0;
        this.status = StockState.UNDEFINED;
    }

    public void updateMarketPrice (double newPrice){
        StockState newStatus = StockState.determinateState(newPrice, this.currentPrice);
        if(newStatus == StockState.STABLE) {
            return;
        }
        this.currentPrice = newPrice;
        this.status = newStatus;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(status, currentPrice));

    }
}
