package homework12;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int mark = 10;
        try {
            String textMark = markToTextMark(mark);
            System.out.println("Mark " + mark + " is " + textMark);
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("-".repeat(30));
        System.out.println("Task 2");
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 2, 3));
        int uniqueNumbersPercent = integerList.stream().collect(Collectors.teeing(
                Collectors.counting(),
                Collectors.collectingAndThen(Collectors.toSet(), Set::size),
                (allCount, filteredCount) -> (int) (((double) filteredCount / allCount) * 100)
        ));
        System.out.println(integerList + " -> " + uniqueNumbersPercent + '%');
        System.out.println("-".repeat(30));
    }

    static String markToTextMark(int mark) {
        return switch (mark) {
            case 9, 10 -> "Well";
            case 7, 8 -> "Good";
            case 6 -> "Acceptable";
            case 5 -> "Bad";
            case 0, 1, 2, 3, 4 -> "Very bad";
            default -> throw new IllegalStateException("Unexpected value: " + mark);
        };
    }
}
