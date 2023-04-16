import java.util.ArrayList;
import java.util.List;

public class ResponsibleTeacher extends Employee implements Teacher {
    
    //Attributes
    private List<DesignatedCourse> courses = new ArrayList<>();

    //Constructors
    public ResponsibleTeacher(String lname, String fname) {
        super(lname, fname);
    }

    //Methods
    public String getEmployeeIdString() {
        return "OY_TEACHER_";
    }

    public String getCourses() {
        String coursestring = "";
        if (courses != null) {
            for (DesignatedCourse course : courses) {
                if (course != null) {
                    coursestring += "\n\t";
                    if (course.isResponsible()) {
                        coursestring += "Responsible teacher: ";
                    } else {
                        coursestring += "Teacher: ";
                    }
                    coursestring += course.toString();
                }
            }
        }
        return coursestring;
    }

    public void setCourses(List<DesignatedCourse> courses) {
        if (courses != null) {
            this.courses = courses;
        }
    }

    public String toString() {
        return
        "Teacher id: " + getEmployeeIdString() + getId() +
        "\n\tFirst name: " + getFirstName() + ", Last name: " + getLastName() +
        "\n\tBirthdate: " + getBirthDate() +
        "\n\tSalary: " + calculatePayment() +
        "\n\tTeacher for courses:" + getCourses()
        ;
    }
}