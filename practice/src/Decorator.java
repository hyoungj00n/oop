public abstract class Decorator implements Weapon{

    Weapon weapon;
    Decorator(Weapon weapon){
        this.weapon = weapon;
    }
    @Override
    public abstract void aim_and_fire();
}
