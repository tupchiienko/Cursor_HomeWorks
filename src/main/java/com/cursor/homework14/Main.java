package com.cursor.homework14;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class Main {
    public static final int N = 5;

    public static void main(String[] args) throws IOException, URISyntaxException {
        var textUtil = new TextUtil();
        var wordsList = textUtil.getWordsList(textUtil.getTextFromFile("data.txt"));
        var uncensoredWordsList = textUtil.getWordsList(textUtil.getTextFromFile("uncensored.txt"));
        var removedWordsList = new ArrayList<String>();
        for (String word : wordsList) {
            if (word.length() < 3 || uncensoredWordsList.contains(word)) {
                removedWordsList.add(word);
            }
        }
        var removedWordsCountMap = textUtil.getWordsCountMap(removedWordsList);
        System.out.println("Words count: " + wordsList.size());
        wordsList.removeAll(removedWordsList);
        System.out.println("Removed words count: " + removedWordsList.size());
        System.out.println("Words count after filtering: " + wordsList.size());
        System.out.println("Removed words map: " + removedWordsCountMap);
        var mostRepeatedWords = textUtil.getMostRepeatedWords(wordsList, N);
        System.out.println(N + " most repeated words: " + mostRepeatedWords);
    }
}
