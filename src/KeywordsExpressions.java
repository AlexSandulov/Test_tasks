public class KeywordsExpressions {
    public static void main (String[] args){
        boolean gameOver = true;
//        int score = 800;
//        int levelComplete = 5;
//        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater " +
//                    "than 1000");
//        } else  if (score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        int highScore = calculateScore(true, 1500, 5, 100);
        System.out.println("Your second final score was " + highScore);


        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your second final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Alex", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("DB", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Ollll", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Lexxx", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("LLC", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus){

        if (gameOver == true){
            int finalScore = score + (levelComplete * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition (String name, int positionInHighScoreTable){
        System.out.println(name + " managed to get into position " + positionInHighScoreTable +
                " on the high score table");
    }

    public static int calculateHighScorePosition (int highScore){
//        if (highScore >= 1000){
//            return 1;
//        } else if (highScore >= 500){
//            return 2;
//        } else if (highScore >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4;       // alternative
        if (highScore >= 1000){
            position = 1;
        } else if (highScore >= 500){
            position = 2;
        } else if (highScore >= 100) {
            position = 3;
        }
        return position;
    }
}
