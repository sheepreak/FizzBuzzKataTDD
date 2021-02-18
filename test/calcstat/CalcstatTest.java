package calcstat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CalcstatTest {

    // Added test data from the summary
    private List<Integer> sequence = List.of(6, 9, 15, -2, 92, 11);

    @Test
    void shouldHaveMinusTwoWhenMinimalValue() {
        Calcstat calcstat = new Calcstat();
        Assertions.assertEquals(-2, calcstats.getMinimalValue(sequence));
    }
}
