public class ProxyWordsList implements IWordsList{

    Word word;

    WordsList wordsList;

    public ProxyWordsList(WordsList wordsList){

        this.wordsList =wordsList;
    }
    @Override
    public void print() {

    }

    @Override
    public void add(Word word) {

    }
}
