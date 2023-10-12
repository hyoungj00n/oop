import java.util.Random;

public class MyRandom {

    public int randInt(int min,int max){
        Random r = new Random();
        return r.nextInt(max-min+1)+min;


    }
}
