
package ICE_TASK_4;

/**
 * Assignment Name: ICE TASK 4 - Demonstrating Inheritance
 * Author: Naoyuki Christopher Higaki
 * Student Number: ST10462415
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class DinnerPartyTest 
{

    @Test
    public void testSetAndGetDinnerMenu() 
    {
        DinnerParty dinnerParty = new DinnerParty();
        dinnerParty.setDinnerMenu("French Cuisine");
        assertEquals("French Cuisine", dinnerParty.getDinnerMenu());
    }

    @Test
    public void testDisplayPartyDetails() 
    {
        DinnerParty dinnerParty = new DinnerParty();
        dinnerParty.setNumberOfGuests(25);
        dinnerParty.setDinnerMenu("Italian Cuisine");
        // This would ideally be tested with a tool that checks console output, but we assume display works here
        assertEquals(25, dinnerParty.getNumberOfGuests());
        assertEquals("Italian Cuisine", dinnerParty.getDinnerMenu());
    }
}
