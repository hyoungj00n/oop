public class Context {

    int num1;
    int num2;
    IStrategy strategy;

    Context(IStrategy strategy){
        this.strategy=strategy;
    }

    public void doSomething(int a, int b){
        strategy.setNum1(100);
        num1 = strategy.getNum1();
        System.out.println(strategy.better(num1,b));

    }
}
