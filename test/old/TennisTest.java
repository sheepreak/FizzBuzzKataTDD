package old;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TennisTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0, The game hasn't started yet",
            "1, 1, Looks like both players have reached fifteen",
            "1, 2, Player 2 is leading thirty to fifteen",
            "0, 3, Player 2 is leading forty to love",
            "0, 4, Player 2 is our winner",
            "3, 3, We have a deuce",
            "4, 3, Player 1 has gotten himself an advantage dear Nelson",
            "5, 3, Player 1 is our winner",
            "10, 10, We have a deuce",
            "11, 10, Player 1 has gotten himself an advantage dear Nelson",
            "12, 10, Player 1 is our winner",
            "20, 3, Looks like the game is rigged because that score is not possible"
    })
    void shouldReturnGivenSentence(int player1, int player2, String result) {
        Assertions.assertEquals(result, Tennis.applyScore(player1, player2));
    }
}
