public class MethodsInJava {
    public static void main(String[] args) {

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;


        calculateScore();

        calculateScoreTwo(true, 20000, 9, 300);
        //void
        calculateScoreTwo(newGameOver, newScore, newLevelCompleted, newBonus);


        newScore = 5000;
        newLevelCompleted = 6;
        newBonus = 700;
        //int
        int highScore = calculateScoreThree(newGameOver, newScore, newLevelCompleted, newBonus);
        System.out.println("The High Score : " + highScore);

        System.out.println("The High Score : " + calculateScoreThree(newGameOver, newScore, newLevelCompleted, newBonus));

    }

    public static void calculateScore() {
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        int newFinalScore = newScore;
        if (newGameOver == true) {
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println(newFinalScore);

        }
    }


    public static void calculateScoreTwo(boolean newGameOver, int newScore, int newLevelCompleted, int newBonus) {
        int newFinalScore = newScore;
        if (newGameOver == true) {
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println(newFinalScore);

        }
    }

    public static int calculateScoreThree(boolean newGameOver, int newScore, int newLevelCompleted, int newBonus) {
        int newFinalScore = newScore;
        if (newGameOver == true) {
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println(newFinalScore);

        }
        return newFinalScore;
    }
}
