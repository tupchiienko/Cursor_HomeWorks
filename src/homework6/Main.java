package homework6;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        TextAnalyzer textAnalyzer = new TextAnalyzer("Test string with numbers: 1, 2, 3");
        System.out.println(textAnalyzer);
        System.out.println("Letters entry map: " + textAnalyzer.getLettersEntryMap());
        System.out.println("\nTask 2: ");
        textAnalyzer = new TextAnalyzer(Path.of("text.txt"));
        System.out.println(textAnalyzer);
    }
}
