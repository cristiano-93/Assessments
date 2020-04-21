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
public class Dog 
{
    //Atributes
    private String name;
    private String owner;
    private int age;
    private String gender;
    private String breed;
    private String notes;
    
    //Constructor
    public Dog(String nameIn, String ownerIn, int ageIn, String genderIn,String breedIn,String notesIn)
    {
        name = nameIn;
        owner = ownerIn;
        age = ageIn;
        gender = genderIn;
        breed = breedIn;
        notes = notesIn;
        //double check if something is missing
               
    }
    //getters

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    public String getNotes() {
        return notes;
    }
    
    
}
