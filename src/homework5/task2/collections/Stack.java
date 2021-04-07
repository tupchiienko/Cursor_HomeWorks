package homework5.task2.collections;

import java.util.EmptyStackException;

public class Stack<T> {

    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(T element) {
        Node oldTop = top;
        Node newTop = new Node();
        newTop.value = element;
        newTop.next = oldTop;
        top = newTop;
        size++;
    }

    public T pop() {
        T value = top();
        top = top.next;
        size--;
        return value;
    }

    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void clear() {
        top = null;
        size = 0;
    }

    private class Node {
        T value;
        Node next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node nextNode = top;
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                stringBuilder.append(nextNode.value);
            } else {
                stringBuilder.append(nextNode.value).append(", ");
            }
            nextNode = nextNode.next;
        }
        return '[' + stringBuilder.toString() + ']';
    }
}
