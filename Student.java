//package dev.m3s.programming2.homework2;

import java.util.Random;

public class Student {
    
    //Attributes 
    private Random rand = new Random(); 
    private String firstName = ConstantValues.NO_NAME;
    private String lastName = ConstantValues.NO_NAME;
    private int id;
    private int startYear = ConstantValues.CURRENT_YEAR;
    private int graduationYear;
    private String birthDate = ConstantValues.NO_BIRTHDATE;
    private int degreeCount = 3;
    private Degree[] degrees;
    private PersonID personId = new PersonID();
    //Attribute status is the string for toString that is defined by whether
    //the student has graduated or not.
    private String status;


    //Constructors
    public Student() { 
        id = getRandomId();
        degrees = new Degree[degreeCount]; 
        degrees[0] = new Degree();
        degrees[1] = new Degree();
        degrees[2] = new Degree();
    }

    public Student(String lname, String fname) {
        if (lname != null && fname != null) {
            firstName = fname;
            lastName = lname;
        }
        id = getRandomId();
        degrees = new Degree[degreeCount];
    }



    //Methods 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public int getId() {
        return id; 
    }

    public void setId(final int id) {
        if (id > 0 && id < 101) {
            this.id = id;
        } 
    }

    public String getBachelorCreditsString(double bachelorCredits) {
        //This method returns the string for bachelor credits needed in toString method.
        if (bachelorCredits >= ConstantValues.BACHELOR_CREDITS) {
            return
                "Total bachelor credits completed (" + 
                bachelorCredits + "/" + ConstantValues.BACHELOR_CREDITS + ")"
                ;
        } else {
            return
                "Missing bachelor credits " + (ConstantValues.BACHELOR_CREDITS - bachelorCredits) +
                " (" + bachelorCredits + "/" + ConstantValues.BACHELOR_CREDITS + ")"
                ;
        }
    }

    public double getMasterCredits() {
        if (degrees[1] != null) {
            return degrees[1].getCredits();
        } else {
            return 0.0;
        }
    }

    public double getBachelorCredits() {
        if (degrees[0] != null) {
            return degrees[0].getCredits();
        } else {
            return 0.0;
        }
    }

    public String getTitleOfBachelorThesis() {
        if (degrees[0] != null) {
            return degrees[0].getTitleOfThesis(); 
        } else {
            return ConstantValues.NO_TITLE;
        }
    }

    public String getTitleOfMastersThesis() {
        if (degrees[1] != null) {
            return degrees[1].getTitleOfThesis(); 
        } else {
            return ConstantValues.NO_TITLE;
        }
    }

    public String getMasterCreditsString(final double masterCredits) {
        //This method returns the string for masters credits needed in toString method.
        if (masterCredits >= ConstantValues.MASTER_CREDITS) {
            return
                "Total master's credits completed (" + 
                masterCredits + "/" + ConstantValues.MASTER_CREDITS + ")"
                ;
        } else {
            return 
                "Missing master's credits " + (ConstantValues.MASTER_CREDITS - masterCredits) +
                " (" + masterCredits + "/" + ConstantValues.MASTER_CREDITS + ")"
                ;
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
            degrees[i].setDegreeTitle(dName); 
        }
    }

    public boolean addCourse(final int i, StudentCourse course) {
        if (0 <= i && i < degreeCount) {
            degrees[i].addStudentCourse(course); 
            return true;
        } else {
            return false;
        }
    }

    public int addCourses(final int i, StudentCourse[] courses) {
        int count = 0;
        for (StudentCourse course : courses) {
            if (addCourse(i, course)) {
                count++;
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
                System.out.println();
            }
        }
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
            degrees[i].setTitleOfThesis(title);
        }
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String setBirthDate(String personId) {
        if (this.personId.setPersonId(personId) == "Ok") {
            birthDate = this.personId.getBirthDate();
            return birthDate;
        } else {
            return "No change";
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
        int randId = rand.nextInt(ConstantValues.MAX_ID) + 1;
        return randId;
    }

    public String toString() {
        hasGraduated();
        return 
            "Student id: " + id +
            "\n\tFirstName: " + firstName + ", LastName: " + lastName +
            "\n\tDate of birth: " + birthDate +
            "\n\tStatus: " + status +
            "\n\tStartYear: " + startYear + " (Studies have lasted for " + getStudyYears() + " years)" +
            "\n\tTotal credits: " + (getBachelorCredits() + getMasterCredits()) +
            "\n\tBachelorCredits: " + getBachelorCredits() + 
            "\n\t\t" + getBachelorCreditsString(getBachelorCredits()) +
            "\n\t\tTitle of BSc Thesis: \"" + getTitleOfBachelorThesis() + "\"" +
            "\n\tMasterCredits: " + getMasterCredits() + 
            "\n\t\t" + getMasterCreditsString(getMasterCredits()) + 
            "\n\t\tTitleOfMastersThesis: \"" + getTitleOfMastersThesis() + "\""
            ;
        
    }
}
