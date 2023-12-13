public class Client {

    public static void main(String[] args) {

        Weapon scoped_rifle = new Scoped(new BaseWeapon());

        scoped_rifle.aim_and_fire();


    }
}
