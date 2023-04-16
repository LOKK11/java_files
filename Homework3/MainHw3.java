package dev.m3s.programming2.homework3;

import java.util.ArrayList;
import java.util.List;

public class MainHw3 {  
    public static void main(String[] args) {
        //1
        ResponsibleTeacher responsible = new ResponsibleTeacher("Mouse", "Mickey");
        responsible.setBirthDate("230498-045T");
        MonthlyPayment salary = new MonthlyPayment();
        salary.setSalary(756.85);
        responsible.setPayment(salary);
        //2
        AssistantTeacher assistant = new AssistantTeacher("The Dog", "Goofy");
        assistant.setBirthDate("141200A2315");
        HourBasedPayment eurosPerHour = new HourBasedPayment();
        eurosPerHour.setEurosPerHour(3.5);
        eurosPerHour.setHours(11);
        assistant.setPayment(eurosPerHour);
        //3
        Student student = new Student("Duck", "Donald");
        //4
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
        //5
        DesignatedCourse dc1 = new DesignatedCourse(c3, true, 2023);
        DesignatedCourse dc2 = new DesignatedCourse(c4, false, 2023);
        DesignatedCourse dc3 = new DesignatedCourse(c10, false, 2022);
        DesignatedCourse dc4 = new DesignatedCourse(c11, true, 2023);
        //6
        List<DesignatedCourse> courses = new ArrayList<>();
        courses.add(dc1);
        courses.add(dc2);
        courses.add(dc3);
        courses.add(dc4);
        //7
        responsible.setCourses(courses); 
        //8
        assistant.setCourses(courses);
        //9
        System.out.println(responsible.toString());
        //10
        System.out.println(assistant.toString());
        //11
        StudentCourse sc1 = new StudentCourse(c1, 1, 2013);
        StudentCourse sc2 = new StudentCourse(c2, 1, 2014);
        StudentCourse sc3 = new StudentCourse(c3, 1, 2015);
        StudentCourse sc4 = new StudentCourse(c4, 4, 2016);
        StudentCourse sc5 = new StudentCourse(c5, 5, 2017);
        StudentCourse sc6 = new StudentCourse(c6, 1, 2018);
        StudentCourse sc7 = new StudentCourse(c7, 1, 2019);
        StudentCourse sc8 = new StudentCourse(c8, 2, 2020);
        StudentCourse sc9 = new StudentCourse(c9, 0, 2021);
        StudentCourse sc10 = new StudentCourse(c10, 'A', 2021);
        StudentCourse sc11 = new StudentCourse(c11, 'f', 2022);
        //12
        List<StudentCourse> bachelorCourses = new ArrayList<>();
        bachelorCourses.add(sc1);
        bachelorCourses.add(sc2);
        bachelorCourses.add(sc3);
        bachelorCourses.add(sc4);
        bachelorCourses.add(sc5);
        //13
        List<StudentCourse> masterCourses = new ArrayList<>();
        masterCourses.add(sc6);
        masterCourses.add(sc7);
        masterCourses.add(sc8);
        masterCourses.add(sc9);
        masterCourses.add(sc10);
        masterCourses.add(sc11);
        //14
        student.setDegreeTitle(0, "Bachelor of Science");
        //15
        student.setDegreeTitle(1, "Master of Science");
        //16
        student.setTitleOfThesis(0, "Bachelor thesis title");
        //17
        student.setTitleOfThesis(1, "Masters thesis title");
        //18
        student.addCourses(0, bachelorCourses);
        //19
        student.addCourses(1, masterCourses);
        //20
        student.setStartYear(2001);
        //21
        student.setGraduationYear(2020);
        //22
        System.out.println(student.toString());
        //23
        student.setBirthDate("230498-045T");
        //24
        student.setTitleOfThesis(0, "Christmas - The most wonderful time of the year");
        //25
        student.setTitleOfThesis(1, "Dreaming of a white Christmas");
        //26
        sc9.setGrade(3);
        //27
        student.setGraduationYear(2020);
        //28
        System.out.println(student.toString());
        //29
        student.printDegrees();
        //30
        student.printCourses();
        
    }  
}