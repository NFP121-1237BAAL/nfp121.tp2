package question2;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import question1.PileVideException;
import question1.PilePleineException;
/**
 * The test class Pile3Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Pile3Test
{private Pile3 monPile3;
    /**
     * Default constructor for test class Pile3Test
     */
    public Pile3Test()
    {monPile3=new Pile3(7);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() throws PilePleineException
    {monPile3.empiler("Bonjour");
     monPile3.empiler("les");
     monPile3.empiler("auditeurs");
     monPile3.empiler(".");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {monPile3=null;
    }
    public void test_monPile3() throws PileVideException,PilePleineException
{
    assertEquals(7,monPile3.taille());
    assertEquals(4,monPile3.capacite());
    assertEquals("[Bonjour, les, auditeur, .]",monPile3.toString());
    assertEquals(".",monPile3.sommet());
    assertEquals(7,monPile3.depiler());
    monPile3.empiler("bye");
    assertEquals(5,monPile3.capacite());
}
}
