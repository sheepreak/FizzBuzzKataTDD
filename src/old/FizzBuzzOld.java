package old;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzOld {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static String convertFizzBuzz(Integer number) {
        if (number % 15 == 0) {
            return FIZZ + BUZZ;
        } else if (number % 5 == 0) {
            return BUZZ;
        } else if (number % 3 == 0) {
            return FIZZ;
        } else {
            return number.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 100).mapToObj(FizzBuzzOld::convertFizzBuzz).collect(Collectors.joining(" ")));
    }
}
