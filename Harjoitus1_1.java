import java.util.Scanner;

public class Harjoitus1_1 {
    public static void main (String [] args) {
        Scanner lukija = new Scanner(System.in);
        String nimi = null;

        System.out.println(
            "Anna etu- ja sukunimesi välilyönnillä erotettuna: ");
        nimi = lukija.nextLine();
        System.out.print("Tervetuloa Java-ohjelmoinnin maailmaan " + nimi);
        lukija.nextLine();
        lukija.close();
    }

}