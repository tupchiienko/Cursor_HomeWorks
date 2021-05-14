package com.cursor.homework5.task2;

import com.cursor.homework5.task2.collections.LinkedList;
import com.cursor.homework5.task2.collections.Queue;
import com.cursor.homework5.task2.collections.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>() {{
            push(1);
            push(2);
            push(3);
        }};
        System.out.println("Stack: " + stack);
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.top());
        System.out.println("Stack: " + stack);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack is empty: " + stack.isEmpty());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Stack: " + stack);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack is empty: " + stack.isEmpty());
        Queue<Integer> queue = new Queue<>() {{
            enqueue(1);
            enqueue(2);
            enqueue(3);
        }};
        System.out.println("\nQueue: " + queue);
        System.out.println("Dequeue element: " + queue.dequeue());
        System.out.println("Queue: " + queue);
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Dequeue element: " + queue.dequeue());
        System.out.println("Dequeue element: " + queue.dequeue());
        System.out.println("Queue: " + queue);
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue is empty: " + queue.isEmpty());
        LinkedList<Integer> linkedList = new LinkedList<>() {{
            addFirst(1);
            addFirst(0);
            addLast(2);
            addLast(3);
            add(4, 4);
        }};
        System.out.println("\nLinked list: " + linkedList);
        System.out.println("List size: " + linkedList.size());
        System.out.println("List is empty: " + linkedList.isEmpty());
        linkedList.removeFirst();
        System.out.println("Linked list: " + linkedList);
        System.out.println("List size: " + linkedList.size());
        linkedList.removeLast();
        System.out.println("Linked list: " + linkedList);
        System.out.println("List size: " + linkedList.size());
        linkedList.clear();
        System.out.println("Linked list: " + linkedList);
        System.out.println("List size: " + linkedList.size());
        System.out.println("List is empty: " + linkedList.isEmpty());
    }
}
