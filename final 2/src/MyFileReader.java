import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {


    String filename;
    public MyFileReader(String filename){
        this.filename = filename;
    }

    public List<String> readLines(){
        ArrayList<String> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader r = new BufferedReader(fr);
            String line = r.readLine();
            while (line != null) {
                line = line.trim();
                if (!line.equals("")) {
                    list.add(line);
                }
                line = r.readLine();
            }
            r.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}



