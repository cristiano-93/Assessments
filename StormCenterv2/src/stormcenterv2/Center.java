/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormcenterv2;

import java.util.ArrayList;

/**
 *
 * @author Cristiano
 */
public class Center 
{
    private ArrayList<Storm> storms = new ArrayList<>();
    private Storm s;
    
    public ArrayList<Storm> getStormList()
    {
        return storms;
    }
    public boolean sizeCheck()
    {
        if(storms.size()>= 20)
        {
            return false;
        }
        return true;
    }
    public int typeCheck(String typeIn)
    {
        if(typeIn.equals("Hurricane")){             //turn if's into Switch cases
            return 1;
        }
        else if(typeIn.equals("Tornado")){
            return 2;
        }
        else if (typeIn.equals("Blizzard")){
            return 3;
        }
        else{
            return 0;
        }
    }    
    public void addStorm(String nameIn, int windIn, int tempIn,String typeIn)
    {
        Hurricane hurricane = new Hurricane(nameIn, windIn, tempIn);
        Tornado tornado = new Tornado(nameIn, windIn, tempIn);
        Blizzard blizzard = new Blizzard(nameIn, windIn, tempIn);
        
        switch (typeCheck(typeIn)) {
            case 1:            
                storms.add(hurricane);
                break;
            case 2:
                storms.add(tornado);
                break;
            case 3:
                storms.add(blizzard);
                break;
            default:
                break;
        }
    }    
    public String addStormCheck (String nameIn, int windIn, int tempIn, String typeIn)
    {
        if(sizeCheck())
        {
            if(typeCheck(typeIn)!=0)
            {
                addStorm(nameIn, windIn, tempIn, typeIn);
                return "Storm Added";
            }
            return "random text";       //this might not be needed
        }
        return "<html>Storm System is operating at full capacity<BR>"
                            + "Unable to add any more storms to the system</html>";
    }       
    public boolean removeStorm(String nameIn)
    {
        for (int i = 0; i < storms.size(); i++)
        {
            if(storms.get(i).stormName.equals(nameIn))
            {
                storms.remove(i);           //will this work or do i need to assign a index
                return true;
            }
        }
        return false;
    }
    public int printWind(String nameIn)
    {
        for (int i = 0; i < storms.size(); i++)
        {
            if(storms.get(i).stormName.equals(nameIn))
            {
                int windOut = storms.get(i).getWindSpeed();
                return windOut;
            }
        }    
        return 0;
    }
    public int printTemp(String nameIn)
    {
        for (int i = 0; i < storms.size(); i++)
        {
            if(storms.get(i).stormName.equals(nameIn))
            {                
                int tempOut = storms.get(i).getTemp();
                return tempOut;
            }
        }    
        return 0;
    }
    public String editStorm(String nameIn, int windIn, int tempIn)  // should be ready
    {
        //get details to the textfield
        
        for (int i = 0; i < storms.size(); i++)
        {
            if(storms.get(i).stormName.equals(nameIn))
            {
                storms.get(i).setWindSpeed(windIn);
                storms.get(i).setTemp(tempIn);
                return "Storm has been Edited";
            }
            return "Storm not found";
        }        
        return null;
    }
    public String searchStorm(String nameIn)                        // should be ready
    {
        for (int i = 0; i < storms.size(); i++)
        {
            if(storms.get(i).stormName.equals(nameIn))
            {
                String output = "Storm Name: "+storms.get(i).getName()
                        +"\nWind Speed: "+storms.get(i).getWindSpeed()
                        +"\nTemperature: "+storms.get(i).getTemp()
                        +"\nClassification: "+storms.get(i).calcClass()
                        +"\n"+storms.get(i).getAdvice();
                return output;
            }   // do i need a else statement?????
        }
        return "Storm not found";
    }
}
