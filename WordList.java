import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class WordList {

    private List<String> words = new ArrayList<>();
    
    public WordList(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            words.add(st);
        }
        br.close();
    }

    public List<String> giveWords() {
        return words;
    }

}