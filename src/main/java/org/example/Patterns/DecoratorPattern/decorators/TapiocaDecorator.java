package org.example.Patterns.DecoratorPattern.decorators;

import org.example.Patterns.DecoratorPattern.BubbleTea;

import java.math.BigDecimal;

public class TapiocaDecorator extends BubbleTeaDecorator {

    public TapiocaDecorator(BubbleTea bubbleTea) {
        super(bubbleTea);
    }


    @Override
    public String getDescription() {
        return bubbleTea.getDescription() + " + 0.50 Tapioca";
    }

    @Override
    public BigDecimal getCost() {
        return bubbleTea.getCost().add(BigDecimal.valueOf(0.50));
    }
}
