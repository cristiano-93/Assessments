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
public abstract class Storm 
{
    protected String stormName;
    protected int windSpeed;
    protected int temp;
    
    public Storm (String nameIn, int windIn, int tempIn)
    {        
        stormName = nameIn;
        windSpeed = windIn;
        temp = tempIn;
    }
    public String getName()
    {
        return stormName;
    }   

    public void setStormName(String StormName) {
        this.stormName = StormName;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setWindSpeed(int WindSpeed) {
        this.windSpeed = WindSpeed;
    }
    public int getWindSpeed()
    {
        return windSpeed;
    }
    
    
    public abstract String calcClass();
    public abstract String getAdvice();
}
