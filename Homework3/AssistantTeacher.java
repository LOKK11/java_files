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

    public String getCourses() {
        return "LOKKI";
    }

    public void setCourses(List<DesignatedCourse> courses) {
        if (courses != null) {

        }
    }

    public String toString() {
        return
        "Teacher id: " + getEmployeeIdString() + getIdString() +
        "\n\tFirst name: " + getFirstName() + ", Last name: " + getLastName() +
        "\n\tBirthdate: " + getBirthDate() +
        "\n\tSalary: " + calculatePayment() +
        "\n\tAssistant for courses:" + courses.toString();
        ;
    }
}