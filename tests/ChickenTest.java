import ShoppingBasketManagement.Chicken;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {


    private Chicken chicken;

    @Before
    public void setUp() throws Exception {
        chicken = new Chicken("Pollito");
    }

    @Test
    public void testGetName() {
        assertEquals("Pollito", chicken.getName());
    }

    @Test
    public void testPrice() {
        assertEquals(15, chicken.price());
    }
}







//    @Test
//    public void testTwoForOne() {
//        assertEquals(2, chicken.applyTwoForOne());
//    }



