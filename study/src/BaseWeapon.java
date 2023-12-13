import java.util.stream.BaseStream;

public class BaseWeapon implements Weapon {

    @Override
    public void aim_and_fire() {
        System.out.println("발사");
    }
}
