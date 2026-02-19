package org.example.Patterns.DecoratorPattern.decorators;

import org.example.Patterns.DecoratorPattern.BubbleTea;

public abstract class BubbleTeaDecorator implements BubbleTea {

    protected final BubbleTea bubbleTea;
    protected BubbleTeaDecorator (BubbleTea bubbleTea){
        this.bubbleTea = bubbleTea;
    }

}
