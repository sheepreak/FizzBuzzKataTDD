import java.util.Scanner;

public class Tennis {

    private static final String NOT_STARTED = "The game hasn't started yet";
    private static final String BOTH_EQUAL = "Looks like both players have reached %s";
    private static final String DIFFERENT_INFERIOR_TO_40 = "Player %s is leading %s to %s";
    private static final String DEUCE = "We have a deuce";
    private static final String ADVANTAGE = "Player %s has gotten himself an advantage dear Nelson";
    private static final String WINNER = "Player %s is our winner";
    private static final String IMPOSSIBLE = "Looks like the game is rigged because that score is not possible";

    public static String applyScore(int player1, int player2) {
        if (isImpossible(player1, player2)) {
            return IMPOSSIBLE;
        }

        if (isFinished(player1, player2)) {
            return callWinner(player1, player2);
        }

        if (isAdvantaged(player1, player2)) {
            return callAdvantage(player1, player2);
        }

        if (hasNotStarted(player1, player2)) {
            return NOT_STARTED;
        }

        if (isEqual(player1, player2)) {
            return callEqual(player1);
        }

        return callScore(player1, player2);
    }

    private static String callScore(int player1, int player2) {
        return String.format(
                DIFFERENT_INFERIOR_TO_40,
                player1 > player2 ? "1" : "2",
                player1 > player2 ? convertScore(player1) : convertScore(player2),
                player1 < player2 ? convertScore(player1) : convertScore(player2)
        );
    }

    private static boolean isImpossible(int player1, int player2) {
        return ((player1 > 4 || player2 > 4) && Math.abs(player1 - player2) > 2)
                || ((player1 <= 4 || player2 <= 4) && Math.abs(player1 - player2) > 5);
    }

    private static String callEqual(int player1) {
        return player1 < 3 ? String.format(BOTH_EQUAL, convertScore(player1)) : DEUCE;
    }

    private static boolean isEqual(int player1, int player2) {
        return player1 == player2;
    }

    private static boolean hasNotStarted(int player1, int player2) {
        return player1 == 0 && player2 == 0;
    }

    private static String callAdvantage(int player1, int player2) {
        return String.format(ADVANTAGE, player1 > player2 ? "1" : "2");
    }

    private static boolean isAdvantaged(int player1, int player2) {
        return player1 > 2 && player2 > 2 && (player1 == player2 + 1 || player2 == player1 + 1);
    }

    private static String callWinner(int player1, int player2) {
        return String.format(WINNER, player1 > player2 ? "1" : "2");
    }

    private static boolean isFinished(int player1, int player2) {
        return (player1 > 3 && player1 >= player2 + 2) || (player2 > 3 && player2 >= player1 + 2);
    }

    private static String convertScore(int score) {
        switch (score) {
            case 3:
                return "forty";
            case 2:
                return "thirty";
            case 1:
                return "fifteen";
            case 0:
                return "love";
            default:
                throw new IllegalArgumentException("Don't try converting a score that doesn't need it");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the score of your two players with a space in between (ex : 4 0 if you want player 1 to have 40 to love");
            String[] scores = scanner.nextLine().split(" ");
            System.out.println(applyScore(Integer.parseInt(scores[0]), Integer.parseInt(scores[1])));
        } catch (Exception e) {
            System.err.println("You failed !");
        }
    }
}
