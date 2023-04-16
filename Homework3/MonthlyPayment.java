package dev.m3s.programming2.homework3;

public class MonthlyPayment implements Payment {

    //Attributes
    private double salary;

    //Methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0.0) {
            this.salary = salary;
        }
    }

    public double calculatePayment() {
        return salary;
    }
}