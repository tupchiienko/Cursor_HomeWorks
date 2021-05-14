package com.cursor.homework14;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class TextUtil {
    public String getTextFromFile(String filePath) throws URISyntaxException, IOException {
        var fileURI = Objects.requireNonNull(getClass().getClassLoader().getResource(filePath)).toURI();
        return Files.readString(Path.of(fileURI));
    }

    public List<String> getWordsList(String text) {
        return Arrays.stream(text.replace('\n', ' ').chars()
                .filter(c -> Character.isAlphabetic(c) || c == ' ' || c == '\'')
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString().split(" "))
                .filter(s -> !s.isBlank())
                .collect(Collectors.toList());
    }

    public Map<String, Integer> getWordsCountMap(List<String> wordsList) {
        return wordsList.stream()
                .collect(HashMap::new, (m, k) -> m.put(k, m.containsKey(k) ? (m.get(k) + 1) : 1), HashMap::putAll);
    }

    public Map<String, Integer> getMostRepeatedWords(List<String> wordsList, int wordsCount) {
        Map<String, Integer> wordsCountMap = getWordsCountMap(wordsList);
        return wordsCountMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .skip(wordsCountMap.size() - wordsCount)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
