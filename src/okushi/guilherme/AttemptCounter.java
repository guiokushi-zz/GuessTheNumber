package okushi.guilherme;

import java.util.Scanner;

public class AttemptCounter {
    private static int counter;
    private static int limit;
    private static Scanner scanner = new Scanner(System.in);
    private Guesser guesser = new Guesser();

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

    //reset counter values
    public static void resetAll(){
        counter = 0;
        limit = 0;
    }

    //check variable
    public static int checkCount(){
        return counter;
    }

    //Add more rounds
    public static int addLimit(){
        System.out.println("Do you want to extend the limit? [y/n]");
        String choice = scanner.next();
        int op = 0;
        switch (choice){
            case "y":
                System.out.println("How much do you want to increment?");
                int lAmount = scanner.nextInt();
                limit = limit + lAmount;
                op = 1;
                break;
            case "n":
                op = 0;
                break;
            default:
                System.out.println("Invalid input");
        }
        return op;
    }

}
