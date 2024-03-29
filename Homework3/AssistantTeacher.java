package dev.m3s.programming2.homework3;

import java.util.ArrayList;
import java.util.List;

public class AssistantTeacher extends Employee implements Teacher {

    //Attributes 
        private List<DesignatedCourse> courses = new ArrayList<>();

    //Constructors
    public AssistantTeacher(String lname, String fname) {
        super(lname, fname);
    }

    //Methods
    public String getEmployeeIdString() {
        return "OY_ASSISTANT_";
    }

    public void setCourses(List<DesignatedCourse> courses) {
        if (courses != null) {
            this.courses = courses;
        }
    }

    public String getCourses() {
        String coursestring = "";
        if (courses != null) {
            for (DesignatedCourse course : courses) {
                if (course != null) {
                    coursestring += "\n\t" + course.toString();
                }
            }
        }
        return coursestring;
    }

    public String toString() {
        return
        "Teacher id: " + getIdString() +
        "\n\tFirst name: " + getFirstName() + ", Last name: " + getLastName() +
        "\n\tBirthdate: " + getBirthDate() +
        "\n\tSalary: " + calculatePayment() + "0" +
        "\n\tAssistant for courses:" + getCourses() +
        "\n"
        ;
    }
}