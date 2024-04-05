public class MethodOverloading {
    public static void main(String[] args) {

        int newScore = calcScore("Tamer", 500);
        System.out.println("New Score Is " + newScore);

        calcScore(75);
    }

    public static int calcScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored " + score + " points");
        return score * 1000;
    }


    public static int calcScore(int score) {
        System.out.println("Unnamed Player Scored " + score + " points");
        return score * 1000;
    }

}
