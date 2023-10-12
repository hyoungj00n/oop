public abstract class Pizza{
    int size = 15;
    String name;
    int price = 20000;

    public int getSize(int size){
        return size;
    };
    public abstract String getName();
    public abstract int getPrice();
}
