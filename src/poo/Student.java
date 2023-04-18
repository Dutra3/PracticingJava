package poo;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private final List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
        course.getStudents().add(this);
    }

    public Course getCourseByName(String name) {
        for (Course course : this.courses) {
            if (course.getName().equalsIgnoreCase(name)) {
                return course;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
