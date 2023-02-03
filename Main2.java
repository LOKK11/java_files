import java.util.Scanner;

public class Main2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args) {
        System.out.println("Type the amount of products: ");
        int size = sc.nextInt();
        sc.nextLine();
        Product [] products = new Product[size];
        readProducts(products);
        printProducts(products);
    }

    static void printProduct(final Product prod) {
        System.out.println("Product name: " + prod.getName());
        System.out.println("Product price: " + prod.getPrice() + "€");
    }

    static Product readProduct() {
        System.out.println("Give product's name: ");
        String name = sc.nextLine();
        System.out.println("Give product's price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        Product prod = new Product(name, price);
        return prod;
    }

    static void readProducts(Product [] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product " + (i + 1));
            products[i] = readProduct();
        }
    }

    static void printProducts(Product [] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product " + (i + 1));
            printProduct(products[i]);
        }
    }
}