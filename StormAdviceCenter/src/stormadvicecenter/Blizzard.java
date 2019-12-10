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
public class Blizzard extends Storm
{    
    public Blizzard (String nameIn, int windIn, int tempIn)
    {
        super(nameIn, windIn);
        tempIn = temp;
    }
    public int getTemp()
    {
        return temp;
    }
    
    private String classification;

    public void setTemp(int temp) {
        this.temp = temp;
    }
    int wind = getWindSpeed();
    private int temp;
    private String advice;// should i be be incorporating the advice with the classification calc or do it seperatly
    
    @Override
    public String calcClass()
    {
        int wind = getWindSpeed();
        
        if(wind >= 35)
        {
            if(wind >= 45 && temp <= -12)
            {
                classification = "Severe Blizzard";                
            }
            classification = "Blizzard";             
        }        
        else if(wind <= 35)
        {
            classification = "Snow Storm";            
        }
        return classification;        
    }
    
    @Override
    public String getAdvice()
    {
        int wind = getWindSpeed();
        int temp = getTemp();
        
        if(wind >= 35)
        {
            if(wind >= 45 && temp <= -12)
            {
                advice = "Keep warm, Do not travel unless absolutely essential.";
            }
            advice = "Keep warm and avoid all travel.";
        }
        else if (wind <= 35)
        {
            advice = "Take care and avoid travel if possible.";
        }
        return advice;
    }
    
}
