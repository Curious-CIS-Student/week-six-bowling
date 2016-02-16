

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BowlingGameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BowlingGameTest
{
    private BowlingGame g;
    /**
     * Default constructor for test class BowlingGameTest
     */
    public BowlingGameTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        g = new BowlingGame();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    private void rollMany(int n, int pins) {
        for (int i=0;i<n;i++) {
            g.roll(pins);
        }
        
    }
    
    @Test
    public void testGutterGame()
    {
       
        rollMany(20,0);
        assertEquals(0,g.score());
    }

    @Test
    public void testAllOnes()
    {
       
        rollMany(20,1);
        assertEquals(20, g.score());
    }
}


