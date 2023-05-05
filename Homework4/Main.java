import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            WordList words = new WordList("words.txt");
            Hangman hangman = new Hangman(words, 5);
            hangman.play();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An error has occurred while reading the given file.");
        }
    }

}
