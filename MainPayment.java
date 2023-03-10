public class MainPayment {

    public static void main(String[] args) {
        CashPayment p2 = new CashPayment(3.0);
        CreditCardPayment p3 = new CreditCardPayment(2.5, "POQWUROP439875");
        System.out.println(p2.printPaymentDetails());
        System.out.println(p3.printPaymentDetails());
        System.out.println(Payment.getTotal());
        Payment p4 = new CreditCardPayment(3.5, "lOKKI");
        printPayment(p4);  
    }

    public static void printPayment(Payment p) {
        System.out.println(p.printPaymentDetails()); 
    }

}