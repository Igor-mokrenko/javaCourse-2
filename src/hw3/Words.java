package hw3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Words {
    private final Map<String, Integer> wordsMap = new LinkedHashMap<>();

    public Words(String[] words) {
        for (String word : words) {
            wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
        }
    }

    public void printUniqueWords() {
        wordsMap.forEach((word, i) -> {
            System.out.println(word);
        });
    }

    public void printWordsInfo() {
        wordsMap.forEach((word, i) -> {
            System.out.println(word + " " + i);
        });
    }
}
