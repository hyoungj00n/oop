import java.util.HashMap;

public class Word {

    String word;
    int count;


    int[] wordlist = new int[25];


    public Word(String word){
        this.word = word;

    }

    public boolean equals(Object word){

        if(word.equals(word))
            return true;
        else return false;
    }

    public void increaseCount(){
        char a = word.charAt(0);
        int b = a-97;
        count = wordlist[b]++;
    }

    public String toString(){
        return word + wordlist[word.charAt(0)];
    }

}
