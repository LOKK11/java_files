import java.time.Year;

public class ConstantValues {

    public static final int CURRENT_YEAR = Year.now().getValue();
    public static final String NO_NAME = "No name";
    public static final String NO_TITLE = "No title";
    public static final String NO_BIRTHDATE = "Not available";
    public static final String INVALID_BIRTHDAY = "Invalid birthday!";
    public static final String INCORRECT_CHECKMARK = "Incorrect check mark!";
    public static final String NOT_AVAILABLE = "Not available";

    public static final int MIN_STUDENT_ID = 1;
    public static final int MAX_STUDENT_ID = 100;
    public static final int MIN_EMP_ID = 2001;
    public static final int MAX_EMP_ID = 3000;
    public static final double MIN_CREDITS = 0.0;
  
    public static final double MAX_CREDITS = 300.0;
    public static final double BACHELOR_CREDITS = 180.0;
    public static final double MASTER_CREDITS = 120.0;
    public static final double BACHELOR_OPTIONAL = 30.0;
    public static final double MASTER_OPTIONAL = 70.0;
    public static final double BACHELOR_MANDATORY = 150.0;
    public static final double MASTER_MANDATORY = 50.0;
    public static final double MAX_COURSE_CREDITS = 55.0;

    public static final int MIN_PERIOD = 1;
    public static final int MAX_PERIOD = 5;

    public static final int BACHELOR_TYPE = 0;
    public static final int MASTER_TYPE = 1;
    public static final int OPTIONAL = 0;
    public static final int MANDATORY = 1;
    public static final int ALL = 2;
    public static final int MIN_GRADE = 0;
    public static final int MAX_GRADE = 5;
    public static final char GRADE_FAILED = 'F';
    public static final char GRADE_ACCEPTED = 'A';

    public static final String BACHELOR_STR = "Bachelor Degree";
    public static final String MASTER_STR = "Masters Degree";
    public static final String DOCTORAL_STR = "Doctoral Degree";

}