package org.example.RestaurantMenu.menuSteps;

import org.example.RestaurantMenu.domain.Menu;

public interface BuildStep {
    BuildStep withDrink(String drink);
    Menu build();
}
