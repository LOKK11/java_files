//package dev.m3s.programming2.homework2;

public class Course {
    
    //Attributes
    private String name;
    private String courseCode;
    private char courseBase;
    private int courseType;
    private int period;
    private double credits;
    private boolean numericGrade;

    //Constructors
    public Course() {}

    public Course(
        String name, 
        final int code, 
        char courseBase, 
        final int type, 
        final int period, 
        final double credits, 
        boolean numericGrade
    ) {
        setName(name);
        setCourseCode(code, courseBase);
        setCourseType(type);
        setPeriod(period);
        setCredits(credits);
        setNumericGrade(numericGrade);
    }

    public Course(Course course) {

    }
    
    //Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || name != "") {
            this.name = name;
        }
        
    }

    public String getCourseTypeString() {
        if (courseType == ConstantValues.MANDATORY) {
            return "Mandatory";
        } else {
            return "Optional";
        }
    }

    public int getCourseType() {
        return courseType;
    }

    public void setCourseType(final int type) {
        if (type == ConstantValues.OPTIONAL || type == ConstantValues.MANDATORY) {
            courseType = type;
        }
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(final int courseCode, Character courseBase) {
        if (courseCode > 0 && courseCode < 1000000) {
            String courseCodeString = String.valueOf(courseCode); 
            switch (Character.toUpperCase(courseBase)) {
                case 'A':
                    this.courseCode = courseCodeString += "A";
                    this.courseBase = 'A';
                    break;
                case 'P':
                    this.courseCode = courseCodeString += "P";
                    this.courseBase = 'P';
                    break;
                case 'S':
                    this.courseCode = courseCodeString += "S";
                    this.courseBase = 'S';
                    break;
            }
        }
    }

    public char getCourseBase() {
        return courseBase;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(final int period) {
        if (period >= ConstantValues.MIN_PERIOD && period <= ConstantValues.MAX_PERIOD) {
            this.period = period;
        }
    }

    public double getCredits() {
        return credits;
    }

    private void setCredits(final double credits) {
        if (credits > ConstantValues.MIN_CREDITS && credits <= ConstantValues.MAX_COURSE_CREDITS) {
            this.credits = credits;
        }
    }

    public boolean isNumericGrade() {
        return numericGrade;
    }

    public void setNumericGrade(boolean numericGrade) {
        this.numericGrade = numericGrade;
    }

    public String toString() {
        return
        "[" + courseCode + " ( " + credits + " cr), \"" + name +
        "\". " + getCourseTypeString() + ", period: " + period + ".]"
        ;
    }
}