package exercise;

import java.util.Arrays;

// BEGIN
public class App {

    public static String[][] enlargeArrayImage(String[][] arrayImage) {
        if (arrayImage.length == 0) {
            return new String[0][0];
        }

        String[][] result = new String[arrayImage.length * 2][arrayImage[0].length * 2];
        int offsetI = 0;
        int offsetJ = 0;

        for (int i = 0; i < arrayImage.length; i++) {
            for (int j = 0; j < arrayImage[0].length; j++) {
                result[i + offsetI][j + offsetJ] = arrayImage[i][j];
                result[i + offsetI + 1][j + offsetJ] = arrayImage[i][j];
                result[i + offsetI][j + offsetJ + 1] = arrayImage[i][j];
                result[i + offsetI + 1][j + offsetJ + 1] = arrayImage[i][j];
                offsetJ++;
            }
            offsetJ = 0;
            offsetI++;
        }

        return result;
    }

}
// END
