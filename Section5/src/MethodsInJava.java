public class MethodsInJava {
    public static void main(String[] args) {

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;


        calculateScore();
        calculateScoreTwo(true, 20000, 9, 300);
        calculateScoreTwo(newGameOver,newScore,newLevelCompleted,newBonus);

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
}
