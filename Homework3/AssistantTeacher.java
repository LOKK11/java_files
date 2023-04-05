public class AssistantTeacher extends Employee implements Teacher, Payment {

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
        this.courses = courses;
    }

    public void toString() {
        return
        "Teacher id: " + getEmployeeIdString() + empId
    }
}