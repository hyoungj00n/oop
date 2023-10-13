import java.util.ArrayList;
import java.util.Random;

public class WeatherServer implements Subject,Runnable{


    int temperature = new Random().nextInt(10)+10;
    ArrayList<Observer> array = new ArrayList<>();

    public void changetemp(){
        notifyObserver(temperature);
    }
    @Override
    public void run(){

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
            obs.update();
        }
    }

}
