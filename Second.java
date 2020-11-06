public class Second {

    public static void main(String[] args) {
        //code goes in here

        boolean gameOver = true;
        int score = 60;
        int levelCompleted = 5;
        int bonus = 50;

        if(score < 50) {
            System.out.println("This is less than 50");
        } else {
            System.out.println("This is more than 50");
        }

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

    }
}