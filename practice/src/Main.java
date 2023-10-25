public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Riple();
        weapon.aim_and_fire();
        Decorator scoped_riple = new Scoped(weapon);

        scoped_riple.aim_and_fire();
    }
}
