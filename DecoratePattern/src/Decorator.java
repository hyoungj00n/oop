public abstract class Decorator implements ComponentI{

    public void operation(ComponentI componentI){
        componentI.operation();
    }
}
