/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormcenterv2;

/**
 *
 * @author Cristiano
 */
public class StormCenterv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        Screen gui = new Screen();
        gui.pack();
        gui.setVisible(true);    
    }        
}

/*Notes


the test in Blizzard with 45 wind and -12 temp is not returning severe blizzard

ask Ethan why does he use the wind and temp in the assertEquals.

maybe take out the bz6 so it wont show error

*/