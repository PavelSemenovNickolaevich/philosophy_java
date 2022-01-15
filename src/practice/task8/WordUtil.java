package practice.task8;

import java.util.HashMap;
import java.util.Map;

public class WordUtil {

    private static final String EMPTY = "";
    private static final String SPACE = " ";


    public static Map<String, Integer> calcWordFrequency(String text) {
        Map<String, Integer> map = new HashMap<>();
        String[] worlds = text
                .replace(".", EMPTY)
                .replace(",", EMPTY)
                .replace("!", EMPTY)
                .split(SPACE);
        for (String word : worlds) {
            Integer  oldCount = map.get(word);
            Integer newCount = oldCount == null ? 1 : oldCount + 1;
            map.put(word, newCount);
        }
        return map;
    }
}
