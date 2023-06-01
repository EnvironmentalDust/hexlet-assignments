package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class  App {

    public static boolean scrabble(String chars, String word){
        ArrayList<String> wordCharsList = new ArrayList<>(Arrays.asList(word.toLowerCase().split("")));

        // Можно решить без ArrayList, если использовать инициализировать отдельную переменную
        // для word.toLowerCase() и на него делать word.replaceFirst(String.valueOf(chars.charAt(i)))
        for (int i = 0; i < chars.length(); i++) {
            wordCharsList.remove(String.valueOf(chars.charAt(i)));
        }

        return wordCharsList.size() == 0;
    }
}
//END
