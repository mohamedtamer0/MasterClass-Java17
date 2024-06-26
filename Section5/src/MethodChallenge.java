public class MethodChallenge {
    public static void main(String[] args) {

        int highScore = calcHighScorePosition(1500);
        displayHighScorePosition("Tamer", highScore);

        highScore = calcHighScorePosition(1000);
        displayHighScorePosition("Mohamed", highScore);

        highScore = calcHighScorePosition(500);
        displayHighScorePosition("Alwqar", highScore);

        highScore = calcHighScorePosition(500);
        displayHighScorePosition("Osama", highScore);

        highScore = calcHighScorePosition(25);
        displayHighScorePosition("Eren", highScore);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " manged to get into position " +
                highScorePosition + " on the high score list");
    }

    public static int calcHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
