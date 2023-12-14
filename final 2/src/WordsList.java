import java.util.ArrayList;
import java.util.List;

public class WordsList implements IWordsList{

    Word word;

    public WordsList(Word word){
        this.word = word;
    }
    public void add(Word word){
        if (word.count>1) {
            wordList.put(word, word.count);
        }
    }

    public void print(){
        System.out.println(wordList);
    }
}
