package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {

    public static String getForwardedVariables(String conf) {
        String result =  Arrays.stream(conf.split("\n"))
                .filter(str -> str.contains("environment="))
                .filter(str -> str.contains("X_FORWARDED_"))
                .map(str -> str.split("\""))
                .flatMap(Arrays::stream)
                .map(str -> str.split(","))
                .flatMap(strings -> Arrays.stream(strings).filter(str -> str.contains("X_FORWARDED_")))
                .collect(Collectors.toList())
                .toString();


        result = result.substring(1, result.length() - 1)
                .replaceAll("environment=\"", "")
                .replaceAll("X_FORWARDED_", "")
                .replaceAll(", ", ",");

        return result;

    }

}
//END
