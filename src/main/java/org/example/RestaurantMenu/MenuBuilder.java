package org.example.RestaurantMenu;

import org.example.RestaurantMenu.domain.*;
import org.example.RestaurantMenu.domain.entities.Complement;
import org.example.RestaurantMenu.domain.entities.Dish;
import org.example.RestaurantMenu.domain.entities.Entrant;
import org.example.RestaurantMenu.domain.entities.MainCourse;
import org.example.RestaurantMenu.menuSteps.*;

public class MenuBuilder implements FirstStep, EntrantStep, MainCourseStep, BuildStep{


    private Dish currentDish;
    private Dish entrant;
    private MainCourse mainCourse;
    private Dish complement;
    private String drink;

    @Override
    public MenuBuilder isVegan(){
       this.currentDish.setVegan();
       return this;
   }

    @Override
    public MenuBuilder isGlutenFree() {
        this.currentDish.setGlutenFree();
        return this;
    }

    @Override
    public EntrantStep withEntrant(String name) {
        this.entrant = new Entrant(name);
        this.currentDish = this.entrant;
        return this;
    }

    @Override
    public MainCourseStep withMainCourse(String name) {
        this.mainCourse = new MainCourse(name);
        this.currentDish = this.mainCourse;
        return this;
    }

    @Override
    public MainCourseStep withSupplements(String supplement){
        this.mainCourse.addSupplement(supplement);
        return this;
    }

    @Override
    public BuildStep withCoffe(String coffee) {
        this.complement = new Complement(coffee);
        return this;
    }

    @Override
    public BuildStep withDessert(String dessert) {
        this.complement = new Complement(dessert);
        return this;
    }

    @Override
    public BuildStep withDrink(String drink) {
        this.drink = drink;
        return this;
    }

    @Override
    public Menu build() {
        return new Menu(entrant, mainCourse, complement, drink);
    }


}
