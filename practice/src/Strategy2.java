public class Strategy2 extends IStrategy{

    public int better(int num1, int num2){
        if (num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
}
