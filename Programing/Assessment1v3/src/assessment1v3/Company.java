package assessment1v3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristiano
 */
public class Company 
{
    private int enclosures;
    private double price=5.00;
    char choice=1;
    Scanner keyboard = new Scanner(System.in);
    
    //Menu
    System.out.println("Welcome to Paws&Us");
    System.out.println();
    System.out.println("What do you want to do?");
    System.out.println("[1] Register a new Dog");
    System.out.println("[2] View a Enclosure");
    System.out.println("[3] Clear a Enclosure");//worry about better menu options once system works
    System.out.println("[0] Exit Programm");
    System.out.println("        Your choice[0-3]: ");
    choice = keyboard.next().charAt(0);
    System.out.println();
            
        
}