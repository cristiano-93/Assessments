/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormcenterv2;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristiano
 */
public class HurricaneTest {
    
    public HurricaneTest() {
    }
        
    /**
     * Test of calcClass method, of class Hurricane.
     */
    @Test
    public void testCalcClass() {
        
        // creating the objects
        
        Hurricane hu1 = new Hurricane("Hurricane",73,15);  
        Hurricane hu2 = new Hurricane("Hurricane",74,15);
        Hurricane hu3 = new Hurricane("Hurricane",95,15);
        Hurricane hu4 = new Hurricane("Hurricane",96,15);   
        Hurricane hu5 = new Hurricane("Hurricane",110,15);   
        Hurricane hu6 = new Hurricane("Hurricane",111,15);   
        Hurricane hu7 = new Hurricane("Hurricane",129,15);   
        Hurricane hu8 = new Hurricane("Hurricane",130,15);   
        Hurricane hu9 = new Hurricane("Hurricane",156,15);   
        Hurricane hu10 = new Hurricane("Hurricane",157,15);   
        
        //creating the test proccess      
        
        assertEquals("Tropical Storm", hu1.calcClass());
        assertEquals("Category I", hu2.calcClass());
        assertEquals("Category I", hu3.calcClass());
        assertEquals("Category II", hu4.calcClass());
        assertEquals("Category II", hu5.calcClass());
        assertEquals("Category III", hu6.calcClass());
        assertEquals("Category III", hu7.calcClass());
        assertEquals("Category IV", hu8.calcClass());
        assertEquals("Category IV", hu9.calcClass());
        assertEquals("Category V", hu10.calcClass());
    }

    /**
     * Test of getAdvice method, of class Hurricane.
     */
    @Test
    public void testGetAdvice() {
        
                // creating the objects
                
        Hurricane hu1 = new Hurricane("Hurricane",73,15);  
        Hurricane hu2 = new Hurricane("Hurricane",74,15);
        Hurricane hu3 = new Hurricane("Hurricane",95,15);
        Hurricane hu4 = new Hurricane("Hurricane",96,15);   
        Hurricane hu5 = new Hurricane("Hurricane",110,15);   
        Hurricane hu6 = new Hurricane("Hurricane",111,15);   
        Hurricane hu7 = new Hurricane("Hurricane",129,15);   
        Hurricane hu8 = new Hurricane("Hurricane",130,15);   
        Hurricane hu9 = new Hurricane("Hurricane",156,15);   
        Hurricane hu10 = new Hurricane("Hurricane",157,15);
        
        //creating the test proccess
        
        assertEquals("Close storm shutters and stay away from windows", hu1.getAdvice());
        assertEquals("Close storm shutters and stay away from windows", hu2.getAdvice());
        assertEquals("Close storm shutters and stay away from windows", hu3.getAdvice());
        assertEquals("Close storm shutters and stay away from windows", hu4.getAdvice());
        assertEquals("Close storm shutters and stay away from windows", hu5.getAdvice());
        assertEquals("Coastal regions are encouraged to evacuate", hu6.getAdvice());
        assertEquals("Coastal regions are encouraged to evacuate", hu7.getAdvice());
        assertEquals("Evacuate", hu8.getAdvice());
        assertEquals("Evacuate", hu9.getAdvice());
        assertEquals("Evacuate", hu10.getAdvice());
        
    }
    
}
