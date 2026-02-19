package org.example.Patterns.DecoratorPattern.base;

import org.example.Patterns.DecoratorPattern.BubbleTea;

import java.math.BigDecimal;

public class TeaBase implements BubbleTea {
    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(3.00);
    }
}
