public class JShipFactory extends AbstractShipFactory{
    AbstractShip ship;
    AbstractShip createShip(String name){

        if (name == "요트"){
            AbstractShip ship = new HShip2();
        }else if(name == "컨테이너배"){
            AbstractShip ship = new HShip2();
        }
        return ship;
    }
}
