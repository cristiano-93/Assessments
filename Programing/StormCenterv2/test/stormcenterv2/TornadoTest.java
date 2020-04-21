package stormcenterv2;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Cristiano
 */
public class TornadoTest {
    
    public TornadoTest() {
    }
    /**
     * Test of calcClass method, of class Tornado.
     */
    @Test
    public void testCalcClass() {
        
        //Creating objects
        
        Tornado t1 = new Tornado("",39,18);
        Tornado t2 = new Tornado("",40,18);
        Tornado t3 = new Tornado("",72,18);
        Tornado t4 = new Tornado("",73,18);
        Tornado t5 = new Tornado("",112,18);
        Tornado t6 = new Tornado("",113,18);
        Tornado t7 = new Tornado("",157,18);
        Tornado t8 = new Tornado("",158,18);
        Tornado t9 = new Tornado("",205,18);
        Tornado t10 = new Tornado("",206,18);
        Tornado t11 = new Tornado("",260,18);
        Tornado t12 = new Tornado("",261,18);
        Tornado t13 = new Tornado("",262,18);
        
        //creating the test proccess
        
        assertEquals("Unclassified", t1.calcClass());
        assertEquals("F0", t2.calcClass());
        assertEquals("F0", t3.calcClass());
        assertEquals("F1", t4.calcClass());
        assertEquals("F1", t5.calcClass());
        assertEquals("F2", t6.calcClass());
        assertEquals("F2", t7.calcClass());
        assertEquals("F3", t8.calcClass());
        assertEquals("F3", t9.calcClass());
        assertEquals("F4", t10.calcClass());
        assertEquals("F4", t11.calcClass());
        assertEquals("F5", t12.calcClass());
        assertEquals("F5", t13.calcClass());
                
    }

    /**
     * Test of getAdvice method, of class Tornado.
     */
    @Test
    public void testGetAdvice() {
        
                //Creating objects
        
        Tornado t1 = new Tornado("",39,18);
        Tornado t2 = new Tornado("",40,18);
        Tornado t3 = new Tornado("",72,18);
        Tornado t4 = new Tornado("",73,18);
        Tornado t5 = new Tornado("",112,18);
        Tornado t6 = new Tornado("",113,18);
        Tornado t7 = new Tornado("",157,18);
        Tornado t8 = new Tornado("",158,18);
        Tornado t9 = new Tornado("",205,18);
        Tornado t10 = new Tornado("",206,18);
        Tornado t11 = new Tornado("",260,18);
        Tornado t12 = new Tornado("",261,18);
        Tornado t13 = new Tornado("",262,18);
        
        //creating the test proccess
        
        assertEquals("There is no need to panic", t1.getAdvice());
        assertEquals("Find safe room/shelter, shield yourself from debris", t2.getAdvice());
        assertEquals("Find safe room/shelter, shield yourself from debris", t3.getAdvice());
        assertEquals("Find safe room/shelter, shield yourself from debris", t4.getAdvice());
        assertEquals("Find safe room/shelter, shield yourself from debris", t5.getAdvice());
        assertEquals("Find underground shelter, \ncrouch near to the floor covering your head with your hands", t6.getAdvice());
        assertEquals("Find underground shelter, \ncrouch near to the floor covering your head with your hands", t7.getAdvice());
        assertEquals("Find underground shelter, \ncrouch near to the floor covering your head with your hands", t8.getAdvice());
        assertEquals("Find underground shelter, \ncrouch near to the floor covering your head with your hands", t9.getAdvice());
        assertEquals("Find underground shelter, \ncrouch near to the floor covering your head with your hands", t10.getAdvice());
        assertEquals("Find underground shelter, \ncrouch near to the floor covering your head with your hands", t11.getAdvice());
        assertEquals("Find underground shelter, \ncrouch near to the floor covering your head with your hands", t12.getAdvice());
        assertEquals("Find underground shelter, \ncrouch near to the floor covering your head with your hands", t13.getAdvice());
        
    }
    
}
