package okushi.guilherme;

public class AttemptCounter {
    private static int counter = 0;

    public static void setCount(){
        counter++;
        System.out.println("Total attempts: " + counter + "\n");
    }
}
