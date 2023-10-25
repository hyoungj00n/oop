public class Main {

    public static void main(String[] args) {
        Context context1 = new Context(new Strategy1());
        Context context2 = new Context(new Strategy2());

        context1.doSomething(1,200);
    }
}
