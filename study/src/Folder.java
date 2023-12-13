import java.util.ArrayList;
import java.util.List;

public class Folder implements Node{


    String name;
    List<Node> nodeList;

    public Folder(String name){
        this.name = name;
        nodeList = new ArrayList<>();
    }
    public void add(Node node){
        nodeList.add(node);
    }

    public void removce(Node node){
        nodeList.remove(node);
    }

    @Override
    public void print() {
        this.print("");
    }

    @Override
    public void print(String s) {
        int size = getSize();

        System.out.println(s+ name+" ("+size+"kb)");

        for (Node node : nodeList){
            node.print(s);
        }
    }

    @Override
    public int getSize() {
        int sum = 0;
        for (Node node : nodeList){
            sum += node.getSize();
        }
        return sum;
    }
}
