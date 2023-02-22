public class Course {
    
    //Attributes
    private String name;
    private String courseCode;
    private Character courseBase;
    private int courseType;
    private int period;
    private double credits;
    private boolean numericGrade;

    //Constructors
    public Course() {}

    public Course(
    String name, 
    final int code, 
    Character courseBase, 
    final int type, 
    final int period, 
    final double credits, 
    boolean numericGrade
    ) {

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
        if (courseType == ConstantValues2.MANDATORY) {
            return "Mandatory";
        } else {
            return "Optional";
        }
    }

    public int getCourseType() {
        return courseType;
    }

    public void setCourseType(final int type) {
        if (type == ConstantValues2.OPTIONAL || type == ConstantValues2.MANDATORY) {
            courseType = type;
        }
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(final int courseCode, Character courseBase) {
        if (courseCode > 0 && courseCode < 1000000) {
            String courseCodeString = String.valueOf(courseCode); 
            switch (courseBase) {
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

    public Character getCourseBase() {
        return courseBase;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(final int period) {
        if (period >= ConstantValues2.MIN_PERIOD && period <= ConstantValues2.MAX_PERIOD) {
            this.period = period;
        }

    }
}