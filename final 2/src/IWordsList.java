import java.util.HashMap;

public interface IWordsList {

    public void print();
    public void add(Word word);

    HashMap<Word,Integer> wordList = new HashMap<>();
}
