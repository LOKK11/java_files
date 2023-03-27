public class MainEx5 {
    public static void main(String[] args) {
        
        BaseClass bc = new BaseClass();
        BaseClass sc1 = new SubClass1();
        BaseClass sc2 = new SubClass2();

        printInfo(bc);
        printInfo(sc1);
        printInfo(sc2);

        CashPayment p1 = new CashPayment(1);
        CashPayment p2 = new CashPayment(2);
        CashPayment p3 = new CashPayment(3);
        CreditCardPayment p4 = new CreditCardPayment(4, "098792134");
        CreditCardPayment p5 = new CreditCardPayment(5,"5851795");
        CreditCardPayment p6 = new CreditCardPayment(6,"857120958");

        Payment[] payments = new Payment[] {p1,p2,p3,p4,p5,p6};

        printPayments(payments);
        Sort.sort(payments);
        printPayments(payments);
   


        
    }

    static void printInfo(BaseClass baseClassObject) {
        baseClassObject.whoAmI();
    }

    static void printPayments(Payment[] payments) {
        for (Payment payment : payments) {
            System.out.println(payment.printPaymentDetails());
        }
    }

}