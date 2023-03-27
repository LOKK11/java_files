public class Sort {

    public static <T extends Comparable<T>> void sort( T [] table ) {
        if (table == null || table.length <= 1) {
            return;
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = i + 1; j < table.length; j++) {
                if (table[i].compareTo(table[j]) < 0) {
                    T temp = table[i];
                    table[i] = table[j];
                    table[j] = temp;
                }
            }
        }
    }   
}