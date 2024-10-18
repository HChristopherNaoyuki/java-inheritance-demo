
package ICE_TASK_4;

/*
 * Assignment Name: ICE TASK 4 - Demonstrating Inheritance
 * 
 * This code demonstrates the concept of inheritance in Java.
 * The task is divided into four stages:
 * 1. Create a general Party class with one data field and three methods.
 * 2. Develop an application that uses the Party class.
 * 3. Create a DinnerParty subclass that inherits from the Party class.
 * 4. Modify the application to also use the DinnerParty class.
 * 
 * The Party class represents a general event with basic properties and behaviors.
 * The DinnerParty subclass extends the Party class, adding more specific features
 * for a dinner party.
 */

public class Party 
{
    // Data field for the number of guests
    private int numberOfGuests;

    // Method to set the number of guests
    public void setNumberOfGuests(int guests) 
    {
        numberOfGuests = guests;
    }

    // Method to get the number of guests
    public int getNumberOfGuests() 
    {
        return numberOfGuests;
    }

    // Method to display party details
    public void displayPartyDetails() 
    {
        System.out.println("Party with " + numberOfGuests + " guests.");
    }
}
