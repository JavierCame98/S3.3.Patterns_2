package org.example.Patterns.DecoratorPattern;

import org.example.Patterns.DecoratorPattern.base.LatteBase;
import org.example.Patterns.DecoratorPattern.base.MatchaBase;
import org.example.Patterns.DecoratorPattern.base.TeaBase;
import org.example.Patterns.DecoratorPattern.decorators.*;

public class BubbleTeaBuilder {

    private BubbleTea currentBubbleTea;

    private BubbleTeaBuilder(BubbleTea base) {
        this.currentBubbleTea = base;
    }

    public static BubbleTeaBuilder latte(){
        return new BubbleTeaBuilder(new LatteBase());
    }

    public static BubbleTeaBuilder matcha(){
        return new BubbleTeaBuilder(new MatchaBase());
    }

    public static BubbleTeaBuilder tea(){
        return new BubbleTeaBuilder(new TeaBase());
    }

    public BubbleTeaBuilder withIce(){
        currentBubbleTea = new IceDecorator(currentBubbleTea);
        return this;
    }

    public BubbleTeaBuilder withSugar(){
        currentBubbleTea = new SugarDecorator(currentBubbleTea);
        return this;
    }

    public BubbleTeaBuilder withTapioca(){
        currentBubbleTea = new TapiocaDecorator(currentBubbleTea);
        return this;
    }

    public BubbleTeaBuilder withFlavor(String flavor){
        currentBubbleTea = new FlavorDecorator(currentBubbleTea, flavor);
        return this;
    }

    public BubbleTea build(){
        return currentBubbleTea;
    }

}
