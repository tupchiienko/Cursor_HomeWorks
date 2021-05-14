package com.cursor.homework5.task1.hashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Write a Java program to append the specified element to the end of a hash set.
        HashSet<Integer> integerHashSet = new HashSet<>() {{
            add(1);
            add(2);
            add(3);
        }};
        System.out.println("1. " + integerHashSet);
        // 2. Write a Java program to iterate through all elements in a hash list.
        System.out.print("2. ");
        for (Integer integer : integerHashSet) {
            System.out.print(integer + " ");
        }
        System.out.println();
        // 3. Write a Java program to get the number of elements in a hash set.
        System.out.println("3. " + integerHashSet.size());
        // 4. Write a Java program to empty an hash set.
        HashSet<Integer> hashSetToClear = new HashSet<>(integerHashSet);
        hashSetToClear.clear();
        System.out.println("4. " + hashSetToClear);
        // 5. Write a Java program to test a hash set is empty or not.
        System.out.println("5. " + hashSetToClear + " is empty - " + hashSetToClear.isEmpty());
        // 6. Write a Java program to clone a hash set to another hash set.
        HashSet<Integer> clonedHashSet = (HashSet<Integer>) integerHashSet.clone();
        System.out.println("6. " + clonedHashSet);
        // 7. Write a Java program to convert a hash set to an array.
        Integer[] integerArray = integerHashSet.toArray(Integer[]::new);
        System.out.println("7. " + Arrays.toString(integerArray) + " is Integer[] - " + (integerArray instanceof Integer[]));
        // 8. Write a Java program to convert a hash set to a tree set.
        TreeSet<Integer> integerTreeSet = new TreeSet<>(integerHashSet);
        System.out.println("8. " + integerTreeSet + " is TreeSet - " + (integerTreeSet instanceof TreeSet));
        // 9. Write a Java program to convert a hash set to a List/ArrayList.
        List<Integer> integerList = new ArrayList<>(integerHashSet);
        System.out.println("9. " + integerList + " is ArrayList - " + (integerList instanceof ArrayList));
        // 10. Write a Java program to compare two hash set.
        System.out.println("10. ");
        System.out.println(integerHashSet);
        System.out.println(integerTreeSet);
        for (Integer integer : integerHashSet) {
            System.out.print(integerTreeSet.contains(integer) + " ");
        }
        System.out.println();
        // 11. Write a Java program to compare two sets and retain elements which are same on both sets.
        HashSet<Integer> secondIntegerHasSet = new HashSet<>(List.of(1, 2, 3, 4, 5));
        secondIntegerHasSet.retainAll(integerHashSet);
        System.out.println("11. " + secondIntegerHasSet);
        // 12. Write a Java program to remove all of the elements from a hash set.
        integerHashSet.clear();
        System.out.println("12. " + integerHashSet);
    }
}
