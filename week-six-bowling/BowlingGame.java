
/**
 * Write a description of class BowlingGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BowlingGame
{
    private int score = 0;
    /**
     * Constructor for objects of class BowlingGame
     */
    public BowlingGame()
    {
    }
public void roll(int pins) {
    score += pins;
}

public int score() {
    return score;
}
   
}
