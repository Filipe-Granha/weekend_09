import ShoppingBasketManagement.Banana;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BananaTest {


    private Banana banana;


    @Before
    public void setUp() throws Exception {
        banana = new Banana("bananita");
    }

    @Test
    public void testGetName() {
        String name = banana.getName();
        assertEquals("bananita", name);
    }


    @Test
    public void testPrice() {
       assertEquals(10, banana.price(), 0.0);
    }
}






//    @Test
//    public void testTwoForOne() {
//        assertEquals(1, banana.applyTwoForOne());
//    }

