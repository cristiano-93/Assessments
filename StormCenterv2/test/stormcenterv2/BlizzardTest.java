package stormcenterv2;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Cristiano
 */
public class BlizzardTest {
    
    public BlizzardTest() {
    }
    
    /**
     * Test of calcClass method, of class Blizzard.
     */
    @Test
    public void testCalcClass() {
        
        //creating the objects
        
        Blizzard bz1 = new Blizzard("Blizzard",34,0);  
        Blizzard bz2 = new Blizzard("Blizzard",35,0);
        Blizzard bz3 = new Blizzard("Blizzard",35,-12); 
        Blizzard bz4 = new Blizzard("Blizzard",45,0);
        Blizzard bz5 = new Blizzard("Blizzard",45,-11); 
        Blizzard bz6 = new Blizzard("Blizzard",45,-12);
        Blizzard bz7 = new Blizzard("Blizzard",45,-13); 
        Blizzard bz8 = new Blizzard("Blizzard",44,-11);
        Blizzard bz9 = new Blizzard("Blizzard",44,-13);  
        
        //creating the test proccess
        
        assertEquals("Snow Storm", bz1.calcClass());
        assertEquals("Blizzard", bz2.calcClass());
        assertEquals("Blizzard", bz3.calcClass());
        assertEquals("Blizzard", bz4.calcClass());
        assertEquals("Blizzard", bz5.calcClass());
        assertEquals("Severe Blizzard", bz6.calcClass());  //error here. not returning severe blizzard
        assertEquals("Severe Blizzard", bz7.calcClass());
        assertEquals("Blizzard", bz8.calcClass());
        assertEquals("Blizzard", bz9.calcClass());
    }

    /**
     * Test of getAdvice method, of class Blizzard.
     */
    @Test
    public void testGetAdvice() {
        Blizzard bz1 = new Blizzard("Blizzard",34,0);  
        Blizzard bz2 = new Blizzard("Blizzard",35,0);
        Blizzard bz3 = new Blizzard("Blizzard",35,-12); 
        Blizzard bz4 = new Blizzard("Blizzard",45,0);
        Blizzard bz5 = new Blizzard("Blizzard",45,-11); 
        Blizzard bz6 = new Blizzard("Blizzard",45,-12);
        Blizzard bz7 = new Blizzard("Blizzard",45,-13); 
        Blizzard bz8 = new Blizzard("Blizzard",44,-11);
        Blizzard bz9 = new Blizzard("Blizzard",44,-13);  
        
        assertEquals("Take care and avoid travel if possible.",bz1.getAdvice());
        assertEquals("Keep warm, \nDo not travel unless absolutely essential.",bz2.getAdvice());
        assertEquals("Keep warm, \nDo not travel unless absolutely essential.",bz3.getAdvice());
        assertEquals("Keep warm, \nDo not travel unless absolutely essential.",bz4.getAdvice());
        assertEquals("Keep warm, \nDo not travel unless absolutely essential.",bz5.getAdvice());
        assertEquals("Keep warm and avoid all travel.",bz6.getAdvice());
        assertEquals("Keep warm and avoid all travel.",bz7.getAdvice());
        assertEquals("Keep warm, \nDo not travel unless absolutely essential.",bz8.getAdvice());
        assertEquals("Keep warm, \nDo not travel unless absolutely essential.",bz9.getAdvice());
        
    }
    
}
