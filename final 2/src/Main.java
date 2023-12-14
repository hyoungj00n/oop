import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    // 201910949 김형준

    MyFileReader fileReader;

    List<String> lines;

    List<String> word = new ArrayList<>();

    int count;

    public Main(String filename){
        fileReader = new MyFileReader(filename);


    }

    public List<String> createArray(){
         lines = fileReader.readLines();
         for(String line : lines){
             word.add(line.split("[\t\n\";,.?!]"));
         }
    }

    public void print(){

    }

    public static void main(String[] args) {
        Main main = new Main("huckle.txt");






    }
}
