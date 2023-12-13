import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    List<Post> postList = new ArrayList<>();

    public void add(Post post){
        this.postList.add(post);
    }

    public List<Post> getPosts(){
        return postList;
    }

    public Iterator<Post> getListPostIterator(){
        return new ListPostIterator(postList);
    }

    public Iterator<Post> getDatePostIterator(){
        return new DatePostIterator(postList);
    }
}
