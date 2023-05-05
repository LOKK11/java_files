import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

    public void setWords(List<String> words) {
        this.words = words;
    }

    public WordList theWordsOfLength(int length) throws FileNotFoundException, IOException {
        WordList wordsOfLength = new WordList("words.txt");
        List<String> correctWords = new ArrayList<>();
        for (String word : wordsOfLength.giveWords()) {
            if(word.length() == length) {
                correctWords.add(word);
            }
        }
        wordsOfLength.setWords(correctWords);
        return wordsOfLength;
    }

    public WordList theWordsWithCharacters(String someString) throws FileNotFoundException, IOException {
        WordList wordsWithCharacters = theWordsOfLength(someString.length());
        List<String> wrongWords = new ArrayList<>();
        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) != '_') {
                for (String word : wordsWithCharacters.giveWords()) {
                    if (word.toLowerCase().charAt(i) != someString.toLowerCase().charAt(i)) {
                        if(!wrongWords.contains(word)) {
                            wrongWords.add(word);
                        }
                    }
                }
            }
        }
        wordsWithCharacters.giveWords().removeAll(wrongWords);
        return wordsWithCharacters;
    }    

}