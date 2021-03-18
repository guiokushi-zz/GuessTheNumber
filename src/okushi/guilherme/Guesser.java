package okushi.guilherme;

import java.util.Scanner;

public class Guesser {
    //Time variables
    private long startTime;
    private long endTime;
    private long totalTime;

    private double score;
    private int randNum;
    private int numIn;
    private String playA;
    private int op = 0;
    private boolean execution;
    private Scanner scanner;
    private RandNumber rand = new RandNumber();


    //Initial conditions
    public Guesser() {
        scanner = new Scanner(System.in);
        this.execution = execution = true;
    }

    //Receive guess, set the limit, clear previous counters and send guess to the guessCalculator
    public void gameSystem() {
        if (op == 0) {
            this.randNum = rand.getRandomNumber();
            AttemptCounter.resetAll();
            //Max number of attempts
            AttemptCounter.setLimit();
            startTime = System.nanoTime();
        }
        while (execution){
            System.out.println("Insert your guess!");
            this.numIn = scanner.nextInt();
            guessCalculator(this.numIn);
            if (!AttemptCounter.compareLimit()){
                if(AttemptCounter.addLimit() == 0){
                    gameOver();
                }
                op = 1;
            }
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

    private double scoreCalculator(){
        double sda = AttemptCounter.checkCount();
        score = Math.round((1/sda) * 1000);
        return score;
    }
    //Player reached the limit of attempts
    public void gameOver(){
        System.out.println("You reached your limit of " + AttemptCounter.checkCount() + " attempts");
        System.out.println("Score: " + scoreCalculator());
        System.out.println("GAME OVER");

        playAgain();

    }

    //Play again function
    public void playAgain() {
        System.out.println("Score: " + scoreCalculator());
        System.out.println("Want to play again? [y/n]");
        playA = scanner.next();
        switch (playA){
            case "y":
                op = 0;
                gameSystem();
                break;
            case "n":
            System.out.println("Thank you for playing!");
                execution = false;
                break;
            default:
                System.out.println("Invalid answer\n");
                playAgain();
        }

    }
}
