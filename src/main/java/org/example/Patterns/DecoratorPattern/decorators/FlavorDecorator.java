package org.example.Patterns.DecoratorPattern.decorators;

import org.example.Patterns.DecoratorPattern.BubbleTea;

import java.math.BigDecimal;

public class FlavorDecorator extends BubbleTeaDecorator {

    private String flavor;

    public FlavorDecorator(BubbleTea bubbleTea, String flavor) {
        super(bubbleTea);
        this.flavor = flavor;
    }


    @Override
    public String getDescription() {
        return String.format("%s + 0.60 %s", bubbleTea.getDescription(), flavor);
    }

    @Override
    public BigDecimal getCost() {
        return bubbleTea.getCost().add(BigDecimal.valueOf(0.60));
    }
}
