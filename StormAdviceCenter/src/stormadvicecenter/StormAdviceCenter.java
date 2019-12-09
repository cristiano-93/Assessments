/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormadvicecenter;

/**
 *
 * @author Cristiano
 */
public class StormAdviceCenter 
{
    public static void main(String[] args) 
    {
        Screen gui = new Screen();
        gui.pack();
        gui.setVisible(true);
        
        Storm[] storms = new Storm [20];
        
        for (int i=0; i<storms.length;i++)
        {
            System.out.println(storms[i].getName());
        }
    }
    
    
    
    
}
