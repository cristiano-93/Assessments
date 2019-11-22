/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment1v2;

import java.util.Scanner;

/**
 *
 * @author Cristiano
 */
public class Assessment1v2 
{
    public static void main(String[] args) 
    {
       
        char choice;
        Dog[] enclosureNumber = new Dog[10];
        
        //Create Scanner class
        Scanner keyboard = new Scanner(System.in);
        
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
                
                for (int i = 0; i < 10; i++)//problem here as code keeps running due to i<10. must check if there is a empty space first
                {
                    Scanner sc = new Scanner(System.in);
                    
                    Dog newDog = new Dog();
                    
                    System.out.println("Dog name: ");
                    newDog.setName(sc.nextLine());
                    System.out.println("Dog owner: ");
                    newDog.setOwner(sc.nextLine());
                    System.out.println("Dog age: ");
                    newDog.setAge(sc.nextInt());
                    System.out.println("Dog gender: ");
                    newDog.setGender(sc.nextLine());
                    System.out.println("Dog breed: ");
                    newDog.setBreed(sc.nextLine());
                    System.out.println("Dog care notes: ");
                    newDog.setNotes(sc.nextLine());
                    enclosureNumber[i]=newDog;                   
                }
                
            }
            else if(choice =='2')
                    {
                        for (int i = 0; i < 10; i++)
                        {
                             System.out.println(i);
                        }
                    }
            System.out.println();
            
            //else if
            
        
        
        }while(choice == '1'|| choice == '2' || choice == '3');
        
    }
    
}
