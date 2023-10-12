public class Pizza1 extends Pizza{

    public Pizza1(int size){
        this.size = size;
        name = "피자";
        if (size == 15){
            price = 20000;
        }
        else if (size == 20){
            price = 25000;
        }
    }

    public int getSize(){
        return size;
    };

    public String getName(){
        return this.name;
    };
    public int getPrice(){
        return price;
    };

}
