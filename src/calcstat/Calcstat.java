package calcstat;

import java.util.List;

public class Calcstat {


    public int getMinimalValue(List<Integer> sequence) {
        return sequence.stream().min(Integer::compareTo).orElseThrow();
    }
}