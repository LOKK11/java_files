import java.util.Random;

public abstract class Person {
    
    //Attributes
    private Random rand = new Random(); 
    private String firstName = ConstantValues.NO_NAME;
    private String lastName = ConstantValues.NO_NAME;
    private String birthDate = ConstantValues.NOT_AVAILABLE;

    //Constructors
    public Person(String lname, String fname) {
        if (lname != null && fname != null) {
            firstName = fname;
            lastName = lname;
        }
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

    public String getBirthDate() {
        return birthDate;
    }
    public String setBirthDate(String personId) {
        PersonID id = new PersonID();
        if (id.setPersonId(personId) == "Ok") {
            birthDate = id.getBirthDate();
            return birthDate;
        } else {
            return "No change";
        }
    }

    protected int getRandomId(final int min, final int max) {
        int randId = rand.nextInt(max - min + 1) + min;
        return randId;
    }

    public abstract String getIdString();

}