import java.util.Scanner;

public class Harjoitus1_2 {
    public static void main(String [] args) {
        Scanner lukija = new Scanner(System.in);
        int luku;
        int lukumaara = 0;
        int summa = 0;
        double keskiarvo = 0.0;
        int suurin = Integer.MIN_VALUE;
        int pienin = Integer.MAX_VALUE;
        do {
            System.out.println("Anna positiivinen kokonaisluku: ");
            luku = Integer.valueOf(lukija.nextLine());
            if (luku > 0) {
                lukumaara++;
                summa += luku;
                if (luku > suurin) {
                    suurin = luku;
                } 
                if (luku < pienin) {
                    pienin = luku;
                }
            }
        } while (luku > 0);

        if (lukumaara > 0) {
            keskiarvo = (double) summa / lukumaara;
            System.out.printf("Lukujen lukumaara: %d\n", lukumaara);
            System.out.printf("Lukujen keskiarvo: %.2f\n", keskiarvo);
            System.out.printf("Suurin annettu luku: %d\n", suurin);
            System.out.printf("Pienin annettu luku: %d\n", pienin);

        } else {
            System.out.println("Et syöttänyt yhtäkään kelvollista lukua.");
        }
        lukija.close();
    } 
}