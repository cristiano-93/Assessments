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
    protected String StormName;
    protected int WindSpeed;
    
    public Storm (String nameIn, int windIn)
    {
        StormName = nameIn;
        WindSpeed = windIn;
    }
    public String getName()
    {
        return StormName;
    }
    public int getWindSpeed()
    {
        return WindSpeed;
    }
    public abstract String calcClass();
    public abstract String getAdvice();
}
