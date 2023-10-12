public class Cheese extends Decorate{
    Pizza pizza;

    public Cheese(Pizza pizza){
        this.pizza = pizza;
        this.pizza.name = "치즈";
    }

    public String getName(){
        return pizza.name;
    }
    public int getPrice(){
        return pizza.price+2000;
    }

}
