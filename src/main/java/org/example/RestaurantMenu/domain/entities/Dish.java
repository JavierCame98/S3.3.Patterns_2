package org.example.RestaurantMenu.domain.entities;

public abstract class Dish {

    private String name;
    private boolean isVegan;
    private boolean glutenFree;

    public Dish(String name) {
        this.name = name;
    }

    public void setVegan() {
        this.isVegan = true;
    }

    public void setGlutenFree() {
        this.glutenFree = true;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", isVegan=" + isVegan +
                ", glutenFree=" + glutenFree +
                '}';
    }
}
