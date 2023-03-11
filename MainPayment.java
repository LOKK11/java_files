public class MainPayment {

    public static void main(String[] args) {
        Payment p1 = new CashPayment(3.0);
        Payment p2 = new CreditCardPayment(2.5, "POQWUROP439875");
        Payment p3 = new CreditCardPayment(3.5, "lOKKI");
        Payment p4 = new CashPayment(16.0);

        Payment[] pl = new Payment[4];
        pl[0] = p1;
        pl[1] = p2;
        pl[2] = p3;
        pl[3] = p4;
        
        printPaymentList(pl);
    }

    public static void printPayment(Payment p) {
        System.out.println(p.printPaymentDetails()); 
        System.out.println();
    }

    public static void printPaymentList(Payment[] pl) {
        for (Payment payment : pl) {
            printPayment(payment);
        }
    }

}