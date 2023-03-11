public class MainEx5 {
    public static void main(String[] args) {
        
        BaseClass bc = new BaseClass();
        BaseClass sc1 = new SubClass1();
        BaseClass sc2 = new SubClass2();

        printInfo(bc);
        printInfo(sc1);
        printInfo(sc2);

    }

    static void printInfo(BaseClass baseClassObject) {
        baseClassObject.whoAmI();
    }

}