public abstract class Employee extends Person implements Payment {
    
    //Attributes
    private String empId;
    private int startYear = ConstantValues.CURRENT_YEAR;
    private Payment payment;

    //Constructors

    public Employee(String lname, String fname) {
        super(lname, fname);
        int id = super.getRandomId(2001, 3000);
        empId = "OY_" + id; 
    }

    //Methods
    public String getIdString() {
        return empId;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(final int startYear) {
        if (startYear > 2000 && startYear <= ConstantValues.CURRENT_YEAR) {
            this.startYear = startYear;
        }
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        if (payment != null) {
            this.payment = payment;
        }
    }

    public double calculatePayment() {
        if (this.payment != null) {
            return payment.calculatePayment();
        } 
        return 0.0;
    }

}