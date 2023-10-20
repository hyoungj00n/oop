import java.util.List;

class MainPizza {
    public static void main(String[] args) {

        List<String> list;
        LoadToppings loadToppings = new LoadToppings("toppings.txt");
        list = loadToppings.load();

        AbstractPizza piz = new Pizza(15);
        System.out.println("피자 이름:" +piz.getName() + " 피자 가격:"+ piz.getPrice() );
        piz = new Cheese(piz);
        System.out.println("피자 이름:" +piz.getName() + " 피자 가격:"+ piz.getPrice() );


    }
}