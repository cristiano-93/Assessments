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
public class Hurricane extends Storm
{
    public Hurricane (String nameIn, int windIn, int tempIn)
    {
        super(nameIn, windIn, tempIn);
    }
    
    private String category;
    private String advice;
    private Storm s;
    
    @Override
    public String calcClass()
    {
        int wind = getWindSpeed();
        if(wind > 74 && wind <95)
        {
            category = "Category I";            
        }
        else if(wind > 96 && wind < 110)
        {
            category = "Category II";
        }
        else if(wind > 111 && wind < 129)
        {
            category = "Category III";
        }
        else if(wind > 130 && wind < 156)
        {
            category = "Category IV";
        }
        else if(wind > 156)
        {
            category = "Category V";
        }
        else 
        {
            category = "Tropical Storm";
        }
        return category;
    }
    
    @Override
    public String getAdvice()
    {
        int wind = getWindSpeed();        
        
        if(wind <= 110)
        {
            advice = "“Close storm shutters and stay away from windows";            
        }        
        else if(wind > 111 && wind < 129)
        {
            advice = "“Coastal regions are encouraged to evacuate";
        }
        else if(wind >= 130)
        {
            advice = "Evacuate";
        }        
        return advice;
    }
}
