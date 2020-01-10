package stormcenterv2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristiano
 */
public class CenterTest {
    
    public CenterTest() {
    }
    /**
     * Test of alreadyExists method, of class Center.
     */
    @Test
    public void testAlreadyExists() {
          
    }

    /**
     * Test of typeCheck method, of class Center.
     */
    @Test
    public void testTypeCheck() {
        
    }

    /**
     * Test of addStorm method, of class Center.
     */
    @Test
    public void testAddStorm() {
        Center c = new Center();
        assertEquals("Tornado Added", c.addStorm("Tornado", 210, 10, "Tornado"));
        assertEquals("Hurricane Added", c.addStorm("Hurricane", 310, 10, "Hurricane"));
        assertEquals("Blizzard Added", c.addStorm("Blizzard", 120, 10, "Blizzard"));
        assertEquals("Storm name already in the system", c.addStorm("Tornado", 210, 10, "Tornado"));
    }
    /**
     * Test of removeStorm method, of class Center.
     */
    @Test
    public void testRemoveStorm() {
        
    }

    /**
     * Test of editPrintWind method, of class Center.
     */
    @Test
    public void testEditPrintWind() {
        
    }

    /**
     * Test of editPrintTemp method, of class Center.
     */
    @Test
    public void testEditPrintTemp() {
        
    }

    /**
     * Test of editStorm method, of class Center.
     */
    @Test
    public void testEditStorm() {
        
    }

    /**
     * Test of searchStorm method, of class Center.
     */
    @Test
    public void testSearchStorm() {
        
    }
    
}
