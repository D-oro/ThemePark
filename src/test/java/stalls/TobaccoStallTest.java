package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        visitor1 = new Visitor(17, 1.7, 15.00);
        visitor2 = new Visitor(21, 1.8, 20.00);
        tobaccoStall = new TobaccoStall(2, "Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void noUnder18sAllowed(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void over18sAreAllowed(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }
}
