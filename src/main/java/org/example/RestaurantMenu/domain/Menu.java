package org.example.RestaurantMenu.domain;

import org.example.RestaurantMenu.domain.entities.Dish;

public class Menu {

    private Dish entrant;
    private Dish mainCourse;
    private Dish complement;
    private String drink;

    public Menu(Dish entrant, Dish mainCourse, Dish complement, String drink) {
        this.entrant = entrant;
        this.mainCourse = mainCourse;
        this.complement = complement;
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "entrant=" + entrant +
                ", mainCourse=" + mainCourse +
                ", complement=" + complement +
                ", drink='" + drink + '\'' +
                '}';
    }
}
