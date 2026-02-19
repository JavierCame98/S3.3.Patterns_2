package org.example.Patterns.DecoratorPattern.base;

import org.example.Patterns.DecoratorPattern.BubbleTea;

import java.math.BigDecimal;

public class LatteBase implements BubbleTea {

    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public BigDecimal getCost() {
        return  BigDecimal.valueOf(3.50);
    }
}
