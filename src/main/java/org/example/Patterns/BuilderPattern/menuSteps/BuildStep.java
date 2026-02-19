package org.example.Patterns.BuilderPattern.menuSteps;

import org.example.Patterns.BuilderPattern.domain.Menu;

public interface BuildStep {
    BuildStep withDrink(String drink);
    Menu build();
}
