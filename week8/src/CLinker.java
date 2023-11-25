import java.util.List;

public class CLinker implements Linker{
    public Executable link(String exeFileName, ObjectCode[] objFiles) {
        String objs = "";
        for (ObjectCode obj : objFiles) {
            objs += ("\n" + obj.getFilename());
        }
        Executable e = new Executable(exeFileName, objs);
        System.out.println("Linking" + objs);
        return e;
    }
    public Executable link(String exeFileName, List<ObjectCode> objFiles) {
        String objs = "";
        for (ObjectCode obj : objFiles) {
            objs += ("\n" + obj.getFilename());
        }
        Executable e = new Executable(exeFileName, objs);
        System.out.println("Linking" + objs);
        return e;
    }
}
