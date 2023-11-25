import java.util.ArrayList;
import java.util.List;

public class IDE {
    Compiler compiler;
    Preprocessor preprocessor;
    Linker linker;

    String name;

    public IDE(Preprocessor preprocessor, Compiler compiler, Linker linker) {
        this.preprocessor = preprocessor;
        this.compiler = compiler;
        this.linker = linker;
    }
    public void createProject(String name) {
        this.name = name;
    }
    public Executable build(SourceCode[] files) {
        ObjectCode[] objs = new ObjectCode[files.length];
        for (int i = 0; i < files.length; i++) {
            SourceCode c1 = preprocessor.preprocess(files[i]);
            objs[i] = compiler.compile(c1);
        }
        return linker.link(name, objs);
    }

    public Executable build(List<SourceCode> files) {
        ArrayList<ObjectCode> objs = new ArrayList<ObjectCode>();
        for (SourceCode code : files) {
            SourceCode c1 = preprocessor.preprocess(code);
            objs.add(compiler.compile(c1));
        }
        return linker.link(name, objs);
    }
}
