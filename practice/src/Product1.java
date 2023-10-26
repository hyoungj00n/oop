public class Product1 implements IProduct{

    String name;

    Product1(String name){
        this.name = name;
    }
    public void show(){
        System.out.println(name);
    }

}
