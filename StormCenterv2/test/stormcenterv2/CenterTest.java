/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormcenterv2;

import java.util.ArrayList;
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
     * Test of getStormList method, of class Center.
     */
    @Test
    public void testGetStormList() {
        System.out.println("getStormList");
        Center instance = new Center();
        ArrayList<Storm> expResult = null;
        ArrayList<Storm> result = instance.getStormList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alreadyExists method, of class Center.
     */
    @Test
    public void testAlreadyExists() {
        System.out.println("alreadyExists");
        String nameIn = "";
        Center instance = new Center();
        boolean expResult = false;
        boolean result = instance.alreadyExists(nameIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of typeCheck method, of class Center.
     */
    @Test
    public void testTypeCheck() {
        System.out.println("typeCheck");
        String typeIn = "";
        Center instance = new Center();
        int expResult = 0;
        int result = instance.typeCheck(typeIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStorm method, of class Center.
     */
    @Test
    public void testAddStorm() {
        System.out.println("addStorm");
        String nameIn = "";
        int windIn = 0;
        int tempIn = 0;
        String typeIn = "";
        Center instance = new Center();
        String expResult = "";
        String result = instance.addStorm(nameIn, windIn, tempIn, typeIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of output method, of class Center.
     */
    @Test
    public void testOutput() {
        System.out.println("output");
        String nameIn = "";
        Center instance = new Center();
        String expResult = "";
        String result = instance.output(nameIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStorm method, of class Center.
     */
    @Test
    public void testRemoveStorm() {
        System.out.println("removeStorm");
        String nameIn = "";
        Center instance = new Center();
        boolean expResult = false;
        boolean result = instance.removeStorm(nameIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPrintWind method, of class Center.
     */
    @Test
    public void testEditPrintWind() {
        System.out.println("editPrintWind");
        String nameIn = "";
        Center instance = new Center();
        String expResult = "";
        String result = instance.editPrintWind(nameIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPrintTemp method, of class Center.
     */
    @Test
    public void testEditPrintTemp() {
        System.out.println("editPrintTemp");
        String nameIn = "";
        Center instance = new Center();
        String expResult = "";
        String result = instance.editPrintTemp(nameIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editStorm method, of class Center.
     */
    @Test
    public void testEditStorm() {
        System.out.println("editStorm");
        String nameIn = "";
        int windIn = 0;
        int tempIn = 0;
        Center instance = new Center();
        String expResult = "";
        String result = instance.editStorm(nameIn, windIn, tempIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchStorm method, of class Center.
     */
    @Test
    public void testSearchStorm() {
        System.out.println("searchStorm");
        String nameIn = "";
        Center instance = new Center();
        String expResult = "";
        String result = instance.searchStorm(nameIn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
