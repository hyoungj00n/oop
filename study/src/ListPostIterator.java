import java.util.Iterator;
import java.util.List;

public class ListPostIterator implements Iterator<Post> {

    private Iterator<Post> itr;

    public ListPostIterator(List<Post> posts){
        this.itr = posts.iterator();
    }
    @Override
    public boolean hasNext() {
        return this.itr.hasNext();
    }

    @Override
    public Post next() {
        return this.itr.next();
    }
}
