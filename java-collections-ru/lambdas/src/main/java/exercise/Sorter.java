package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {

    public static List<String> takeOldestMans(List<Map<String, String>> users) {

        return users.stream()
                // Почему-то сортировка нормально работает и без явного преобразования к дате?
//                .sorted(Comparator.comparing(user -> user.get("birthday"), Comparator.reverseOrder()))
                .sorted(Comparator.comparing(user -> LocalDate.parse(user.get("birthday")), Comparator.naturalOrder()))
                .filter(user -> user.get("gender").equals("male"))
                .map(user -> user.get("name"))
                .collect(Collectors.toList());

    }

}
// END
