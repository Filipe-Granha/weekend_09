import ShoppingBasketManagement.*;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class ShoppingBasketTest {

    ShoppingBasket basket;
    Banana banana;
    Chicken chicken;
    Pasta pasta;



    @Before
    public void setup() {
        basket = new ShoppingBasket();
        banana = new Banana("banana_teste");
        chicken = new Chicken("chicken_teste");
        pasta = new Pasta("pasta_teste");
    }


    @Test
    public void testBasketIsEmpty() {
        assertEquals(0, basket.itemsCount());
    }
}