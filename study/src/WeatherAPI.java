import java.util.ArrayList;
import java.util.List;

public class WeatherAPI implements Subject{

    private float tmep;
    private float pressure;

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : subscribers){
            o.display(this);
        }
    }

    public float getTmep(){
        return tmep;
    }

    public float getPressure(){
        return pressure;
    }
}
