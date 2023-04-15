import java.util.ArrayList;
import java.util.List;

public class MainHw3 {  
    public static void main(String[] args) {

        ResponsibleTeacher rt = new ResponsibleTeacher("Mouse", "Mickey");
        rt.setBirthDate("230498-045T");
        MonthlyPayment salary = new MonthlyPayment();
        salary.setSalary(756.85);
        rt.setPayment(salary);
        
        AssistantTeacher at = new AssistantTeacher("The Dog", "Goofy");
        at.setBirthDate("141200A2315");
        HourBasedPayment eurosPerHour = new HourBasedPayment();
        eurosPerHour.setEurosPerHour(3.5);
        eurosPerHour.setHours(11);

        Student st = new Student("Duck", "Donald");

        Course c1 = new Course( "Programming 1", 811104, 'P', 1, 1, 5.0, true);
        Course c2 = new Course( "All kinds of basic studies", 112233, 'P', 1, 2, 45.0, true);
        Course c3 = new Course("More basic studies", 223344, 'a', 1, 1, 50.5, true);
        Course c4 = new Course("Even more basic studies", 556677, 'a', 0, 3, 50.0, true);
        Course c5 = new Course("Final basic studies", 123123, 'A', 1, 4, 50.5, true);
        Course c6 = new Course( "Programming 2", 616161, 'A', 1, 3, 25.0, true);
        Course c7 = new Course( "All kinds of master studies", 717171, 'P', 0, 2, 45.0, true);
        Course c8 = new Course("More master studies", 818181, 'A', 1, 1, 25.0, true);
        Course c9 = new Course("Even more master studies ", 919191, 'S', 1, 3, 20.0, true);
        Course c10 = new Course("Extra master studies", 666666, 'S', 0, 5, 8.0, false);
        Course c11 = new Course("Final master studies", 888888, 'S', 1, 5, 18.0, false);

        DesignatedCourse dc1 = new DesignatedCourse(c3, false, 2023);
        DesignatedCourse dc2 = new DesignatedCourse(c4, false, 2023);
        DesignatedCourse dc3 = new DesignatedCourse(c10, false, 2022);
        DesignatedCourse dc4 = new DesignatedCourse(c11, false, 2023);

        List<DesignatedCourse> courses = new ArrayList<>();
        courses.add(dc1);
        courses.add(dc2);
        courses.add(dc3);
        courses.add(dc4);
        rt.setCourses(courses); 



        
         
        
    }  
}