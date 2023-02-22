import java.util.Scanner;

public class H3T1_Main {
   
   private static Scanner lukija = new Scanner(System.in); //windows saattaa muuten vaatia desimaalipisteen sijaan desimaalipilkkua

   public static void main( String [] args ){
      Product prod = new Product("Jäätelö", 2);
      ProductInfo prodInfo = new ProductInfo(prod, "Kylmä hyvänmakuinen herkku.");
      System.out.println(prodInfo.toString());
      lukija.close();
   }
}