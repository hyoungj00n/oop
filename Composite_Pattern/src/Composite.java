import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    List<Component> components = new ArrayList<>();
    @Override
    public void operation() {

    }


    public void addComponent(Component c){
        components.add(c);
    }
}
