public class Scoped extends Decorator{

    Weapon weapon;
    public Scoped(Weapon weapon){
        super(weapon);
    }
    public void aim_and_fire(){
        System.out.println("zoom shot");
    }
}
