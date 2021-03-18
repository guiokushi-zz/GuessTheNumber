package okushi.guilherme;

import java.util.Scanner;

public class AttemptCounter {
    private static int counter = 0;
    private static int limit = 0;
    private static Scanner scanner = new Scanner(System.in);

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

    
}
