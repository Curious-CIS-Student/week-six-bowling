
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

/**
 * The test class BowlingGameTest. This class uses materials provided
 * by Dr. Neumann for the week-six-bowling assignment.
 *
 * @author  Isaac Blasiman
 * @version 3.6.2016
 */
public class BowlingGameTest extends TestCase 
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
    
    @Test
    public void testOneSpare() {
        rollSpare();
        g.roll(3);
        rollMany(17,0);
        assertEquals(16, g.score());
    }
    
    @Test
    public void testOneStrike() {
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertEquals(24, g.score());
    }
    
    @Test
    public void testPerfectGame() {
        rollMany(12, 10);
        assertEquals(300, g.score());
    }
    
    @Test
    public void testGameWith176() {
        g.roll(9);
        g.roll(1);
        g.roll(0);
        rollStrike();
        rollStrike();
        rollStrike();
        g.roll(6);
        g.roll(2);
        g.roll(7);
        g.roll(3);
        g.roll(8);
        g.roll(2);
        rollStrike();
        g.roll(9);
        g.roll(0);
        rollStrike();
        rollStrike();
        g.roll(8);
        assertEquals(176, g.score());
    }
    
    @Test
    public void testGameWith82() {
        g.roll(9);
        g.roll(0);
        g.roll(3);
        g.roll(5);
        g.roll(6);
        g.roll(1);
        g.roll(3);
        g.roll(6);
        g.roll(8);
        g.roll(1);
        g.roll(5);
        g.roll(3);
        g.roll(2);
        g.roll(5);
        g.roll(8);
        g.roll(0);
        g.roll(7);
        g.roll(1);
        g.roll(8);
        g.roll(1);
        assertEquals(82, g.score());        
    }
    
    @Test
    public void testAllZeros() {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }
    
    @Test
    public void testAllTwos() {
        rollMany(20, 2);
        assertEquals(42, g.score());
    }
    
    @Test
    public void testGameWith193() {
        rollStrike();
        g.roll(3);
        g.roll(7);
        g.roll(6);
        g.roll(1);
        rollStrike();
        rollStrike();
        rollStrike();
        g.roll(2);
        g.roll(8);
        g.roll(9);
        g.roll(0);
        g.roll(7);
        g.roll(3);
        rollStrike();
        rollStrike();
        rollStrike();
        assertEquals(193, g.score());
    }
    
    private void rollStrike() {
        g.roll(10);
    }
    
    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }
    
}


