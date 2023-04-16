package dev.m3s.programming2.homework3;

public class HourBasedPayment implements Payment {

    //Attributes
    private double eurosPerHour;
    private double hours;

    //Methods
    public double getEurosPerHour() {
        return eurosPerHour;
    }

    public void setEurosPerHour(double eurosPerHour) {
        if (eurosPerHour > 0.0) {
            this.eurosPerHour = eurosPerHour;
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours > 0.0) {
            this.hours = hours;
        }
    }

    public double calculatePayment() {
        return hours * eurosPerHour;
    }
}