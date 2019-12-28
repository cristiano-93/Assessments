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

add function fixed by checking the size in each seperate if statement
check that the advice beeing printed doesnt have extra characters or is missing something

the edit function is working but the buttons are not going away after adding



*/