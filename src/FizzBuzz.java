public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final int FIZZ_DIVIDER = 3;
    public static final int BUZZ_DIVIDER = 5;
    public static final int FIZZ_BUZZ_DIVIDER = 15;

    public String convertFizzBuzz(int i) {
        if (isFizzBuzz(i)) {
            return FIZZ_BUZZ;
        } else if (isFizz(i)) {
            return FIZZ;
        } else if (isBuzz(i)) {
            return BUZZ;
        }
        return String.valueOf(i);
    }

    private boolean isFizzBuzz(int i) {
        return i % FIZZ_BUZZ_DIVIDER == 0;
    }

    private boolean isFizz(int i) {
        return i % FIZZ_DIVIDER == 0;
    }

    private boolean isBuzz(int i) {
        return i % BUZZ_DIVIDER == 0;
    }
}
