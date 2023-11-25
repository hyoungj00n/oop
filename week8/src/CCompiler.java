public class CCompiler implements Compiler {
    public ObjectCode compile(SourceCode code) {
        System.out.printf("Compiling code: %s\n", code.getFilename());
        ObjectCode c = new ObjectCode(code.getFilename().replace(".c", ".obj"));
        System.out.printf("Generating object code: %s\n", c.getFilename());
        return c;
    }
}
