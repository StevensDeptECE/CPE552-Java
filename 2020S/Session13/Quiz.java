import java.io.Serializable;

/**
 *
 * @author dkruger
 */
public class Quiz implements java.io.Serializable {
    private boolean shuffleAnswers;
    private int timeLimit;
    private Date open;
    private int dueDate;   // can never be negative
    private int closeDate; // can never be negative
    
    public boolean getShuffleAnswers() {
        return shuffleAnswers;
    }
    public void setShuffleAnswers(boolean s) {
        shuffleAnswers = s;
    }
    public int getTimeLimit() { return timeLimit; }// in seconds
    public void setTimeLimit(int t) { // in seconds
        timeLimit = t;
    }
    public void setOpenDate(Date d) {
        open = d;
    }
    public Date getOpenDate() {
        return open;
    }
    public void setDueDate(int relativeDays) {
        dueDate = relativeDays;
    }
    public int getDueDate() {
        return dueDate;
    }
        
}
