public abstract class Decorate extends AbstractPizza {

    protected AbstractPizza pizza;

    public Decorate(AbstractPizza pizza){
        this.pizza = pizza;
    }

    public AbstractPizza getPizza(){ return pizza; }


    public String getName(){
        return getDecoratorName();
    };
    public int getPrice(){
        return getDecoratorPrice() + pizza.getPrice();
    };

    public int getSize(){
        return pizza.getSize();
    }

    public abstract String getDecoratorName();
    public abstract int getDecoratorPrice();
}
