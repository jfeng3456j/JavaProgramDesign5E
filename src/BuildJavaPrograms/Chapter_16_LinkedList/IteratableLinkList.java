package BuildJavaPrograms.Chapter_16_LinkedList;

//Generic interface for list of ojbects of type E
public interface IteratableLinkList<E> extends Iterable<E> {
    public int size();
    public E get(int index);
    public int get(E index);
    public int indexOf(E value);
    public boolean isEmpty();
    public boolean contains(E value);
    public void add(E value);
    public void add(int index, E value);
    public void addAll(IteratableLinkList<E> other);
    public void remove(int index);
    public void set(int index, E value);
    public void clear();
}
