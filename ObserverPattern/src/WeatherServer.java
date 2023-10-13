import java.util.ArrayList;

public class WeatherServer implements Subject,Runnable{

    ArrayList<Observer> array = new ArrayList<>();

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
    public void notifyObserver(Object ob){
        for (Observer obs: array){
            obs.update();
        }
    }

}
