
package ICE_TASK_4;

/*
 * Assignment Name: ICE TASK 4 - Demonstrating Inheritance
 * 
 * The DinnerParty class is a subclass of the Party class.
 * It extends the functionality of the Party class by adding a dinner menu.
 * The DinnerParty class demonstrates how subclassing can be used to create
 * more specific versions of a general class.
 */

public class DinnerParty extends Party 
{
    // Additional data field for the dinner menu
    private String dinnerMenu;

    // Method to set the dinner menu
    public void setDinnerMenu(String menu) 
    {
        dinnerMenu = menu;
    }

    // Method to get the dinner menu
    public String getDinnerMenu() 
    {
        return dinnerMenu;
    }

    // Overriding the displayPartyDetails method to include dinner menu details
    @Override
    public void displayPartyDetails() 
    {
        super.displayPartyDetails(); // Call the parent class method
        System.out.println("Dinner menu: " + dinnerMenu);
    }
}
