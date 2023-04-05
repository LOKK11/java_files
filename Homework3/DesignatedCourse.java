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

    public void setCourse(Course course) {
        if (course != null) {
            this.course = course;
        }
    }

    public boolean isResponsible() {
        return responsible;
    }

    public void setResponsible(boolean responsible) {
        this.responsible = responsible;
    }

    public boolean getResponsible() {
        return responsible;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 2000 && year <= ConstantValues.CURRENT_YEAR + 1) {
            this.year = year;
        }
    }

    public String toString() {
        return
            course.toString() + ", year=" + year + "]"; 
    }
}