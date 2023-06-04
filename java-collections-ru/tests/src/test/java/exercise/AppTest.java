package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertThat(App.take(numbers1, 2))
                .size().isEqualTo(2);

        assertThat(App.take(numbers1, 3))
                .size().isEqualTo(3);

        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2));
        assertThat(App.take(numbers1, 2))
                .isEqualTo(expected1);

        List<Integer> numbers2 = new ArrayList<>();
        List<Integer> expected2 = new ArrayList<>();

        assertThat(App.take(numbers2, 30))
                .isEqualTo(expected2);

        assertThat(App.take(numbers1, 999))
                .size().isEqualTo(4);


        List<Integer> expected3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertThat(App.take(numbers1, 3))
                .isEqualTo(expected3);


        // END
    }
}
