package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emailsList) {

        return emailsList.stream()
                .filter(email -> email.endsWith("gmail.com")
                        || email.endsWith("yandex.ru")
                        || email.endsWith("hotmail.com"))
                .count();

    }
}
// END
