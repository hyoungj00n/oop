import java.util.ArrayList;

public class Shape implements Selectable{

    ArrayList ShapeComponents = new ArrayList();

    public void add(Selectable s){
        ShapeComponents.add(s);
    }

    public void remove(Selectable s){
        ShapeComponents.remove(s);
    }


}
