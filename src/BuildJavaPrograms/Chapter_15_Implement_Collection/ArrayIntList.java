package BuildJavaPrograms.Chapter_15_Implement_Collection;

import org.hamcrest.internal.ArrayIterator;

import java.util.Arrays;

public class ArrayIntList {

    private int[] elementData;
    private int size;

    public ArrayIntList() {
        this(100);
    }

    //pre: capacity >= 0
    //post: construct empty list with given capacity
    public ArrayIntList(int capacity) {

        if (capacity < 1) {
            throw new IllegalArgumentException("capacity "+capacity);
        }

        elementData = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        checkCapacity(size + 1);
        elementData[size] = value;
        size++;
    }

    //pre: 0<=index<size()
    //post: returns the integer at the given index in the list
    public void add(int index, int value) {
        checkCapacity(size + 1);
        for (int i = size; i >= index + 1; i--) {
                elementData[i] = elementData[i-1];
        }
        elementData[index] = value;
        size++;
    }

    public void addAll(ArrayIntList other) {
        checkCapacity(size + other.size);
        for (int i = 0; i < other.size(); i++) {
             add(other.elementData[i]);
        }
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        checkIndexBound(index);
        return elementData[index];
    }

    public int indexOf(int value) {
        for (int i = 0 ; i < size; i++) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean contain (int value) {
        return indexOf(value) >=0 ;
    }

    public void set (int index, int value) {
        checkIndexBound(index);
        elementData[index] = value;
    }

    public void clear() {
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void remove (int value) {
        for (int i = 0; i < size -1; i++) {
            if (elementData[i] == value) {
                elementData[i] = elementData[i+1];
            }
        }
        size--;
    }

    private void checkIndexBound(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }

    private void checkCapacity(int capacity) {
        if (capacity > elementData.length) {
            throw new IllegalStateException("exceed list capacity");
        }
    }

    public void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int newCapacity = elementData.length * 2 + 1;
            if (capacity > newCapacity) {
              newCapacity = capacity;
            }

            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    public ArrayListIterator iterator() {
        return new ArrayListIterator(this);
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        } else {

            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += "," + elementData[i];
            }
            result += "]";
            return result;
        }
    }
}
