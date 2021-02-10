import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

    //TODO TDD
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "3,Fizz",
            "8,8",
            "9,Fizz",
            "10,Buzz",
            "15,FizzBuzz"}
    )
    void shouldAllReturnOk(String before, String after) {
        Assertions.assertEquals(FizzBuzz.convertFizzBuzz(Integer.valueOf(before)), after);
    }
}
