import java.util.ArrayList;
import java.util.Random;

public class WeatherServer implements Subject,Runnable{


    int temperature = 20;
    private boolean stop = false;
    ArrayList<Observer> array = new ArrayList<>();

    int sleepDuration = 300;

    @Override
    public void run(){
        while(!stop){
            temperature = new Random().nextInt(10)+10;
            notifyObserver(temperature);

            try{
                Thread.sleep(sleepDuration);
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    public void stopThread(){
        stop = true;
    }

    @Override
    public void registerObserver(Observer o){
        array.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        array.remove(o);
    }

    @Override
    public void notifyObserver(Object o){
        for (Observer obs: array){
            obs.update(o);
        }
    }

}
