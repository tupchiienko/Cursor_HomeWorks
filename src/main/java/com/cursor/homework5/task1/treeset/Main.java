package com.cursor.homework5.task1.treeset;

import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // 1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> colorsTreeSet = new TreeSet<>(List.of("red", "green", "blue"));
        System.out.println("1. " + colorsTreeSet);
        // 2. Write a Java program to iterate through all elements in a tree set.
        System.out.print("2. ");
        for (String s : colorsTreeSet) {
            System.out.print(s + " ");
        }
        System.out.println();
        // 3. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> otherColorsTreeSet = new TreeSet<>(List.of("yellow", "pink"));
        colorsTreeSet.addAll(otherColorsTreeSet);
        System.out.println("3. " + colorsTreeSet);
        // 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        System.out.println("4. " + colorsTreeSet.descendingSet());
        // 5. Write a Java program to get the first and last elements in a tree set.
        System.out.println("5. First element '" + colorsTreeSet.first() + "', last element '" + colorsTreeSet.last() + "'");
        // 6. Write a Java program to clone a tree set list to another tree set.
        TreeSet<String> clonedColorsTreeSet = (TreeSet<String>) colorsTreeSet.clone();
        System.out.println("6. " + clonedColorsTreeSet);
        // 7. Write a Java program to get the number of elements in a tree set.
        System.out.println("7. Size: " + colorsTreeSet.size());
        // 8. Write a Java program to compare two tree sets.
        System.out.println("8. ");
        System.out.println(colorsTreeSet);
        System.out.println(otherColorsTreeSet);
        for (String s : colorsTreeSet) {
            System.out.print(otherColorsTreeSet.contains(s) + " ");
        }
        System.out.println();
        // 9. Write a Java program to find the numbers less than 7 in a tree set.
        TreeSet<Integer> numbersTreeSet = new TreeSet<>(List.of(7, 1, 12, 5, 3, 11, 0, 8));
        System.out.println("9. " + numbersTreeSet + " elements < 7 : " + numbersTreeSet.headSet(7));
        // 10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        System.out.println("10. " + numbersTreeSet + " element >= 6 : " + numbersTreeSet.ceiling(6));
        // 11. Write a Java program to get the element in a tree set which is less than or equal to the given element.
        System.out.println("11. " + numbersTreeSet + " element <= 6 : " + numbersTreeSet.floor(6));
        // 12. Write a Java program to get the element in a tree set which is strictly greater than the given element.
        System.out.println("12. " + numbersTreeSet + " element > 7 : " + numbersTreeSet.higher(7));
        // 13. Write a Java program to get an element in a tree set which is strictly less than the given element.
        System.out.println("13. " + numbersTreeSet + " element < 3 : " + numbersTreeSet.lower(3));
        // 14. Write a Java program to retrieve and remove the first element of a tree set.
        System.out.println("14. First element is '" + numbersTreeSet.pollFirst() + "' : " + numbersTreeSet);
        // 15. Write a Java program to retrieve and remove the last element of a tree set.
        System.out.println("15. Last element is '" + numbersTreeSet.pollLast() + "' : " + numbersTreeSet);
        // 16. Write a Java program to remove a given element from a tree set.
        numbersTreeSet.remove(7);
        System.out.println("16. " + numbersTreeSet);
    }
}
