package org.example.RestaurantMenu.menuSteps;

public interface FirstStep {
    EntrantStep withEntrant(String name);
    MainCourseStep withMainCourse(String name);
}
