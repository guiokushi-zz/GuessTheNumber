package okushi.guilherme;

import java.util.Scanner;

public class AttemptCounter {
    private static int counter;
    private static int limit;
    private static Scanner scanner = new Scanner(System.in);

    public AttemptCounter() {
        counter = 0;
        limit = 0;
    }

    //Counter for the number of attempts
    public static void setCount(){
        counter++;
        System.out.println("Total attempts: " + counter + "\n");
    }

    //Set a limit of attempts to try
    public static void setLimit(){
        System.out.println("Set a limit of attempts: ");
        limit = scanner.nextInt();

    }

    //Check if player reached limit
    public static boolean compareLimit(){
        if(counter == limit){
            return false;
        }
        return true;
    }
}
