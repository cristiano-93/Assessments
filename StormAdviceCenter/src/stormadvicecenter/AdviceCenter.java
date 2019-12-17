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

public class AdviceCenter 
{
    // Give HashMap a try
    // give arraylist a try
    
        
    
    private Storm[] storms;    
    
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
                    String nameout = storms[i].getName();
                    int windout = storms[i].getWindSpeed();
                    int tempout = storms[i].getTemp();
                    String adviceout = storms[i].getAdvice();
                    return nameout,windout,tempout,adviceout;
                }
            }
        }
        return null;
    }
    public String edit(String nameIn, int wind, int temp) 
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
}
