public abstract class Decorator extends ComponentI{

    ComponentI componentI;


    public void operation(){
        componentI.operation();
    }

}
