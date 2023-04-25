import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class Hangman {

    private Random rand = new Random(); 
    private String word;
    private int guesses;
    
    public Hangman(List<String> words, int guesses) {
        int rn;
        rn = rand.nextInt(words.size());
        word = words.get(rn);
        this.guesses = guesses;
    }

    public boolean guess(Character c) {
        
    }

}