package dev.m3s.programming2.homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.text.DecimalFormat;

public class Student extends Person {
    
    //Attributes 
    private Random rand = new Random(); 
    private int id;
    private int startYear = ConstantValues.CURRENT_YEAR;
    private int graduationYear;
    private int degreeCount = 3;
    private List<Degree> degrees = new ArrayList<>();
    //Attribute status is the string for toString that is defined by whether
    //the student has graduated or not.
    private String status;


    //Constructors
    public Student(String lname, String fname) {
        super(lname, fname);
        id = getRandomId();
        degrees.add(new Degree());
        degrees.add(new Degree());
        degrees.add(new Degree());
    }



    //Methods 
    private String getTwoDecimalString(double d) {
        //Changes a double to a 2 decimal string.
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(d);
    }

    public int getId() {
        return id; 
    }

    public void setId(final int id) {
        if (id >= 1 && id <= 100) {
            this.id = id;
        } 
    }

    public String getBachelorCreditsString() {
        //This method returns the string for bachelor credits needed in toString method. 
        String str = "";
        if (degrees.get(0).getCredits() >= ConstantValues.BACHELOR_CREDITS) {
            str +=
                "Total bachelor credits completed (" + 
                degrees.get(0).getCredits() + "/" + ConstantValues.BACHELOR_CREDITS + ")"
                ;
        } else {
            str +=
                "Missing bachelor credits " + (ConstantValues.BACHELOR_CREDITS - degrees.get(0).getCredits()) +
                " (" + degrees.get(0).getCredits() + "/" + ConstantValues.BACHELOR_CREDITS + ")"
                ;
        }
        if (degrees.get(0).getCreditsByType(ConstantValues.MANDATORY) >= ConstantValues.BACHELOR_MANDATORY) {
            str +=
                "\n\t\tAll mandatory bachelor credits completed (" +
                degrees.get(0).getCreditsByType(ConstantValues.MANDATORY) + "/" + ConstantValues.BACHELOR_MANDATORY + ")";
        } else {
            str +=
                "\n\t\tMissing mandatory bachelor credits " + (ConstantValues.BACHELOR_MANDATORY - 
                degrees.get(0).getCreditsByType(ConstantValues.MANDATORY)) + "(" + 
                degrees.get(0).getCreditsByType(ConstantValues.MANDATORY) + "/" + ConstantValues.BACHELOR_MANDATORY + ")";
        }
        str += "\n\t\tGPA of Bachelor studies: " + getTwoDecimalString(degrees.get(0).getGPA(2).get(2));
        return str;
    }

    public String getMasterCreditsString() {
        //This method returns the string for master credits needed in toString method. 
        String str = "";
        if (degrees.get(1).getCredits() >= ConstantValues.MASTER_CREDITS) {
            str +=
                "Total master credits completed (" + 
                degrees.get(1).getCredits() + "/" + ConstantValues.MASTER_CREDITS + ")"
                ;
        } else {
            str +=
                "Missing master credits " + (ConstantValues.MASTER_CREDITS - degrees.get(1).getCredits()) +
                " (" + degrees.get(1).getCredits() + "/" + ConstantValues.MASTER_CREDITS + ")"
                ;
        }
        if (degrees.get(1).getCreditsByType(ConstantValues.MANDATORY) >= ConstantValues.MASTER_MANDATORY) {
            str +=
                "\n\t\tAll mandatory master credits completed (" +
                degrees.get(1).getCreditsByType(ConstantValues.MANDATORY) + "/" + ConstantValues.MASTER_MANDATORY + ")";
        } else {
            str +=
                "\n\t\tMissing mandatory master credits " + (ConstantValues.MASTER_MANDATORY - 
                degrees.get(1).getCreditsByType(ConstantValues.MANDATORY)) + "(" + 
                degrees.get(1).getCreditsByType(ConstantValues.MANDATORY) + "/" + ConstantValues.MASTER_MANDATORY + ")";
        }
        str += "\n\t\tGPA of Master studies: " + getTwoDecimalString(degrees.get(1).getGPA(2).get(2));
        return str;
    }

    public double getMasterCredits() {
        if (degrees.get(1) != null) {
            return degrees.get(1).getCredits();
        } else {
            return 0.0;
        }
    }

    public double getBachelorCredits() {
        if (degrees.get(0) != null) {
            return degrees.get(0).getCredits();
        } else {
            return 0.0;
        }
    }

