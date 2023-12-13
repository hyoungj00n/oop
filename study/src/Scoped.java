public class Scoped extends WeaponAccessory{


    public Scoped(Weapon rifle){
        super(rifle);
    }
    @Override
    public void aim_and_fire() {
        System.out.println("조준");
        super.aim_and_fire();
    }
}
