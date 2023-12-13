import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();

        board.add(new Post("깜찍이"));
        board.add(new Post("예쁘당"));
        board.add(new Post("귀엽당"));
        board.add(new Post("사랑스럽당"));

        print(board.getListPostIterator());


    }

    public static void print(Iterator<Post> iterator) {
        Iterator<Post> itr = iterator;
        while (itr.hasNext()) {
            Post post = itr.next();
            System.out.println(post.title);
        }
    }
}
