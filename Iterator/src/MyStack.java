import java.util.ArrayList;
import java.util.Iterator;

public class MyStack<E> implements Iterable<E> {
    class MyStackIterator<E> implements Iterator<E> {
        int index;

        public MyStackIterator() {
            index = list.size() - 1;
        }

        public boolean hasNext() {
            return index > 0;
        }

        public E next() {
            E o = (E) list.get(index);
            index--;
            return o;
        }
    }

    private ArrayList<E> list;

    public MyStack(){
        list = new ArrayList<>();
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = (E) list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return o;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public Iterator<E> iterator(){
        return new MyStackIterator<E>();
    }

}
