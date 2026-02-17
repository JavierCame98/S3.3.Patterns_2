package org.example.RestaurantMenu.menuSteps;

public interface EntrantStep {
    EntrantStep isVegan();
    EntrantStep isGlutenFree();
    MainCourseStep withMainCourse(String name);
}
