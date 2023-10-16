public class Client {
    public static void main(String[] args) {
        ComponentI c = new Component("아메리카노");
        System.out.println(c.getName());

        ComponentI cc = new Decorator1(c,"휘핑크림 추가");
        cc.operation();

    }
}
