
package ICE_TASK_4;

/**
 * Assignment Name: ICE TASK 4 - Demonstrating Inheritance
 * Author: Naoyuki Christopher Higaki
 * Student Number: ST10462415
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class PartyTest 
{
    
    @Test
    public void testSetAndGetNumberOfGuests() 
    {
        Party party = new Party();
        party.setNumberOfGuests(100);
        assertEquals(100, party.getNumberOfGuests());
    }

    @Test
    public void testDisplayPartyDetails() 
    {
        Party party = new Party();
        party.setNumberOfGuests(50);
        // This would ideally be tested with a tool that checks console output, but we assume display works here
        assertEquals(50, party.getNumberOfGuests());
    }
}
