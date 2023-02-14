public class Student {
    
    //Attributes 
    private final int currentYear = 2023; 
    private String firstName = ConstantValues.NO_NAME;
    private String lastName = ConstantValues.NO_NAME;
    private int id;
    private double bachelorCredits = ConstantValues.MIN_CREDIT;
    private double masterCredits = ConstantValues.MIN_CREDIT;
    private String titleOfMastersThesis = ConstantValues.NO_TITLE;
    private String titleOfBachelorThesis = ConstantValues.NO_TITLE;
    private int startYear = currentYear;
    private int graduationYear;
    private String birthDate = ConstantValues.NO_BIRTHDATE;
    private String status;

    private String missingBachelor = 
    "Missing bachelor credits " + ConstantValues.BACHELOR_CREDITS +
    " (" + bachelorCredits + "/" + ConstantValues.BACHELOR_CREDITS + ")"
    ;

    private String missingMaster = 
    "Missing master credits " + ConstantValues.MASTER_CREDITS +
    " (" + masterCredits + "/" + ConstantValues.MASTER_CREDITS + ")"
    ;


    //Constructors
    public Student() { 
        this.id = getRandomId();
    }

    public Student(String lname, String fname) {
        firstName = fname;
        lastName = lname;
        this.id = getRandomId();
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
        this.lastName = lastName;   
    }

    public int getId() {
        return id; 
    }

    public void setId(int id) {
        if (id > 0 && id < 101) {
            this.id = id;
        } 
    }

    public double getBachelorCredits() {
        return bachelorCredits;
    }

    public void setBachelorCredits(final double bachelorCredits) {
        if (bachelorCredits >= ConstantValues.MIN_CREDIT && bachelorCredits <= ConstantValues.MAX_CREDITS) {
            this.bachelorCredits = bachelorCredits; 
            if (bachelorCredits >= ConstantValues.BACHELOR_CREDITS) {
                missingBachelor = 
                    "All required bachelor credits completed (" + 
                    bachelorCredits + "/" + ConstantValues.BACHELOR_CREDITS + ")"
                    ;
            } else {
                missingBachelor = 
                    "Missing bachelor credits " + (ConstantValues.BACHELOR_CREDITS - bachelorCredits) +
                    " (" + bachelorCredits + "/" + ConstantValues.BACHELOR_CREDITS + ")"
                    ;
            }
        }
    }

    public double getMasterCredits() {
        return masterCredits;
    }

    public void setMasterCredits(final double masterCredits) {
        if (masterCredits >= ConstantValues.MIN_CREDIT && masterCredits <= ConstantValues.MAX_CREDITS) {
            this.masterCredits = masterCredits;
            if (masterCredits >= ConstantValues.MASTER_CREDITS) {
                missingMaster = 
                    "All required master credits completed (" + 
                    masterCredits + "/" + ConstantValues.MASTER_CREDITS + ")"
                    ;
            } else {
                missingMaster = 
                    "Missing master credits " + (ConstantValues.MASTER_CREDITS - masterCredits) +
                    " (" + masterCredits + "/" + ConstantValues.MASTER_CREDITS + ")"
                    ;
            }
        }
    }

    public String getTitleOfMastersThesis() {
        return titleOfMastersThesis;
    }

    public void setTitleOfMastersThesis(String title) {
        if (title != null) {
            titleOfMastersThesis = title;
        }
    }

    public String getTitleOfBachelorThesis() {
        return titleOfBachelorThesis;
    }

    public void setTitleOfBachelorThesis(String title) {
        if (title != null) {
            titleOfBachelorThesis = title; 
        }
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(final int startYear) {
        if (startYear <= currentYear && startYear > 2000) {
            this.startYear = startYear;
        }
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public String setGraduationYear(final int graduationYear) {
        if (graduationYear <= currentYear && graduationYear >= startYear) {
            if (canGraduate()) {
                this.graduationYear = graduationYear;
                return "Ok";
            } else {
                return "Check the required studies";
            }
        } else {
            return "Check graduation year";
        }
    }

    private boolean hasGraduated() {
        if (graduationYear == 0) {
            status = "The student has not graduated, yet";
            return false;
        } else {
            status = "The student has graduated in " + graduationYear;
            return true;
        }
    }
    
    private boolean canGraduate() {
        if (bachelorCredits >= ConstantValues.BACHELOR_CREDITS && masterCredits >= ConstantValues.MASTER_CREDITS) {
            return true;
        } else {
            return false;
        }
    }

    public int getStudyYears() {
        if (hasGraduated()) {
            return graduationYear - startYear; 
        } else { 
            return currentYear - startYear;
        }
    }
    
    private int getRandomId() {
        int randId = (int)Math.floor(Math.random() *(ConstantValues.MAX_ID - ConstantValues.MIN_ID + 1) + ConstantValues.MIN_ID);
        return randId;
    }

    public String setPersonId(final String personId) {
        if (checkPersonIdNumber(personId)) {
            String days = personId.substring(0, 2);
            String months = personId.substring(2, 4);
            String years = personId.substring(4,6);
            int century;
            switch(personId.charAt(6)) {
                case 'A':
                    century = 20;
                    break;
                case '-':
                    century = 19;
                    break;
                case '+':
                    century = 18;
                    break;
                default:
                    return ConstantValues.INVALID_BIRTHDAY;
            }
            String testBirthDate = days + "." + months + "." + century + years;
            
            if (checkBirthdate(testBirthDate)) {
                if (checkValidCharacter(personId)) {
                    birthDate = testBirthDate;
                    return "Ok";
                } else {
                    return ConstantValues.INCORRECT_CHECKMARK;
                }
            } else {
                return ConstantValues.INVALID_BIRTHDAY;
            }
        } else {
            return ConstantValues.INVALID_BIRTHDAY;
        }
    }

    private boolean checkPersonIdNumber(final String personId) {
        char centChar = personId.charAt(6);
        if (personId.length() == 11) {
            if (centChar == '+' || centChar == '-' || centChar == 'A') {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean checkLeapYear(int year) {
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkValidCharacter(final String personId) {
        String characters = "0123456789ABCDEFHJKLMNPRSTUVWXY";
        String idNumber = personId.substring(0,6);
        idNumber += personId.substring(7, 10);
        int num = Integer.parseInt(idNumber);
        int remaining = num % 31;

        return characters.charAt(remaining) == personId.charAt(10);
    }

    private boolean checkBirthdate(final String date) {
        try {
            Integer.parseInt(date.substring(0, 2));
            Integer.parseInt(date.substring(3, 5));
            Integer.parseInt(date.substring(6, 10));
        } catch (Exception e) {
            return false;
        }

        int days = Integer.parseInt(date.substring(0, 2));
        int months = Integer.parseInt(date.substring(3, 5));
        int years = Integer.parseInt(date.substring(6, 10));
        int yearsLastTwoDigits = Integer.parseInt(date.substring(8, 10));

        if (days > 0 && months < 13 && months > 0 && yearsLastTwoDigits >= 0) {
            if (days > 28 && months == 2 && !checkLeapYear(years)) {
                return false;
            } else if (days > 29 && checkLeapYear(years)) {
                return false;
            }
            if (days > 30) {
                switch(months) {
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        return false;
                }
            if (days > 31) {
                return false;
            }
            }
        } else {
            return false;
        }
        return true;
    }

    public String toString() {
        hasGraduated();
        return 
            "Student id: " + id +
            "\n\tFirstName: " + firstName + ", LastName: " + lastName +
            "\n\tDate of birth: " + birthDate +
            "\n\tStatus: " + status +
            "\n\tStartYear: " + startYear + " (Studies have lasted for " + getStudyYears() + " years)" +
            "\n\tBachelorCredits: " + bachelorCredits + " ==> " + missingBachelor +
            "\n\tTitleOfBachelorThesis: \"" + titleOfBachelorThesis + "\"" +
            "\n\tMasterCredits: " + masterCredits + " ==> " + missingMaster + 
            "\n\tTitleOfMastersThesis: \"" + titleOfMastersThesis + "\""
            ;
        
    }
}
