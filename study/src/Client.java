public class Client {
    public static void main(String[] args) {

        Folder root = new Folder("root");
        File node = new File("빈 폴더1",9);
        File node2 = new File("빈 폴더2",9);
        root.add(node);
        root.add(node2);

        root.print();


    }
}
