package homework5.task1.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        ArrayList<String> colors = new ArrayList<>(List.of("red", "green", "blue"));
        System.out.println("1. " + colors);
        // 2. Write a Java program to iterate through all elements in a array list.
        System.out.print("2. ");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();
        // 3. Write a Java program to insert an element into the array list at the first position.
        colors.add(0, "yellow");
        System.out.println("3. " + colors);
        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println("4. " + colors.get(0));
        // 5. Write a Java program to update specific array element by given element.
        colors.set(3, "black");
        System.out.println("5. " + colors);
        // 6. Write a Java program to remove the third element from a array list.
        colors.remove(2);
        System.out.println("6. " + colors);
        // 7. Write a Java program to search an element in a array list.
        String element = "red";
        int index = colors.indexOf(element);
        System.out.print("7. ");
        if (index >= 0) {
            System.out.println("Index of '" + element + "' is " + index);
        } else {
            System.out.println("Element '" + element + "' not found");
        }
        // 8. Write a Java program to sort a given array list.
        colors.sort(Comparator.naturalOrder());
        System.out.println("8. " + colors);
        // 9. Write a Java program to copy one array list into another.
        ArrayList<String> copyOfColors = new ArrayList<>(colors);
        System.out.println("9. " + copyOfColors);
        // 10. Write a Java program to shuffle elements in a array list.
        Collections.shuffle(colors);
        System.out.println("10. " + colors);
        // 11. Write a Java program to reverse elements in a array list.
        Collections.reverse(colors);
        System.out.println("11. " + colors);
        // 12. Write a Java program to extract a portion of a array list.
        ArrayList<String> colorsSubList = new ArrayList<>(colors.subList(0, 2));
        System.out.println("12. " + colorsSubList);
        // 13. Write a Java program to compare two array lists.
        System.out.println("13. ");
        System.out.println(colors);
        System.out.println(colorsSubList);
        for (String color : colors) {
            System.out.print(colorsSubList.contains(color) + " ");
        }
        System.out.println();
        // 14. Write a Java program of swap two elements in an array list.
        Collections.swap(colors, 0, 1);
        System.out.println("14. " + colors);
        // 15. Write a Java program to join two array lists.
        ArrayList<String> newColors = new ArrayList<>(List.of("purple", "white", "orange"));
        ArrayList<String> concatenatedColors = new ArrayList<>() {{
            addAll(colors);
            addAll(newColors);
        }};
        System.out.println("15. " + concatenatedColors);
        // 16. Write a Java program to clone an array list to another array list.
        ArrayList<String> colorsClone = (ArrayList<String>) colors.clone();
        System.out.println("16. " + colorsClone);
        // 17. Write a Java program to empty an array list.
        colorsClone.clear();
        System.out.println("17. " + colorsClone);
        // 18. Write a Java program to test an array list is empty or not.
        System.out.println("18. Is empty: " + colorsClone.isEmpty());
        // 19. Write a Java program to trim the capacity of an array list the current list size.
        colors.trimToSize();
        // 20. Write a Java program to increase the size of an array list.
        colors.ensureCapacity(colors.size() + 5);
        // 21. Write a Java program to replace the second element of a ArrayList with the specified element.
        colors.set(1, "pink");
        System.out.println("21. " + colors);
        // 22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
        System.out.print("22. ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " ");
        }
    }
}
