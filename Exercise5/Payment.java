public abstract class Payment {
    
    double amount;
    static double total = 0;

    public Payment() {
        System.out.println("New payment created");
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(final double amount) {
        if (this.amount != amount) {
            total += amount - this.amount;
        }
        this.amount = amount;
    }

    public static double getTotal() { 
        return total;
    }

    public String printPaymentDetails() {
        return
            "Payment amount: " + amount + "€";
    }

}