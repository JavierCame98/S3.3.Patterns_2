package org.example.Patterns.BuilderPattern.menuSteps;

public interface EntrantStep {
    EntrantStep isVegan();
    EntrantStep isGlutenFree();
    MainCourseStep withMainCourse(String name);
}
