import java.util.Scanner;

public class Harjoitus1_3 {
    
    static boolean checkIdNumber(final String hetu) {
        if (hetu.length() == 11) {
            char mark = hetu.charAt(6);
            if (mark == '+' || mark == '-' || mark == 'A'){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    static void printBirthdate(String hetu) {
        char mark = hetu.charAt(6);
        int v3;
        String pp = hetu.substring(0,2);
        String kk = hetu.substring(2,4);
        String vv = hetu.substring(4,6);
        if (mark == '+') {
            v3 = 18;
        } else if (mark == '-') {
            v3 = 19;
        } else {
            v3 = 20;
        }
        System.out.printf("%s.%s.%d%s", pp, kk, v3, vv); 
    }

    static boolean checkBirthdate(final String hetu) {
        try {
            Integer.valueOf(hetu.substring(0, 2));
            Integer.valueOf(hetu.substring(2, 4));
            Integer.valueOf(hetu.substring(4, 6));
        } catch (Exception e) {
            return false;
        }
        int pp = Integer.valueOf(hetu.substring(0, 2));
        int kk = Integer.valueOf(hetu.substring(2, 4));
        int vv = Integer.valueOf(hetu.substring(4, 6));
        if (pp >= 1 && pp <= 31 && kk >= 1 && kk < 13 && vv >= 0 && vv < 100) {
            if (pp > 30 && (kk == 4 || kk == 6 || kk == 9 || kk == 11 || kk == 10)) {
                return false;
            } 
            if (kk == 2 && pp > 28) {
                return false;
            }
            return true;
        }
        return false;   
    }

    public static void main(String [] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syota henkilotunnus: ");
        String hetu = String.valueOf(lukija.nextLine());
        if (checkIdNumber(hetu) && checkBirthdate(hetu)) {
            printBirthdate(hetu);
        } else {
            System.out.println("Antamasi henkilotunnus on virheellinen.");
        }
        lukija.close();
    }
}