public class Challenge {

public static void main(String[] args) {


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into postition " 
        + highScorePosition + " on the high score table");
    

    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Tim", highScorePosition);

    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("bob", highScorePosition);

    highScorePosition = calculateHighScorePosition(200);
    displayHighScorePosition("Jon", highScorePosition);


    public static int calculateHighScorePosition(int playerScore) {

        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 1000 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}





    }
}