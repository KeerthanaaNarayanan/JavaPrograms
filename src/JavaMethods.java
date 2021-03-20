//public class JavaMethods {
//    public static void main(String[] args){
//        System.out.println(calculateScore(true, 34, 4));
//    }
//    public static boolean calculateScore(boolean game, int score, int level){
//        System.out.println("I am called, I am calculate Score method");
//        System.out.println(game);
//        System.out.println(score);
//        System.out.println(level);
//        return true;
//    }
//}

// Create a method called displayHighScorePosition
// it should a players name as a parameter, and a 2nd parameter as a position in the high score table
// you should display the players name along with a message like "managed to get into position " and the position they got and a further message " on the high score table".

// create a 2nd method called calculateHighScorePosition
// it should be sent one argument only, the player score
// it should return an int
//the return data should be
//1 if the score is > 1000
//2 if the score is >500 and <1000
//3 if the score is > 100 and <500
//4 in all the other cases
//call both methods and display the results of the following
//a score of 1500, 900, 400, and 50
//

public class JavaMethods {
    public static void main(String[] args){
        int position1 = calculateHighScorePosition(1500);
        int position2 = calculateHighScorePosition(900);
        int position3 = calculateHighScorePosition(400);
        int position4 = calculateHighScorePosition(50);

        displayHighScorePosition("Tim", position1);
        displayHighScorePosition("Creuese", position2);
        displayHighScorePosition("George", position3);
        displayHighScorePosition("Hamber", position4);

    }
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int score){
        int a = 4;
        if(score >= 1000)
            a = 1;
        else if(score >= 500)
            a = 2;
        else if(score >= 100)
            a = 3;

        return a;
    }
}
