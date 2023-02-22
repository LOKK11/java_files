
public class ProductInfo {

   //attribuutit
   private Product prod;
   private String productInfo;



   //konstruktorit eli muodostimet
   public ProductInfo(Product prod, String productInfo) {
      this.prod = prod;
      this.productInfo = productInfo;
   }

   public ProductInfo(String name, double price, String productInfo) {
      this.prod = new Product(name, price);
      this.productInfo = productInfo;
   }

   //metodit
   public String getProductName() {
      return prod.getName();
   }

   public double getProductPrice() {
      return prod.getPrice();
   }

   public String getProductInfo() {
      return productInfo;
   }

   public void setProductName(String name) {
      prod.setName(name);
   }

   public void setProductPrice(double price) {
      prod.setPrice(price);
   }

   public void setProductInfo(String productInfo) {
      this.productInfo = productInfo;
   }

   public String toString() {
      return
         "Product info: " + productInfo +
         "\nProduct name: " + prod.getName() +
         "\nProduct price: " + prod.getPrice() + "€"
         ;
   }
}
