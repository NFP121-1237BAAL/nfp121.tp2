package question2;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Pile1Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Pile1Test
    { private Pile1 monPile1;
      private Pile1 monPile2;
    /**
     * Default constructor for test class Pile1Test
     */
    public Pile1Test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {monPile2=new Pile1(5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {monPile2=null;
    }
    public void test_monPile(){
        monPile1=new Pile1(5);
        assertFalse(monPile1.estPleine());
        assertTrue(monPile1.estVide());
        assertEquals(5, monPile1.taille());
        assertEquals(0, monPile1.capacite());
        assertTrue(monPile1.equals(monPile2));
        
        
    }
}
