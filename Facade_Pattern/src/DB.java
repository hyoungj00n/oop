import java.util.HashMap;

public class DB {
    HashMap<String,Row> hashMap = new HashMap<>();

    public void insert(String name, Row row){
        hashMap.put(name,row);

    }
}
