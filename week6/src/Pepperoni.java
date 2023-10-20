public class Pepperoni extends Decorate{


    public Pepperoni(AbstractPizza pizza){
        super(pizza);
    }

    @Override
    public int getDecoratorPrice() {
        return 3000;
    }

    @Override
    public String getDecoratorName() {
        return "페페로니";
    }
}
