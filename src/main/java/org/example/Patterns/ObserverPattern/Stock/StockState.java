package org.example.Patterns.ObserverPattern.Stock;

public enum StockState {
    UP, DOWN, UNDEFINED, STABLE;

    public static StockState determinateState(double newPrice, double currentPrice){
        double comparison = Double.compare(newPrice, currentPrice);
        if(comparison > 0) return UP;
        if(comparison < 0) return DOWN;
        return STABLE;
    }
}
