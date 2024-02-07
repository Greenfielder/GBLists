package list.core.util;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private E[] values;
    private int index;

    public ArrayIterator(E[] values) {
        this.values = values;
        this.index = 0;
    }

    public <T> ArrayIterator(Node<T> head) {
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}