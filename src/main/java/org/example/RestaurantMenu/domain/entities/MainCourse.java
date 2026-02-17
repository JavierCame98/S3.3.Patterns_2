package org.example.RestaurantMenu.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class MainCourse extends Dish {

    private List<String> supplements = new ArrayList<>();


    public MainCourse(String name) {
        super(name);
    }

    public void addSupplement(String supplement) {
        if (this.supplements == null) {
            this.supplements = new ArrayList<>();
        }
        this.supplements.add(supplement);
    }

    @Override
    public String toString() {
        return "MainCourse{" +
                "supplements=" + supplements +
                "} " + super.toString();
    }
}
