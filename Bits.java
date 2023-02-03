public class Bits {
    static int bitLen(int n) {
        int bits = 1;
        while (n > 1) {
            bits++;
            n /= 2;
        }
        return bits;
    }
    public static void main(String [] args) {
        System.out.println(bitLen(255));
    }
}