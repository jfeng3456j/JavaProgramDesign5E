package BuildJavaPrograms.Chapter_15_Implement_Collection;

import java.util.NoSuchElementException;

public class ArrayListIterator {

    private ArrayIntList list;
    private int position;
    private boolean removeOk;

    public ArrayListIterator(ArrayIntList list) {
        this.list = list;
        position = 0;
        removeOk = false;
    }

    public boolean hasNext() {
        return position < list.size();
    }

    //pre: hasNext() throws ElementException if not
    //post: returns the next element in the iteration
    public int next() {

        if(!hasNext()) {
            throw new NoSuchElementException();
        }

        int result = list.get(position);
        position++;
        removeOk = true;
        return result;
    }

    //pre: next() has been called without a call on remove throws StateException
    //post: remove the last element
    public void remove() {

        if(!removeOk) {
            throw new IllegalStateException();
        }

        list.remove(position -1);
        position--;
        removeOk = false;
    }



}
