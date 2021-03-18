package okushi.guilherme;

import java.util.Scanner;

public class Guesser {

    private int randNum;
    private int numIn;
    private String playA;
    private boolean execution;
    private Scanner scanner;
    private RandNumber rand = new RandNumber();

    //Initial conditions
    public Guesser() {
        scanner = new Scanner(System.in);
        this.execution = execution = true;
    }

    //Receive guess, set the limit and send to the guessCalculator
    public void gameSystem() {
        this.randNum = rand.getRandomNumber();
        //Max number of attempts
        AttemptCounter.setLimit();
        while (execution){
            System.out.println("Insert your guess!");
            this.numIn = scanner.nextInt();
            //System.out.println("O numero correto é: " + randNum);
            guessCalculator(this.numIn);
        }
    }

    //Get the computer's number and compare the two integers
    private void guessCalculator(int numIn) {
        if (numIn == randNum){
            System.out.println("Congratulations!!!");
            AttemptCounter.setCount();
            playAgain();
        } else if (numIn < randNum){
            System.out.println("The number is higher!");
            AttemptCounter.setCount();
        } else {
            System.out.println("The number is lower!");
            AttemptCounter.setCount();
        }

    }
//    public void gameOver(){
//        if((att.limit + 1) == att.attNum){
//            System.out.println("You reached your" + att.limit + "attempts");
//            System.out.println("GAME OVER");
//            playAgain();
//        }
//    }

    //Play again function
    public void playAgain() {
        System.out.println("Want to play again? [y/n]");
        playA = scanner.next();
        switch (playA){
            case "y":
                gameSystem();
                break;
            case "n":
                execution = false;
                break;
            default:
                System.out.println("Invalid answer\n");
        }

    }
}