    public String getTitleOfBachelorThesis() {
        if (degrees.get(0) != null) {
            return degrees.get(0).getTitleOfThesis(); 
        } else {
            return ConstantValues.NO_TITLE;
        }
    }

    public String getTitleOfMastersThesis() {
        if (degrees.get(1) != null) {
            return degrees.get(1).getTitleOfThesis(); 
        } else {
            return ConstantValues.NO_TITLE;
        }
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(final int startYear) {
        if (startYear <= ConstantValues.CURRENT_YEAR && startYear > 2000) {
            this.startYear = startYear;
        }
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public String setGraduationYear(final int graduationYear) {
        if (canGraduate()) {
            if (graduationYear <= ConstantValues.CURRENT_YEAR && graduationYear >= startYear) {
                this.graduationYear = graduationYear;
                return "Ok";
            } else {
                return "Check graduation year";
            }
        } else {
            return "Check amount of required credits";
        }
    }

    private boolean hasGraduated() {
        //This method checks whether the student has graduated or not and
        //also changes the students status String based on that.
        if (graduationYear == 0) {
            status = "The student has not graduated, yet";
            return false;
        } else {
            status = "The student has graduated in " + graduationYear;
            return true;
        }
    }
    
    private boolean canGraduate() {
        if (getBachelorCredits() >= ConstantValues.BACHELOR_CREDITS && getMasterCredits() >= ConstantValues.MASTER_CREDITS) {
            if (getTitleOfBachelorThesis() != ConstantValues.NO_TITLE && getTitleOfMastersThesis() != ConstantValues.NO_TITLE) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void setDegreeTitle(final int i, String dName) {
        if (0 <= i && i < degreeCount) {
            degrees.get(i).setDegreeTitle(dName); 
        }
    }

    public boolean addCourse(final int i, StudentCourse course) {
        if (0 <= i && i < degreeCount && course != null) {
            if (degrees.get(i).addStudentCourse(course)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int addCourses(final int i, List<StudentCourse> courses) {
        int count = 0;
        if (courses != null) {
            for (StudentCourse course : courses) {
                if (addCourse(i, course)) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printCourses() {
        for (Degree degree : degrees) {
            if (degree != null) {
                for (StudentCourse course : degree.getCourses()) {
                    if (course != null) {
                        System.out.println(course.toString());
                    }
                }
            }
        }
        System.out.println();
    }

    public void printDegrees() {
        for (Degree degree : degrees) {
            if (degree != null) {
                System.out.println(degree.toString());
                System.out.println();
            }
        }
    }

    public void setTitleOfThesis(final int i, String title) {
        if (0 <= i && i < degreeCount) {
            degrees.get(i).setTitleOfThesis(title);
        }
    }

    public int getStudyYears() {
        if (hasGraduated()) {
            return graduationYear - startYear; 
        } else { 
            return ConstantValues.CURRENT_YEAR - startYear;
        }
    }
    
    private int getRandomId() {
        int randId = rand.nextInt(ConstantValues.MAX_STUDENT_ID) + 1;
        return randId;
    }

    private String getStudyYearString() {
        if (!hasGraduated()) {
            return " (Studies have lasted for " + getStudyYears() + " years)";
        } else {
            return " (Studies lasted for " + getStudyYears() + " years)";
        }
    }

    public String toString() {
        hasGraduated();
        String gpa = getTwoDecimalString((degrees.get(0).getGPA(2).get(0) + degrees.get(1).getGPA(2).get(0)) / 
        (degrees.get(0).getGPA(2).get(1) + degrees.get(1).getGPA(2).get(1)));
        return 
            getIdString() +
            "\n\tFirstName: " + getFirstName() + ", LastName: " + getLastName() +
            "\n\tDate of birth: " + getBirthDate() +
            "\n\tStatus: " + status +
            "\n\tStartYear: " + startYear + getStudyYearString() +
            "\n\tTotal credits: " + (getBachelorCredits() + getMasterCredits()) + 
            " (GPA = " + gpa + ")" +
            "\n\tBachelorCredits: " + getBachelorCredits() + 
            "\n\t\t" + getBachelorCreditsString() +
            "\n\t\tTitle of BSc Thesis: \"" + getTitleOfBachelorThesis() + "\"" +
            "\n\tMasterCredits: " + getMasterCredits() + 
            "\n\t\t" + getMasterCreditsString() + 
            "\n\t\tTitleOfMastersThesis: \"" + getTitleOfMastersThesis() + "\"" +
            "\n"
            ;
        
    }

    public String getIdString() {
        return "Student id: " + id;
    }

}
