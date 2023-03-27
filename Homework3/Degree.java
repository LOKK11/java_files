import java.util.ArrayList;
import java.util.List;

//package dev.m3s.programming2.homework2;

public class Degree {

    //Attributes

    private static final int MAX_COURSES = 50;
    private int count = 0;
    private String degreeTitle = ConstantValues.NO_TITLE;
    private String titleOfThesis = ConstantValues.NO_TITLE;
    private List<StudentCourse> myCourses = new ArrayList<>();


    //Methods

    public List<StudentCourse> getCourses() {
        return myCourses;
    }

    public void addStudentCourses(List<StudentCourse> courses) {
        if (courses != null) {
            for (StudentCourse course : courses) {
                addStudentCourse(course);
            }
        }
    }

    public boolean addStudentCourse(StudentCourse course) {
        if (course != null && count < MAX_COURSES) {
            myCourses.add(course);
            count++;
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
        if (myCourses != null) {
            for (StudentCourse studentCourse : myCourses) {
                if (isCourseCompleted(studentCourse) && studentCourse.getCourse().getCourseBase() == base) {
                    totalCredits += studentCourse.getCourse().getCredits();
                }
            }
        }
        return totalCredits;
    }

    public double getCreditsByType(final int courseType) {
        double totalCredits = 0.0;
        if (myCourses != null) {
            for (StudentCourse studentCourse : myCourses) {
                if (isCourseCompleted(studentCourse) && (studentCourse.getCourse().getCourseType() == courseType
                || courseType == ConstantValues.ALL)) {
                    totalCredits += studentCourse.getCourse().getCredits();
                }
            }
        }
        return totalCredits;
    }

    public double getCredits() {
        double totalCredits = 0.0;
        if (myCourses != null) {
            for (StudentCourse studentCourse : myCourses) {
                if (isCourseCompleted(studentCourse)) {
                    totalCredits += studentCourse.getCourse().getCredits();
                }
            }
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
        System.out.println(toString());
    }

    public List<Double> getGPA(int type) {
        double sum = 0.0;
        double count = 0.0;
        double average = 0.0;
        List<Double> values = new ArrayList<>();
        values.add(sum);
        values.add(count);
        values.add(average);
        if (type != ConstantValues.OPTIONAL && type != ConstantValues.MANDATORY && type != ConstantValues.ALL) {
            return values;
        }
        sum = getCreditsByType(type); 
        for (StudentCourse studentCourse : myCourses) {
            if (isCourseCompleted(studentCourse) && studentCourse.getCourse().getCourseType() == type
            && studentCourse.getCourse().isNumericGrade()) {
                count++;
            }
        }
        average = sum / count;
        return values;
    
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