package question2;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import question1.PileVideException;
import question1.PilePleineException;
/**
 * The test class Pile4Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Pile4Test
{private Pile4 monPile4;
 private Pile4 monPile4_2;
    /**
     * Default constructor for test class Pile4Test
     */
    public Pile4Test()
    {monPile4 = new Pile4();
     monPile4_2= new Pile4(6);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() throws PilePleineException
    {monPile4.empiler("1");
     monPile4.empiler(2);
     monPile4.empiler(3);
     monPile4_2.empiler("1");
     monPile4_2.empiler(2);
     monPile4_2.empiler(3);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {monPile4=null;
    }
    public void test_monPile4() throws PilePleineException,PileVideException{
     assertEquals(6,monPile4.taille());   
     assertEquals(3,monPile4.capacite()); 
     assertTrue(monPile4.equals(monPile4_2));
     assertEquals(monPile4.hashCode(),monPile4_2.hashCode());
     monPile4.depiler();
     assertEquals(4,monPile4.capacite());
     assertFalse(monPile4.equals(monPile4_2));
     assertEquals("[1, 2, 3]",monPile4.toString());
     
    }

}
