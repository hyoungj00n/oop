public abstract class AbstractPizza{
    private int size = 15;
    private String name;
    private int price = 20000;

    AbstractPizza(){

    }
    AbstractPizza(int size, String name, int price){
        this.size =size;
        this.name = name;
        this.price = price;
    }
    public int getSize(){
        return size;
    }
    public  String getName(){ return name; }
    public int getPrice(){return price; }
}
