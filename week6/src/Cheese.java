public class Cheese extends Decorate{


    public Cheese(AbstractPizza pizza){
        super(pizza);
    }

    public String getDecoratorName(){
        return "치즈" + pizza.getName();
    }
    public int getDecoratorPrice(){
        return 1000;
    }

}
