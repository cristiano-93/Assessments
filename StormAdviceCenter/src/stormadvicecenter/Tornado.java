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
public class Tornado extends Storm
{
    public Tornado (String nameIn, int windIn)
    {
        super(nameIn, windIn);
    }
    
    private String classification;
    private String advice;
    
    @Override
    public String calcClass()
    {
        int wind = getWindSpeed();
        
        if(wind > 40 && wind <72)
        {
            classification = "F0";            
        }
        else if(wind > 73 && wind < 112)
        {
            classification = "F1";
        }
        else if(wind > 113 && wind < 157)
        {
            classification = "F2";
        }
        else if(wind > 158 && wind < 205)
        {
            classification = "F3";
        }
        else if(wind > 206 && wind < 260)
        {
            classification = "F4";
        }
        else if(wind > 261)
        {
            classification = "F5";
        }
        else 
        {
            classification = "Unclassified";
        }
        return classification;
    }
    
    @Override
    public String getAdvice()
    {
        int wind = getWindSpeed();        
        
        if(wind >= 40 && wind <= 112)
        {
            advice = "Find safe room/shelter, shield yourself from debris";
        }
        else if (wind >= 113)
        {
            advice = "Find underground shelter, crouch near to the floor covering your head with your hands";
        }
        else
        {
            advice = "There is no need to panic";
        }
        return advice;
    }
    
    
}
