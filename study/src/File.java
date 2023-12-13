public class File implements Node{

    String name;
    int size;

    public File(String name,int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public void print() {
        this.print("");
    }

    @Override
    public void print(String s) {
        System.out.println(s + name+" ("+size+"kb)");

    }

    @Override
    public int getSize() {
        return size;
    }
}
