package stormcenterv2;

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
    
    private String classification;
    private String advice;
    
    @Override
    public String calcClass()
    {
        int wind = getWindSpeed();
        if(wind >= 74 && wind <=95)
        {
            classification = "Category I";            
        }
        else if(wind >= 96 && wind <= 110)
        {
            classification = "Category II";
        }
        else if(wind >= 111 && wind <= 129)
        {
            classification = "Category III";
        }
        else if(wind >= 130 && wind <= 156)
        {
            classification = "Category IV";
        }
        else if(wind > 156)
        {
            classification = "Category V";
        }
        else 
        {
            classification = "Tropical Storm";
        }
        return classification;
    }
    
    @Override
    public String getAdvice()
    {
        int wind = getWindSpeed();        
        
        if(wind <= 110)
        {
            advice = "Close storm shutters and stay away from windows";            
        }        
        else if(wind >= 111 && wind <= 129)
        {
            advice = "Coastal regions are encouraged to evacuate";
        }
        else if(wind >= 130)
        {
            advice = "Evacuate";
        }        
        return advice;
    }
}
