package org.example.Patterns.DecoratorPattern.decorators;

import org.example.Patterns.DecoratorPattern.BubbleTea;

import java.math.BigDecimal;

public class IceDecorator extends BubbleTeaDecorator {

    public IceDecorator(BubbleTea bubbleTea) {
        super(bubbleTea);
    }


    @Override
    public String getDescription() {
        return bubbleTea.getDescription() + " + 0.25 Ice";
    }

    @Override
    public BigDecimal getCost() {
        return bubbleTea.getCost().add(BigDecimal.valueOf(0.25));
    }
}
