package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(6, 1.2, 20.00);
        visitor2 = new Visitor(14, 1.6, 10.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void chargesHalfToUnder12s(){
        assertEquals(2.25, dodgems.priceFor(visitor1), 1e-8);
    }

    @Test
    public void chargesFullToOver12s(){
        assertEquals(4.5, dodgems.priceFor(visitor2), 1e-8);
    }
}
