package org.example.Patterns.DecoratorPattern.base;

import org.example.Patterns.DecoratorPattern.BubbleTea;

import java.math.BigDecimal;

public class MatchaBase implements BubbleTea {
    @Override
    public String getDescription() {
        return "Matcha";
    }

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(3.0);
    }
}
