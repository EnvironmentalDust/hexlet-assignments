package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {

    @Test
    void testEnlargeArrayImageEmpty() {
        String[][] emptyArray = new String[0][0];
        String[][] enlargedArray = App.enlargeArrayImage(emptyArray);

        assertThat(enlargedArray)
                .isEqualTo(emptyArray);
    }

    @Test
    void testEnlargeArrayImage() {
        String[][] image = {
                {" ", " ", " "},
                {" ", "*", " "},
                {" ", " ", " "},
        };

        String[][] enlargedExpected = {
                {" ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " "},
                {" ", " ", "*", "*", " ", " "},
                {" ", " ", "*", "*", " ", " "},
                {" ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " "},
        };

        String[][] enlargedActual = App.enlargeArrayImage(image);

        assertThat(enlargedActual)
                .isEqualTo(enlargedExpected);

    }

}
// END
