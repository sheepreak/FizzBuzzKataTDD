public class FizzBuzz {
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
}
