
/**
 * Golfer Score calculuates the score of one line of input 
 * in the method calcSingleScore. The method cumScore 
 * calculates the total score for all of the "holes"
 * entered. 
 * 
 * Ramya Nagarajan
 * 01/23/2015
 */
import java.util.*;
public class GolferScore {
    int cumPar, cumScore; 
    //parameters are filled by input values from main method
    public void calcSingleScore(int currentPar, int currentScore) {
        cumScore += currentScore; 
        cumPar += currentPar; 
        int diff = currentPar - currentScore; 
        if (diff == 2) {
            System.out.println("eagle"); 
        }
        else if (diff == 1) {
            System.out.println("birdie"); 
        }
        else if (diff == 0) {
            System.out.println("par"); 
        }
        else if (diff == (-1)) {
            System.out.println("bogey"); 
        }
        else if (diff == (-2)) {
            System.out.println("double bogey"); 
        }
        else if (diff < (-2)) {
            diff *= -1; 
            System.out.println(diff + "above par"); 
        }
        
    }
    public void totalScore() {
        int cumDiff = cumPar - cumScore; 
        if (cumDiff > 0){
            System.out.println(cumDiff +" under par"); 
        }
        else if (cumDiff == 0) {
            System.out.println("par"); 
        }
        else {
            cumDiff *= -1; 
            System.out.println(cumDiff +  " over par"); 
        }
       
    }
 
}
