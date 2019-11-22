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
public class Enclosure 
{
    private int enclosureNumber;
    private String occupant;//is this need with if i have the dog list array?
    private int stay;
    private double price;
    private Dog assignedDog;//change name
    
    //constructor
    public Enclosure(int enclosureNumberIn, double priceIn)
    {
        enclosureNumber = enclosureNumberIn;
        price = priceIn;
    }
    
    public Dog getDog()
    {
        return assignedDog;
    }
    public void assignDog (Dog dogIn)
    {
        dogIn = assignedDog;
    }

    public int getEnclosureNumber() {
        return enclosureNumber;
    }

    public void setEnclosureNumber(int enclosureNumber) {
        this.enclosureNumber = enclosureNumber;
    }

    public String getOccupant() {
        return occupant;
    }

    public void setOccupant(String occupant) {
        this.occupant = occupant;
    }

    public int getStay() {
        return stay;
    }

    public void setStay(int stay) {
        this.stay = stay;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Dog getAssignedDog() {
        return assignedDog;
    }

    public void setAssignedDog(Dog assignedDog) {
        this.assignedDog = assignedDog;
    }
    
    
}
    