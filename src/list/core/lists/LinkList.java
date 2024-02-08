package list.core.lists;

import list.core.GBList;
import list.core.util.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkList<T> implements GBList<T> {
    private Node<T> head;
    private int size;

    public void add(T elem) {
        Node<T> newNode = new Node<>();
        newNode.value = elem;
        newNode.next = head;
        newNode.previous = null;

        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;
        size++;
    }

    public boolean isValidIndex(int index) {
        return index >= 0 && index < size();
    }


    public void remove(int index) {
        if (!isValidIndex(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }

        if (index == 0) {
            head = head.next;
            head.previous = null;
        } else {
            Node<T> current = head;
            for (int i = 0; i != index; i++) {
                current = current.next;
            }
            if (current.next != null)
                current.next.previous = current.previous;
            current.previous.next = current.next;

        }
        size--;
    }

    public T get(int index) {
        if (!isValidIndex(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T value = current.value;
                current = current.next;
                return value;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            builder.append(current.value).append(", ");
            current = current.next;
        }
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
