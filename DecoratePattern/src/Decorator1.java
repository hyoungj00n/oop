public class Decorator1 extends Decorator{

    ComponentI componentI;
    public Decorator1(ComponentI componentI){
        this.componentI = componentI;
    }
    @Override
    public void operation(ComponentI componentI) {
        componentI.operation();
    }

}
