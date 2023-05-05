import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

    private Random rand = new Random(); 
    private String word;
    private int guessesLeft;
    private List<Character> guesses = new ArrayList<>();
    private int correctLetters;
    private List<Character> letterList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    public Hangman(WordList words, int guesses) {
        int rn;
        rn = rand.nextInt(words.giveWords().size());
        word = words.giveWords().get(rn);
        this.guessesLeft = guesses;
        correctLetters = 0;
    }

    public void play() {
        while (true) {
            System.out.println("The hidden word...");
            System.out.println(mask());
            System.out.println("Guesses left: " + guessesLeft);
            System.out.println("Guessed letters: " + guesses);
            guess(readInput());
            if (theEnd()){
                System.out.println("Congratulations! You won!!!");
                System.out.println("The hidden word was: \"" + word + "\"");
                break;
            }
            if (guessesLeft == 0) {
                System.out.println("Sorry, you lost!");
                System.out.println("The hidden word was: \"" + word + "\"");
                break;
            }
        }

    }

    public Character readInput() {
        while (true) {
            System.out.print("Guess a letter: ");
            String guess = scanner.nextLine();
            String guessLowerCase = guess.toLowerCase();
            if (guessLowerCase.length() == 1) {
                Character guessCharacter = guessLowerCase.charAt(0);
                return guessCharacter;
            } else {
                System.out.println("Incorrect input!");
            }
        }
    }

    public String mask() {
        String mask = "";
        if (letterList.size() == 0) {
            int j = 0;
            while (j < word.length()) {
                letterList.add('*');
                j++;
            }
        }
        for (int i = 0; i < word.length(); i++) {
            mask += letterList.get(i);
        }
        return mask;
    }

    public boolean guess(Character c) { 
        boolean correct = false;
        if (!guesses.contains(c)) {
            guesses.add(c);
        }
        if (!letterList.contains(Character.toLowerCase(c))) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.toLowerCase(c) == word.toLowerCase().charAt(i)) {
                    letterList.set(i, c);
                    correct = true;
                    correctLetters += 1;
                }
            }
        }
        if (correct != true) {
            guessesLeft -= 1;
        }

        return correct;
    }

    public List<Character> guesses() {
        return guesses;
    }

    public int guessesLeft() {
        return guessesLeft;
    }

    public String word() {
        return word;
    }

    public boolean theEnd() {
        if (correctLetters == word.length()) {
            return true;
        } else {
            return false;
        }
    }

}