public class Main {

    public static void main(String[] args) {
        Context context1 = new Context();
        Context context2 = new Context();

        context1.setStrategy(new Strategy1());
        context1.doSomething(1,200);
    }
}
