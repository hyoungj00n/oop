public class CPreprocessor implements Preprocessor{

    @Override
    public SourceCode preprocess(SourceCode name) {
        System.out.printf("Preprocessing C code: %s\n", name.getFilename());
        SourceCode code = new SourceCode("preprocessed_" + name.getFilename());
        System.out.printf("Generating a new C code: %s\n", code.getFilename());
        return code;
    }
}
