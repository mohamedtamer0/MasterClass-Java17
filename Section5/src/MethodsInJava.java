public class MethodsInJava {
    public static void main(String[] args) {
        calculateScore();
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
}
