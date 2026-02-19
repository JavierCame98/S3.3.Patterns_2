package org.example.Patterns.BuilderPattern.menuSteps;

public interface MainCourseStep extends BuildStep {
    MainCourseStep isVegan();
    MainCourseStep isGlutenFree();
    MainCourseStep withSupplements(String supplement);
    BuildStep withDessert(String dessert);
    BuildStep withCoffe(String coffe);
}
