package ShoppingBasketManagement;

import ShoppingBasketManagement.Banana;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BananaTest {


    private Banana banana;


    @Before
    public void setUp() throws Exception {
        banana = new Banana("bananita");
        //protected is not accessible outside package Animals
        //dog.age
    }

    @Test
    public void testGetName() {
        String name = banana.getName();
        assertEquals("bananita", name);
    }

}