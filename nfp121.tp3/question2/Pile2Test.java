package question2;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import question1.PileVideException;
import question1.PilePleineException;
/**
 * The test class Pile2Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Pile2Test
{ private Pile2 monPile2 ;
    /**
     * Default constructor for test class Pile2Test
     */
    public Pile2Test()
    {
        monPile2 = new Pile2(4);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() throws PilePleineException
    {monPile2.empiler("Bonjour");
     monPile2.empiler("Bonsoir");
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
    public void test_monPile2() throws PileVideException
{assertEquals(4,monPile2.taille());
 assertEquals("Bonsoir",monPile2.sommet());
 assertEquals(2,monPile2.capacite());
 assertEquals("[Bonjour, Bnosoir]",monPile2.toString());
 assertEquals("Bonsoir",monPile2.depiler());   

}
}
