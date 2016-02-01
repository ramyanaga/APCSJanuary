
/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ASCLland {
    public static void main(String[] args) {
        //Test Line: 3,5,1,8,2,7,0
        Player PlayerA = new Player(); 
        Player PlayerB = new Player(); 
        System.out.println("Input test line: "); 
        Scanner userInput = new Scanner(System.in); 
        String dieNumbs = userInput.nextLine(); 
        int playerCounter = 0; 
        for (int i = 0; i <= dieNumbs.length(); i+=2) {
            String dieNumb = dieNumbs.substring(i,i+1); 
            if (playerCounter % 2 == 0) {
               PlayerA.movePosition(dieNumb, PlayerB); 
            }
            else {
                PlayerB.movePosition(dieNumb, PlayerA); 
            }
            //if (checkEndGame(PlayerA, PlayerB) == true) {
            if ((PlayerA.getPosition() >= 40) || (PlayerB.getPosition()>=40)) {
               System.out.println("A-"+PlayerA.finalPosition()+" B-"+PlayerB.finalPosition()); 
               break; 
            }
            playerCounter++; 
          
        }
        System.out.println("A-"+PlayerA.finalPosition()+" B-"+PlayerB.finalPosition()); 
    }   
}
