//package dev.m3s.programming2.homework2;

public class Degree {

    //Attributes

    private static final int MAX_COURSES = 50;
    private int count = 0;
    private String degreeTitle = ConstantValues.NO_TITLE;
    private String titleOfThesis = ConstantValues.NO_TITLE;
    private StudentCourse[] myCourses = new StudentCourse[MAX_COURSES];


    //Methods

    public StudentCourse[] getCourses() {
        return myCourses;
    }

    public void addStudentCourses(StudentCourse[]courses) {
        for (StudentCourse course : courses) {
            if (addStudentCourse(course)) {
                myCourses[count] = course;
                count++;
            }
        }
    }

    private boolean addStudentCourse(StudentCourse course) {
        if (course != null && count < MAX_COURSES) {
            return true;
        } else {
            return false;
        }
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        if (degreeTitle != null) {
            this.degreeTitle = degreeTitle;
        }
    }

    public String getTitleOfThesis() {
        return titleOfThesis;
    }

    public void setTitleOfThesis(String titleOfThesis) {
        if (titleOfThesis != null) {
            this.titleOfThesis = titleOfThesis;
        }
    }

    public double getCreditsByBase(char base) {
        double totalCredits = 0.0;
        for (StudentCourse studentCourse : myCourses) {
            if (isCourseCompleted(studentCourse) && studentCourse.getCourse().getCourseBase() == base) {
                totalCredits += studentCourse.getCourse().getCredits();
            }
        }
        return totalCredits;
    }

    public double getCreditsByType(final int courseType) {
        double totalCredits = 0.0;
        for (StudentCourse studentCourse : myCourses) {
            if (isCourseCompleted(studentCourse) && studentCourse.getCourse().getCourseType() == courseType) {
                totalCredits += studentCourse.getCourse().getCredits();
            }
        }
        return totalCredits;
    }

    public double getCredits() {
        double totalCredits = 0.0;
        for (StudentCourse studentCourse : myCourses) {
            totalCredits += studentCourse.getCourse().getCredits();
        }
        return totalCredits;        
    } 

    private boolean isCourseCompleted(StudentCourse c) {
        if (c != null && c.isPassed()) {
            return true;
        } else {
            return false;
        }
    }

    public void printCourses() {
        for (StudentCourse studentCourse : myCourses) {
            System.out.println(studentCourse);
        }
    }

    public String toString() {
        String courseStrings = "";
        int i = 1;
        for (StudentCourse studentCourse : myCourses) {
            if (studentCourse != null) {
                courseStrings += "\n\t" + i + ". " + studentCourse.toString();
                i++;
            }
        }
        return 
        "Degree [Title: \"" + degreeTitle + "\" (courses: " + (i - 1) + ")" +
        "\n\tThesis title: \"" + titleOfThesis + "\"" + courseStrings + "]"
        ;
    }
}