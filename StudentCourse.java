//package dev.m3s.programming2.homework2;

public class StudentCourse {
    
    //Attributes

    private Course course;
    private int gradeNum;
    private int yearCompleted;


    //Constructors

    public StudentCourse() {

    }

    public StudentCourse(
        Course course,
        final int gradeNum,
        final int yearCompleted
    ) {
        setCourse(course);
        setGrade(gradeNum);
        setYear(yearCompleted);
    }


    //Metods

    public Course getCourse() {
        return course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }

    public int getGradeNum() {
        return gradeNum;
    }

    protected void setGrade(int gradeNum) {
        if (checkGradeValidity(gradeNum)) {
            this.gradeNum = gradeNum;
        }
        if (yearCompleted == 0) {
            yearCompleted = ConstantValues.CURRENT_YEAR;
        }
    }

    private String getGradeString() {
        if (gradeNum == 0) {
            return "\"Not graded\"";
        } else if (course.isNumericGrade()) {
            return String.valueOf(gradeNum);
        } else {
            return String.valueOf((char) Character.toUpperCase(gradeNum));
        }
    }

    private boolean checkGradeValidity(final int gradeNum) {
        if (gradeNum >= ConstantValues.MIN_GRADE && gradeNum <= ConstantValues.MAX_GRADE) {
            if (course.isNumericGrade()) {
                return true;
            } else { 
                return false;
            }
        } else if ((char) Character.toUpperCase(gradeNum) == ConstantValues.GRADE_FAILED || (char) Character.toUpperCase(gradeNum) == ConstantValues.GRADE_ACCEPTED) {
            if (!course.isNumericGrade()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean isPassed() {
        if (gradeNum == ConstantValues.MIN_GRADE || (char) Character.toUpperCase(gradeNum) == ConstantValues.GRADE_FAILED) {
            return false;
        } else {
            return true;
        }
    }

    public int getYear() {
        return yearCompleted;
    }

    public void setYear(final int year) {
        if (year > 2000 && year <= ConstantValues.CURRENT_YEAR) {
            yearCompleted = year;
        }
    }

    public String toString() {
        return
        "[" + course.getCourseCode() + " (" + course.getCredits() + " cr), \"" +
        course.getName() + "\". " + course.getCourseTypeString() + ", period: " +
        course.getPeriod() + ".] Year: " + yearCompleted + ", Grade: " + getGradeString() + ".]"
        ;
    }
}