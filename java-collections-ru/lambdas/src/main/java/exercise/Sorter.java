package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {

    public static void main(String[] args) {
        List<Map<String, String>> users = List.of(
                Map.of("name", "Vladimir Nikolaev", "birthday", "1990-12-27", "gender", "male"),
                Map.of("name", "Andrey Petrov", "birthday", "1989-11-23", "gender", "male"),
                Map.of("name", "Anna Sidorova", "birthday", "1996-09-09", "gender", "female"),
                Map.of("name", "John Smith", "birthday", "1989-03-11", "gender", "male"),
                Map.of("name", "Vanessa Vulf", "birthday", "1985-11-16", "gender", "female"),
                Map.of("name", "Alice Lucas", "birthday", "1986-01-01", "gender", "female"),
                Map.of("name", "Elsa Oscar", "birthday", "1970-03-10", "gender", "female")
        );
        List<String> actual = takeOldestMans(users);

        System.out.println(actual);
    }

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