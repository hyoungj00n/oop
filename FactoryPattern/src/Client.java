public class Client {

    public static void main(String[] args) {

        AbstractShipFactory HShipFactory = new HShipFactory();
        AbstractShipFactory JShipFactory = new JShipFactory();

        AbstractShip HShip = HShipFactory.order("요트");
        AbstractShip HShip2 = HShipFactory.order("컨테이너배");

        System.out.println(HShip.toString());



    }
}
