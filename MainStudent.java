public class MainStudent {
    public static void main(String[] args) {
        Student student2 = new Student(null, null);
        Student student3 = new Student("Mouse", "Minnie");
        Student student4 = new Student();
        Student student1 = new Student();
        student1.setLastName("Duck");
        student1.setFirstName("Donald");
        student1.setBachelorCredits(120);
        student1.setMasterCredits(180);
        student1.setTitleOfMasterThesis("Masters thesis title");
        student1.setTitleOfBachelorThesis("Bachelor thesis title");
        student1.setStartYear(2001);
        student1.setGraduationYear(2020);
        student2.setPersonId("170101A981N");
        student2.setTitleOfBachelorThesis("A new exciting purpose of life");
        student2.setBachelorCredits(65);
        student2.setMasterCredits(22);
        student3.setPersonId("111111-3334");
        student3.setBachelorCredits(215);
        student3.setMasterCredits(120);
        student3.setTitleOfMasterThesis("Christmas - The most wonderful time of the year");
        student3.setTitleOfBachelorThesis(null);
        student3.setStartYear(2018);
        student3.setGraduationYear(2022);

        System.out.println(student1.toString());
        System.out.println();
        System.out.println(student2.toString());
        System.out.println();
        System.out.println(student3.toString());
        System.out.println();
        System.out.println(student4.toString());
        System.out.println();

        System.out.println(student1.setPersonId("This is a string"));
        System.out.println(student1.setPersonId("320187-1234"));
        System.out.println(student1.setPersonId("11111111-3334"));
        System.out.println(student1.setPersonId("121298-830A"));

    }
}