public class CashPayment extends Payment {

    public CashPayment(double amount) {
        this.amount = amount;
        Payment.total += amount; 
        System.out.println("New cash payment created");
    }
    
    public String printPaymentDetails() {
        return 
            super.printPaymentDetails() +
            "\nPayment type: Cash"
        ;

    }

}