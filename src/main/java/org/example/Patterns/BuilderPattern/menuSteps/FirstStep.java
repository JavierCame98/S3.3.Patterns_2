package org.example.Patterns.BuilderPattern.menuSteps;

public interface FirstStep {
    EntrantStep withEntrant(String name);
    MainCourseStep withMainCourse(String name);
}
