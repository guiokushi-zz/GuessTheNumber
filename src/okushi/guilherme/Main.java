package okushi.guilherme;

public class Main {
//Guess the computer's number
    public static void main(String[] args) {
        Guesser guesser = new Guesser();
        System.out.println("Welcome to NumberGuess!\n");
        guesser.gameSystem();
    }
}
