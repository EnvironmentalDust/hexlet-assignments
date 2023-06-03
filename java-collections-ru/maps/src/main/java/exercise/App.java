package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.length() == 0) {
            return new HashMap<>();
        }

        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            wordCount.merge(word, 1, Integer::sum);
        }

        return wordCount;
    }

    public static String toString(Map<String, Integer> wordCount) {
        if (wordCount.isEmpty()) {
            return "{}";
        }

        StringBuilder result = new StringBuilder("{");

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            result.append(String.format("\n  %s: %s", entry.getKey(), entry.getValue()));
        }

        result.append("\n}");

        return result.toString();
    }

}
//END
