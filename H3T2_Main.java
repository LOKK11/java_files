import java.util.Scanner;

public class H3T2_Main {
   
   private static Scanner lukija = new Scanner(System.in); //windows saattaa muuten vaatia desimaalipisteen sijaan desimaalipilkkua

   public static void main( String [] args ){
      int size;
      int max;
      int luku = 1;

      System.out.print("Anna taulukon koko ");
      size = lukija.nextInt();
      System.out.print("Anna satunnaisluvun maksimiarvo ");
      max = lukija.nextInt();
      lukija.nextLine();
      RandTable randTable = new RandTable(size, max);
      
      while (luku > 0) {
         luku = randTable.nextNumber();
         System.out.println("Taulukosta saatiin luku " + luku);
      }
      System.out.println("Kaikki luvut tulostettu.");

      

      
      lukija.close();
   }





}