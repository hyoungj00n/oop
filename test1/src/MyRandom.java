import java.util.Random;

public class MyRandom {

    public static int randInt(int min,int max){

        Random r = new Random();
        return r.nextInt(max-min+1)+min;


    }
}
