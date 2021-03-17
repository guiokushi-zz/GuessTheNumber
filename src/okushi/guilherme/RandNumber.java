package okushi.guilherme;

import java.util.Random;

public class RandNumber {
    private int num;
    private Random rnd = new Random();
    public int getRandomNumber(){
        num = rnd.nextInt(100) + 1;
        return num;
    }
}
