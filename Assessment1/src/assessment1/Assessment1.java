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

import java.util.Scanner;

public class Assessment1 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        //Atributes
        String dogName="default";
        String dogOwner="default";
        int    dogAge=0;
        String dogGender="default";
        String dogBreed="default";
        String dogNotes="default";
        
        char choice;
        //Create Scanner class
        Scanner keyboard = new Scanner(System.in);
        
        //Objects
        Enclosure e = new Enclosure();
        Dog[] addDog=new Dog[10];
        
        for (int i = 0; i < 10; i++)
        {
            
        }
        //Menu
        do
        {
            System.out.println("Welcome to Paws&Us");
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println("[1] Register a new Dog");
            System.out.println("[2] View a Enclosure");
            System.out.println("[3] Find a dog");
            System.out.println("        Your choice[1-3]: ");
            choice = keyboard.next().charAt(0);
            System.out.println();
            if(choice=='1')
            {
                for (int i = 0; i < 10; i++)
                {
                    Scanner sc = new Scanner(System.in);
                    
                    System.out.println("Dog name: ");
                    dogName = (sc.nextLine());
                    System.out.println("Dog owner: ");
                    dogOwner = (sc.nextLine());
                    System.out.println("Dog age: ");
                    dogAge = (sc.nextInt());
                    System.out.println("Dog gender: ");
                    dogGender = (sc.nextLine());
                    System.out.println("Dog breed: ");
                    dogBreed = (sc.nextLine());
                    System.out.println("Dog care notes: ");
                    dogNotes = (sc.nextLine());
                    
                    Dog newDog = Dog(String nameIn, String ownerIn, int ageIn, String genderIn,String breedIn,String notesIn);
                    addDog[i] = newDog;
                }
                
            }
            /*System.out.println(dogName);
            System.out.println(dogOwner);
            System.out.println(dogAge);
            System.out.println(dogBreed);
            */
            //else if
            
        
        
        }while(choice == '1'|| choice == '2' || choice == '3');
        
        
    }
    
}
