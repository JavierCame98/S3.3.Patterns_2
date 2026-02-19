package org.example.Patterns.DecoratorPattern.decorators;

import org.example.Patterns.DecoratorPattern.BubbleTea;

import java.math.BigDecimal;

public class SugarDecorator extends BubbleTeaDecorator {

    public SugarDecorator(BubbleTea bubbleTea) {
        super(bubbleTea);
    }


    @Override
    public String getDescription() {
        return bubbleTea.getDescription() + " + 0.30 Sugar";
    }

    @Override
    public BigDecimal getCost() {
        return bubbleTea.getCost().add(BigDecimal.valueOf(0.30));
    }
}
