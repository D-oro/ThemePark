package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        visitor1 = new Visitor(6, 0.9, 20.00);
        visitor2 = new Visitor(16, 1.6, 10.00);
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void noOver15sAllowed(){
        assertEquals(false, playground.isAllowedTo(visitor2));
    }

    @Test
    public void under15sAreAllowed(){
        assertEquals(true, playground.isAllowedTo(visitor1));
    }
}