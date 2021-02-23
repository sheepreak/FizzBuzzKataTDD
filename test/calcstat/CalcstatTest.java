package calcstat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CalcstatTest {

    // Added test data from the summary
    private List<Integer> sequence1 = List.of(6, 9, 15, -2, 92, 11);

    // Added test data from the summary
    private List<Integer> sequence2 = List.of(6, 9, 15, -5, 105, 11, 25, 12);

    @Test
    void shouldHaveMinusTwoWhenMinimalValueOnSequence1() {
        Calcstat calcstat = new Calcstat();
        Assertions.assertEquals(-2, calcstat.getMinimalValue(sequence1));
    }

    @Test
    void shouldHaveMinusFiveWhenMinimalValueOnSequence2() {
        Calcstat calcstat = new Calcstat();
        Assertions.assertEquals(-5, calcstat.getMinimalValue(sequence2));
    }

    @Test
    void shouldHaveNinetyTwoWhenMaximalValueOnSequence1() {
        Calcstat calcstat = new Calcstat();
        Assertions.assertEquals(92, calcstat.getMaximalValue(sequence1));
    }

    @Test
    void shouldHaveOneOFiveWhenMaximalValueOnSequence2() {
        Calcstat calcstat = new Calcstat();
        Assertions.assertEquals(105, calcstat.getMaximalValue(sequence2));
    }

    @Test
    void shouldHaveSixWhenLengthOnSequence1() {
        Calcstat calcstat = new Calcstat();
        Assertions.assertEquals(6, calcstat.getLength(sequence1));
    }

    @Test
    void shouldHaveEightWhenLengthOnSequence2() {
        Calcstat calcstat = new Calcstat();
        Assertions.assertEquals(8, calcstat.getLength(sequence2));
    }

    @Test
    void shouldHaveTwentyOnePointEightWhenAvgOnSequence1() {
        Calcstat calcstat = new Calcstat();
        Assertions.assertEquals(21.833333333333332, calcstat.getAvg(sequence1));
    }
}
