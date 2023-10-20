public class HShipFactory extends AbstractShipFactory{

    AbstractShip ship;

    AbstractShip createShip(String name){

        if (name == "요트"){
            ship = new HShip1();
        }else if(name == "컨테이너배"){
            ship = new HShip2();
        }
        return ship;
    }

}
