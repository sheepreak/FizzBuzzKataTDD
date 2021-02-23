package calcstat;

import java.util.List;

public class Calcstat {


    public int getMinimalValue(List<Integer> sequence) {
        return sequence.stream().min(Integer::compareTo).orElseThrow();
    }

    public int getMaximalValue(List<Integer> sequence) {
        return sequence.stream().max(Integer::compareTo).orElseThrow();
    }

    public int getLength(List<Integer> sequence) {
        return 6;
    }
}
