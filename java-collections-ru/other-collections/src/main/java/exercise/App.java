package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN

public class App {

    public static Map<String, String> genDiff(Map<String, Object> m1, Map<String, Object> m2) {
        Map<String, String> diff = new LinkedHashMap<>();
        Set<String> keys = new TreeSet<>();

        keys.addAll(m1.keySet());
        keys.addAll(m2.keySet());

        for (String key : keys) {
            String valueState = "unchanged";

            if (m1.get(key) == null && !(m2.get(key) == null)) {
                valueState = "added";
            } else if (m2.get(key) == null && !(m1.get(key) == null)) {
                valueState = "deleted";
            } else if (!(m1.get(key) == m2.get(key))) {
                valueState = "changed";
            }

            diff.put(key, valueState);
        }

        return diff;
    }

}
//END
