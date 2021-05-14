package com.cursor.homework5.task1.linkedlist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Write a Java program to append the specified element to the end of a linked list.
        LinkedList<Integer> numbers = new LinkedList<>(List.of(1, 2, 3));
        numbers.addLast(4);
        System.out.println("1. " + numbers);
        // 2. Write a Java program to iterate through all elements in a linked list.
        System.out.print("2. ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        // 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        Iterator<Integer> iterator = numbers.listIterator(1);
        System.out.print("3. ");
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        // 4. Write a Java program to iterate a linked list in reverse order.
        iterator = numbers.descendingIterator();
        System.out.print("4. ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        // 5. Write a Java program to insert the specified element at the specified position in the linked list.
        numbers.add(2, 23);
        System.out.println("5. " + numbers);
        // 6. Write a Java program to insert elements into the linked list at the first and last position.
        numbers.addFirst(0);
        numbers.addLast(5);
        System.out.println("6. " + numbers);
        // 7. Write a Java program to insert the specified element at the front of a linked list.
        numbers.offerFirst(-1);
        System.out.println("7. " + numbers);
        // 8. Write a Java program to insert the specified element at the end of a linked list.
        numbers.offerLast(6);
        System.out.println("8. " + numbers);
        // 9. Write a Java program to insert some elements at the specified position into a linked list.
        numbers.addAll(5, List.of(1, 2));
        System.out.println("9. " + numbers);
        // 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println("10. '" + 1 + "' " +
                "first occurrence - " + numbers.indexOf(1) + "; " +
                "last - " + numbers.lastIndexOf(1));
        // 11. Write a Java program to display the elements and their positions in a linked list.
        System.out.println("11. ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i) + " index " + i);
        }
        // 12. Write a Java program to remove a specified element from a linked list.
        numbers.remove(Integer.valueOf(23));
        System.out.println("12. " + numbers);
        // 13. Write a Java program to remove first and last element from a linked list.
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("13. " + numbers);
        // 14. Write a Java program to remove all the elements from a linked list.
        LinkedList<Integer> copyOfNumbers = new LinkedList<>(numbers);
        copyOfNumbers.clear();
        System.out.println("14. " + copyOfNumbers);
        // 15. Write a Java program of swap two elements in a linked list.
        Collections.swap(numbers, 0, 4);
        System.out.println("15. " + numbers);
        // 16. Write a Java program to shuffle the elements in a linked list.
        Collections.shuffle(numbers);
        System.out.println("16. " + numbers);
        // 17. Write a Java program to join two linked lists.
        LinkedList<Integer> newNumbers = new LinkedList<>(List.of(11, 12, 13));
        LinkedList<Integer> joinedNumbers = new LinkedList<>() {{
            addAll(numbers);
            addAll(newNumbers);
        }};
        System.out.println("17. " + joinedNumbers);
        // 18. Write a Java program to clone an linked list to another linked list.
        LinkedList<Integer> clonedNumbers = (LinkedList<Integer>) numbers.clone();
        System.out.println("18. " + clonedNumbers);
        // 19. Write a Java program to remove and return the first element of a linked list.
        System.out.println("19. Removed '" + numbers.removeFirst() + "' : " + numbers);
        // 20. Write a Java program to retrieve but does not remove, the first element of a linked list.
        System.out.println("20. First element '" + numbers.peekFirst() + "' : " + numbers);
        // 21. Write a Java program to retrieve but does not remove, the last element of a linked list.
        System.out.println("21. Last element '" + numbers.peekLast() + "' : " + numbers);
        // 22. Write a Java program to check if a particular element exists in a linked list.
        System.out.println("22. List contains '" + 10 + "' : " + numbers.contains(10));
        // 23. Write a Java program to convert a linked list to array list.
        ArrayList<Integer> arrayListFromLinked = new ArrayList<>(numbers);
        System.out.println("23. " + arrayListFromLinked + " is ArrayList - " + (arrayListFromLinked instanceof ArrayList));
        // 24. Write a Java program to compare two linked lists.
        System.out.println("24. ");
        System.out.println(joinedNumbers);
        System.out.println(numbers);
        for (Integer number : joinedNumbers) {
            System.out.print(numbers.contains(number) + " ");
        }
        System.out.println();
        // 25. Write a Java program to test an linked list is empty or not.
        System.out.println("25. Is empty: " + numbers.isEmpty());
        // 26. Write a Java program to replace an element in a linked list.
        numbers.set(2, 50);
        System.out.println("26. " + numbers);
    }
}
