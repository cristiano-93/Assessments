/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment1;
import java.util.Scanner;
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
    
    //Method
    public void addDog()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dog name: ");
        name = (sc.nextLine());
        System.out.println("Dog owner: ");
        owner = (sc.nextLine());
        System.out.println("Dog age: ");
        age = (sc.nextInt());
        System.out.println("Dog gender: ");
        gender = (sc.nextLine());
        System.out.println("Dog breed: ");
        breed = (sc.nextLine());
        System.out.println("Dog care notes: ");
        notes = (sc.nextLine());
    }
    //setters

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getOwner() 
    {
        return owner;
    }

    public void setOwner(String owner) 
    {
        this.owner = owner;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getBreed() 
    {
        return breed;
    }

    public void setBreed(String breed) 
    {
        this.breed = breed;
    }

    public String getNotes() 
    {
        return notes;
    }

    public void setNotes(String notes) 
    {
        this.notes = notes;
    }
    
}
