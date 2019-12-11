/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormadvicecenter;

import java.util.ArrayList;


/**
 *
 * @author Cristiano
 */

public class AdviceCenter 
{
    // Give HashMap a try
    // give arraylist a try
    
        
    
    private Storm[] storms;
    private Storm s;
    
    public AdviceCenter()
    {
        storms = new Storm[20];
    }
    
    public boolean addStorm(Storm stormIn)
    {
        for(int i=0; i<storms.length; i++)
            {
                if(storms[i] == null)
                {
                    storms[i] = stormIn;
                    return true;
                }
            }
        return false;
    }
    public boolean removeStorm(String nameIn)
    {
        for(int i=0; i<storms.length; i++)
        {
            if(storms[i] != null)
            {
                if(storms[i].getName().equals(nameIn))
                {
                    storms[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    public String search(String nameIn)
    {        
        for(int i=0; i<storms.length; i++)
        {
            if(storms[i] != null)
            {
                if(storms[i].getName().equals(nameIn))
                {
                    return "<html>Storm Name: "+storms[i].getName() +"<BR> Wind Speed: "+
                            storms[i].getWindSpeed() +"<BR>Temperature: "+ storms[i].getTemp()+"</html>";
                }
            }
        }
        return null;
    }
    public String edit(String nameIn, int wind, int temp) //should i have a seperate string to change the name
    {
        for(int i=0; i<storms.length; i++)
        {
            if(storms[i] != null)
            {
                if(storms[i].getName().equals(nameIn))
                {                    
                    storms[i].setWindSpeed(wind);
                    storms[i].setTemp(temp);
                }
            }
        }    
        return null;
    }
    public String display()
    {
        for(int i=0; i<storms.length; i++)
        {
            if(storms[i]==null)
            {
                return "There are no stored Storms";
            }
            return "<html>"+storms[i].getName() +"<BR>"+ storms[i].getWindSpeed() 
                    +"<BR>"+ storms[i].getTemp()+"<BR>"+s.getAdvice()+"</html>";
            
        }
        return null;        
    }

    
}
