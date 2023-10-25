import java.util.ArrayList;
import java.util.List;

public class Subject1 implements ISubject{

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers){
            o.update(55);

        }
    }
}
