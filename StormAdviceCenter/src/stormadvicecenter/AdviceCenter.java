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
    public boolean removeStorm(Storm stormIn)
    {
        for(int i=0; i<storms.length; i++)
        {
            if(storms[i] != null)
            {
                if(storms[i].getName().equals(stormIn))
                {
                    storms[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
}
