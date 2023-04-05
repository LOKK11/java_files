public class DesignatedCourse {

    //Attributes
    private Course course;
    private boolean responsible;
    private int year;

    //Constructors
    public DesignatedCourse() {

    }

    public DesignatedCourse(Course course, boolean resp, int year) {
        this.course = course;
        responsible = resp;
        this.year = year;
    }

    //Methods
    public Course getCourse() {
        return course;
    }

    
}