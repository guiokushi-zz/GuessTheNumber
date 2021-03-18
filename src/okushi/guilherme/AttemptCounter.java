package okushi.guilherme;

import java.util.Scanner;

public class AttemptCounter {
    public int attNum = 0;
    public int limit;
    private Scanner scanner = new Scanner(System.in);
    private Guesser guesser = new Guesser();
    public void attempts(){
        this.attNum++;
        System.out.println("Total attempts: " + attNum + "\n");
        //guesser.gameOver();
    }

    public int limits(){
        System.out.println("How many attempts do you want?");
        limit = scanner.nextInt();
        return limit;
    }
}
