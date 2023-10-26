public class Main {

    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();

        IProduct product = factory1.operate();
        product.show();

    }
}
