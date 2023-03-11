//package dev.m3s.programming2.homework2;

public class PersonID {
    
    //Attributes
    private String birthDate = ConstantValues.NO_BIRTHDATE;

    //Methods
    public String getBirthDate() {
        return birthDate;
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
                    System.out.println("_________________");
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
}