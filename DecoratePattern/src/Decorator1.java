public class Decorator1 extends Decorator{

    ComponentI componentI;
    String Deco;
    public Decorator1(ComponentI componentI,String Deco){
        this.componentI = componentI;
        this.Deco = Deco;
    }
    @Override
    public void operation() {
        System.out.println(Deco+componentI.getName());

    }

}
