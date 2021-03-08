package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("highScore = " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("highScore = " + highScore);

        /*
         Create a method called displayHighScorePosition !void method doesn't return data! procedure!
         it should receive a players name as a parameter, and a 2nd parameter as a position in the high score table
         You should display the players name along with a message like " managed to get into position " and the
         position they got and a further message " on the high score table".

         Create a 2nd method called calculateHighScorePosition !method referred to as a function!
         it should be sent one argument only, the player score
         it should return an int
         the return data should be
         1 if the score is >1000
         2 if the score is >500 and < 1000
         3 if the score is >100 and < 500
         4 in all other cases
         call both methods and display the results of the following
         a score of 1500, 900, 400, and 50
        */

        int highScorePosition = calculatedHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculatedHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculatedHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculatedHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculatedHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore >= 100 && playerScore < 500) {
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

//    public static void displayHighScorePosition(String playerName, int position) {
//        String displayName = playerName;
//        System.out.println("displayName = " + displayName);
//        int displayPosition = position;
//        System.out.println("displayPosition = " + displayPosition);
//
//        calculateHighScorePosition(1500);
//        displayHighScorePosition("Peter", calculateHighScorePosition(1500));
//    }
//
//    public static  int calculateHighScorePosition(int playerScore) {
//        if (playerScore > 1000) {
//            return 1;
//        } else if (playerScore > 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore > 100 && playerScore < 500) {
//            return 3;
//        }
//        return 4;
//    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
