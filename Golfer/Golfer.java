
/**
 * Golfer class only has a main method which 
 * creates an instance of the GolferScore class 
 * and uses method from that class. 
 * Ramya Nagarajan
 * 01/23/2015
 */
import java.util.*; 
public class Golfer {
    public static void main(String [] args) {
    GolferScore scoreCard = new GolferScore(); 
    Scanner input = new Scanner(System.in); 
        for (int i = 0; i < 4; i++) {
            //below line used to make terminal appear and guide user
            System.out.println("enter numbers "); 
            int mainCurrentPar = input.nextInt(); 
            int mainCurrentScore = input.nextInt(); 
            scoreCard.calcSingleScore(mainCurrentPar, mainCurrentScore); 
        }
        scoreCard.totalScore(); 
    }
}
