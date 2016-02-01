
/**
 * Write a description of class PositionTracker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player {
    private int dieNumb; 
    private int position;
    
    public void Player() {
        this.dieNumb = 0; 
        this.position = 0; 
    } 
    public int getPosition() {
        return this.position; 
    }
    public void setPosition(int newPosition) {
        this.position = newPosition; 
    }
   public void movePosition(String dieNumbStr, Player other) {
       int dieNumb = Integer.parseInt(dieNumbStr); 
       if ((dieNumb == 4) || (dieNumb == 6)) {
           if (this.position-dieNumb < 0) {
               this.position = 0; 
           }
           else {
               this.position-=dieNumb; 
            }
        }
       else {
           this.position+=dieNumb; 
        }
       if (this.position == other.getPosition()) {
           other.setPosition(0); 
       }
    }
    public String finalPosition() {
        if (this.getPosition() >= 40) {
            return "END";
        }
        else {
            return Integer.toString(this.getPosition()); 
        }
    }
}
