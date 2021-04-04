package homework5.task2.collections;

import homework5.task2.exceptions.EmptyListException;

public class LinkedList<T> {

    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void addFirst(T element) {
        Node newNode = new Node();
        newNode.value = element;
        newNode.next = first;
        newNode.prev = null;
        if (first != null)
            first.prev = newNode;
        first = newNode;
        if (last == null)
            last = newNode;
        size++;
    }

    public void addLast(T element) {
        Node newNode = new Node();
        newNode.value = element;
        newNode.next = null;
        newNode.prev = last;
        if (last != null)
            last.next = newNode;
        last = newNode;
        if (first == null)
            first = newNode;
        size++;
    }

    public void add(int index, T element) {
        if (index == 0)
            addFirst(element);
        else if (index == size)
            addLast(element);
        else {
            Node node = getNode(index);
            Node newNode = new Node();
            newNode.prev = node.prev;
            newNode.next = node;
            newNode.value = element;
            node.prev.next = newNode;
            node.prev = newNode;
            size++;
        }
    }

    public T get(int index) {
        return getNode(index).value;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new EmptyListException();
        if (size == 1) {
            clear();
        } else {
            first = first.next;
            first.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty())
            throw new EmptyListException();
        if (size == 1) {
            clear();
        } else {
            last = last.prev;
            last.next = null;
            size--;
        }
    }

    public void clear() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    private Node getNode(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        Node nextNode = first;
        for (int i = 0; i < index; i++) {
            nextNode = nextNode.next;
        }
        return nextNode;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private class Node {
        Node prev;
        T value;
        Node next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node nextNode = first;
        for (int i = 0; i < size; i++) {
            if (i == size - 1)
                stringBuilder.append(nextNode.value);
            else
                stringBuilder.append(nextNode.value).append(", ");
            nextNode = nextNode.next;
        }
        return '[' + stringBuilder.toString() + ']';
    }
}
