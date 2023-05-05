import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        WordList words = new WordList("words.txt");
        Hangman hangman1 = new Hangman(words, 5);
        WordList specifiedWords = words.theWordsOfLength(5);
        Hangman hangman2 = new Hangman(specifiedWords, 5);
        WordList specifiedWords2 = words.theWordsWithCharacters("_a_e_");
        Hangman hangman3 = new Hangman(specifiedWords2, 5);
        hangman1.play();
        hangman2.play();
        hangman3.play();
        
    }

}