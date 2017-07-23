import ShoppingBasketManagement.Pasta;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PastaTest {


    private Pasta pasta;

    @Before
    public void setUp() throws Exception {
        pasta = new Pasta("Barilla");
    }

    @Test
    public void testGetName() {
        assertEquals("Barilla", pasta.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(5.00, pasta.price(), 0.0);
    }

}

