import java.util.Random;

public class RandTable {
  
   //attribuutit
   private int curPos = 0;
   private int [] table;

   Random randy = new Random();
   
   //konstruktorit eli muodostimet
   public RandTable(final int size, final int max) {
      table = new int[size];
      int i = 0;
      while (i < size) {
         table[i] = randy.nextInt(max) + 1;
         i++;
      }
   }
   
   //metodit
   public int nextNumber() {
      if (curPos < table.length) {
         return table[curPos++];
      } else {
         return - 1;
      }
   }


}


