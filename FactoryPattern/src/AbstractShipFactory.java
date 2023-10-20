public abstract class AbstractShipFactory {

    AbstractShip order(String name){
        AbstractShip ship = createShip(name);
        return ship;
    }

    abstract AbstractShip createShip(String name);
}
