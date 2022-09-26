package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        visitor1 = new Visitor(29, 1.3, 50.00);
        visitor2 = new Visitor(11, 2.1, 30.00);
        visitor3 = new Visitor(14, 1.5, 10.00);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void chargesFullToSmallPeople(){
        assertEquals(8.5, rollerCoaster.priceFor(visitor1), 1e-8);
    }

    @Test
    public void chargesDoubleToTallPeople(){
        assertEquals(17.00, rollerCoaster.priceFor(visitor2), 1e-8);
    }

    @Test
    public void smallPeopleNotAllowed(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void youngPeopleNotAllowed(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void oldTallPeopleAllowed(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor3));
    }
}
