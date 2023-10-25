public class Observer1 implements Observer{

    private int num1;
    public void update(int num1){
        this.num1 = num1;
        System.out.println(num1);
    }

    public int getNum1() {
        return num1;
    }
}
