public class CreditCardPayment extends Payment {
    
    String creditCardNumber;

    public CreditCardPayment(double amount, String creditCardNumber) {
        this.amount = amount; 
        this.creditCardNumber = creditCardNumber; 
        Payment.total += amount;
        System.out.println("New credit card payment created");
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(final String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String printPaymentDetails() {
        return
            super.printPaymentDetails() +
            "\nPayment type: Credit card" +
            "\nCredit card number: " + creditCardNumber 
            ;
    }

}