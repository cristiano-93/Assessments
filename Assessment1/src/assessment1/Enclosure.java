 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment1;

/**
 *
 * @author Cristiano
 */
public class Enclosure 
{
    //Atributes
    private int number;
    private String occupant;//is this need with if i have the dog list array?
    private int stay;
    private int price;
    public Dog[] enclosureNumber;
    
    //Constructor
    public Enclosure()
    {
        enclosureNumber = new Dog[10];
    }
    
    //Methods
    
    public boolean assignDog(Dog addDog)
    {
        for(int i=0;i<enclosureNumber.length;i++)
        {
            if(enclosureNumber[i]==null)
            {
                enclosureNumber[i]= addDog;
                return true;
            }
        }
        return false;
    }
    public boolean removeDog(Dog numberIn)
    {
        for(int i=0;i<enclosureNumber.length;i++)
        {
            if(enclosureNumber[i]!=null)//missing getters???
            {
                enclosureNumber[i]=null;
                    return true;
            }
        }
        return false;
    }
    
    
    
}
