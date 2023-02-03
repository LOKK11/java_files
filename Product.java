public class Product {
    private String name;
    private double price;
    public void setName(String name) {
        name = this.name;
    }
    public void setPrice(double price) {
        price = this.price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}