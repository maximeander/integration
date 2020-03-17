package integration;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 

/**
 * 
 */

 

/**
 * @author test
 *
 */
class CalculsTest {

 

    private Calculs c = null;
    private Calculs c2 = null;
    private Calculs c3 = null;
    
    /**
     * Initialise les valeurs avant chaque test 
     */
    @BeforeEach
    void setUp() throws Exception 
    {
        c = new Calculs(1,2);
        c2 = new Calculs(10,20);
        c3 = new Calculs(100,200);
    }

 

    
    /**
     * Test method for {@link Calculs#Calculs(int, int)}.
     */
    @Test
    void testCalculs() {

 

        fail("Not yet implemented");
    }

 

    /**
     * Test method for {@link Calculs#multiplier()}.
     */
    @Test
    void testMultiplier() 
    {
    
        
        
        if (c.multiplier() != 2)
        {
            fail("Methode multiplier non conforme; 1*2 ne fonctionne pas.");
        }
        
        assertEquals(c.multiplier(), 2);
    }

 

    /**
     * Test method for {@link Calculs#additionner()}.
     */
    @Test
    void testAdditionner() {
        fail("Not yet implemented");
    }

 

    /**
     * Test method for {@link Calculs#diviser()}.
     */
    @Test
    void testDiviser() {
        fail("Not yet implemented");
    }

 

    /**
     * Test method for {@link Calculs#soustraire()}.
     */
    @Test
    void testSoustraire() {
        fail("Not yet implemented");
    }

 

}