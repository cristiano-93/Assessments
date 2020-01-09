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
    
    public ArrayList<Storm> getStormList()
    {
        return storms;
    }
    public boolean alreadyExists(String nameIn)
    {
        for (int i = 0; i < storms.size(); i++)
        {
            if(storms.get(i).getName().equals(nameIn))
            {
                return false;
            }
            
        }return true;
    }
    public int typeCheck(String typeIn)
    {
        if(typeIn.equals("Hurricane")){
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
    public String addStorm (String nameIn, int windIn, int tempIn, String typeIn)
    {
        String result = "Storm name already in the system";
      
        if(typeCheck(typeIn)==1)
        {
            if(storms.size()<20)
            {
                if(alreadyExists(nameIn))
                {
                    Hurricane hurricane = new Hurricane(nameIn, windIn, tempIn);
                    storms.add(hurricane);
                    result = "Hurricane Added";
                    return result;
                }
                else 
                    return result;
            }
            else
                result = "Storm System is operating at full capacity"
                       + "\nUnable to add any more storms to the system";
        }
        else if (typeCheck(typeIn)==2)
        {
            if(storms.size()<20)
            {
                if(alreadyExists(nameIn))
                {
                    Tornado tornado = new Tornado(nameIn, windIn, tempIn);
                    storms.add(tornado);
                    result = "Tornado Added";
                    return result;
                }
                else 
                    return result;
            }
            else
                result = "Storm System is operating at full capacity"
                       + "\nUnable to add any more storms to the system";
        }
        else if (typeCheck(typeIn)==3)
        {
            if(storms.size()<20)
            {
                if(alreadyExists(nameIn))
                {
                    Blizzard blizzard = new Blizzard(nameIn, windIn, tempIn);
                    storms.add(blizzard);
                    result = "Blizzard Added";
                    return result;
                }
                else 
                    return result;
            }
            else
                result = "Storm System is operating at full capacity"
                       + "\nUnable to add any more storms to the system";
        }
        return result;
    } 
    public String output(String nameIn)
    {
        String output="error";
        for (int i = 0; i < storms.size(); i++)
        {
            if(storms.get(i).stormName.equals(nameIn))
            {
                output = "\nStorm Name: "+storms.get(i).getName()
                        +"\nWind Speed: "+storms.get(i).getWindSpeed()+" mph"
                        +"\nTemperature: "+storms.get(i).getTemp()+"°"
                        +"\nClassification: "+storms.get(i).calcClass()
                        +"\n"+storms.get(i).getAdvice();
            }
        }
        return output;
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
    public String editPrintWind(String nameIn)
    {
        for (int i = 0; i < storms.size(); i++)
        {
            if(storms.get(i).stormName.equals(nameIn))
            {
                int output = storms.get(i).getWindSpeed();
                String print = Integer.toString(output);
                return print;
            }
            
        }        
        return null;
    }
    public String editPrintTemp(String nameIn)
    {
        for (int i = 0; i < storms.size(); i++)
        {
            if(storms.get(i).stormName.equals(nameIn))
            {
                int output = storms.get(i).getTemp();
                String print = Integer.toString(output);
                return print;
            }
            
        }        
        return null;
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
                        +"\nWind Speed: "+storms.get(i).getWindSpeed()+" mph"
                        +"\nTemperature: "+storms.get(i).getTemp()+"°"
                        +"\nClassification: "+storms.get(i).calcClass()
                        +"\n"+storms.get(i).getAdvice();
                return output;
            }   // do i need a else statement?????
        }
        return "Storm not found";
    }
}
