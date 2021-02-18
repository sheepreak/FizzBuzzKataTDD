import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

    @Test
    void shouldHaveOneWhenIGiveOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("1", fizzBuzz.convertFizzBuzz(1));
    }

    @Test
    void shouldHaveTwoWhenIGiveTwo() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("2", fizzBuzz.convertFizzBuzz(2));
    }

    @Test
    void shouldHaveFizzWhenIGiveThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("Fizz", fizzBuzz.convertFizzBuzz(3));
    }

    @Test
    void shouldHaveBuzzWhenIGiveFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("Buzz", fizzBuzz.convertFizzBuzz(5));
    }

    @Test
    void shouldHaveFizzWhenIGiveSix() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("Fizz", fizzBuzz.convertFizzBuzz(6));
    }

    @Test
    void shouldHaveBuzzWhenIGiveTen() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("Buzz", fizzBuzz.convertFizzBuzz(10));
    }

    @Test
    void shouldHaveFizzBuzzWhenIGiveFifteen() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convertFizzBuzz(15));
    }

    @Test
    void shouldHaveFizzBuzzWhenIGiveThirty() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convertFizzBuzz(30));
    }

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "3,Fizz",
            "8,8",
            "9,Fizz",
            "10,Buzz",
            "15,FizzBuzz",
            "30,FizzBuzz"
    })
    void shouldPlayFizzbuzz(int before, String after) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals(fizzBuzz.convertFizzBuzz(before), after);
    }
}
