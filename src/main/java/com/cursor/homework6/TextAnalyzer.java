package com.cursor.homework6;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class TextAnalyzer {
    private final String text;
    private final int letterCount;
    private final int spaceCount;
    private final int numberCount;
    private final int punctuationCount;
    private final Map<Character, Integer> lettersEntryMap;
    private final Map<String, Integer> wordsEntryMap;
    private final String shortestWord;
    private final String longestWord;

    public TextAnalyzer(String text) {
        this.text = text;
        this.letterCount = calculateLetterCount();
        this.spaceCount = calculateSpaceCount();
        this.numberCount = calculateNumberCount();
        this.punctuationCount = calculatePunctuationCount();
        this.lettersEntryMap = calculateLettersEntryMap();
        this.wordsEntryMap = calculateWordsEntryMap();
        this.shortestWord = calculateShortestWord();
        this.longestWord = calculateLongestWord();
    }

    public TextAnalyzer(Path filePath) {
        this.text = readFromFile(filePath);
        this.letterCount = calculateLetterCount();
        this.spaceCount = calculateSpaceCount();
        this.numberCount = calculateNumberCount();
        this.punctuationCount = calculatePunctuationCount();
        this.lettersEntryMap = calculateLettersEntryMap();
        this.wordsEntryMap = calculateWordsEntryMap();
        this.shortestWord = calculateShortestWord();
        this.longestWord = calculateLongestWord();
    }

    public String getText() {
        return text;
    }

    public int getLetterCount() {
        return letterCount;
    }

    public int getSpaceCount() {
        return spaceCount;
    }

    public int getNumberCount() {
        return numberCount;
    }

    public int getPunctuationCount() {
        return punctuationCount;
    }

    public Map<Character, Integer> getLettersEntryMap() {
        return lettersEntryMap;
    }

    public Map<String, Integer> getWordsEntryMap() {
        return wordsEntryMap;
    }

    public String getShortestWord() {
        return shortestWord;
    }

    public String getLongestWord() {
        return longestWord;
    }

    private int calculateLetterCount() {
        return (int) text.chars().filter(Character::isLetter).count();
    }

    private int calculateSpaceCount() {
        return (int) text.chars().filter(Character::isSpaceChar).count();
    }

    private int calculateNumberCount() {
        return (int) text.chars().filter(Character::isDigit).count();
    }

    private int calculatePunctuationCount() {
        return (int) text.chars().filter(this::isPunctuation).count();
    }

    private Map<Character, Integer> calculateLettersEntryMap() {
        return text.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(TreeMap::new, (m, k) -> m.put(k, m.containsKey(k) ? (m.get(k) + 1) : 1), TreeMap::putAll);
    }

    private Map<String, Integer> calculateWordsEntryMap() {
        String filteredString = text.toLowerCase().chars()
                .filter(c -> Character.isLetter(c) || Character.isWhitespace(c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return Arrays.stream(filteredString.split("[ \n]"))
                .map(s -> s = s.trim())
                .filter(s -> s.length() > 3)
                .collect(TreeMap::new, (m, k) -> m.put(k, m.containsKey(k) ? (m.get(k) + 1) : 1), TreeMap::putAll);
    }

    private String calculateShortestWord() {
        Map.Entry<String, Integer> shortestWordEntry = wordsEntryMap.entrySet().stream()
                .min(Comparator.comparingInt(e -> e.getKey().length()))
                .orElseThrow(NoSuchElementException::new);
        return shortestWordEntry.getKey() + ":" + shortestWordEntry.getValue();
    }

    private String calculateLongestWord() {
        Map.Entry<String, Integer> longestWordEntry = wordsEntryMap.entrySet().stream()
                .max(Comparator.comparingInt(e -> e.getKey().length()))
                .orElseThrow(NoSuchElementException::new);
        return longestWordEntry.getKey() + ":" + longestWordEntry.getValue();
    }

    private String readFromFile(Path filePath) {
        try (InputStream inputStream = Files.newInputStream(filePath)) {
            if (inputStream.available() > 0) {
                byte[] bytes = new byte[inputStream.available()];
                int readBytesCount = inputStream.read(bytes);
                return new String(bytes, 0, readBytesCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private boolean isPunctuation(int codePoint) {
        return isPunctuation((char) codePoint);
    }

    private boolean isPunctuation(char c) {
        return List.of(',', '.', '!','?', ':', ';').contains(c);
    }

    @Override
    public String toString() {
        return "TextAnalyzer{" +
                "letterCount=" + letterCount + ';' +
                " spaceCount=" + spaceCount + ';' +
                " numberCount=" + numberCount + ';' +
                " punctuationCount=" + punctuationCount + ';' +
                " shortestWord=" + shortestWord + ';' +
                " longestWord=" + longestWord +
                '}';
    }
}
