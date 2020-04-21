/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment1v2;

/**
 *
 * @author Cristiano
 */
public class Company 
{
    
    
    private Enclosure[] array;
    
    public Company()
            {
                array = new Enclosure[10];
                for(int i=0;i<array.length;i++)
                {
                    array[i]= new Enclosure(i,3.50);
                }
            }
    public boolean addDog(Dog dogIn)
    {
        for( int i = 0; i <array.length; i++)
        {
            if(array[i]==null)
            {
                array[i].assignDog(dogIn);
                return true;
            }
        }
        return false;
    }
    public boolean removeDog(int enclosureNumber)// test after assigning a dog
    {
        for( int i = 0; i < array.length; i++)
        {
            if(array[i].getDog()!=null)
            {
                if(array[i].getEnclosureNumber()==enclosureNumber)
                {
                    array[i] = null;
                    return true;
                }
                                
            }
        }
        return false;
    }
    public Dog viewDog(int enclosureNumber)// give it a  test
    {
        for( int i = 0; i < array.length; i++)
        {
            if(array[i]!=null)
            {
                if(array[i].getEnclosureNumber()==enclosureNumber)
                {
                    return array[i].getDog();
                }
            }
        }
        return null;
    }
    
    
    
    
}
