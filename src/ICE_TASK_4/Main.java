
package ICE_TASK_4;

/*
 * Assignment Name: ICE TASK 4 - Demonstrating Inheritance
 * Author: Naoyuki Christopher Higaki
 * Student Number: ST10462415
 * 
 * The Main class is responsible for demonstrating the usage of the Party and
 * DinnerParty classes. It creates objects of both classes and showcases how
 * inheritance allows the DinnerParty class to extend and specialize the 
 * behavior of the Party class.
 */

public class Main 
{
    public static void main(String[] args) 
    {
        // Create a Party object and demonstrate its usage
        Party myParty = new Party();
        myParty.setNumberOfGuests(50);
        myParty.displayPartyDetails();

        // Create a DinnerParty object and demonstrate its usage
        DinnerParty myDinnerParty = new DinnerParty();
        myDinnerParty.setNumberOfGuests(25);
        myDinnerParty.setDinnerMenu("Italian Cuisine");
        myDinnerParty.displayPartyDetails();
    }
}
