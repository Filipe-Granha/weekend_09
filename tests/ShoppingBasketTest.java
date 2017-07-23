import Behaviours.Buyable;
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

    @Test
    public void testNoTwoForOne() {
        basket.addsAndDecidesTwoForOne(banana);
        assertEquals(1, basket.itemsCount());
    }

    @Test
    public void testTwoForOne() {
        basket.addsAndDecidesTwoForOne(chicken);
        assertEquals(2, basket.itemsCount());
    }


    @Test
    public void testCanAddDifferentItemsToBasket() {
        basket.addsAndDecidesTwoForOne(banana);
        basket.addsAndDecidesTwoForOne(chicken);
        basket.addsAndDecidesTwoForOne(chicken);
        assertEquals(5, basket.itemsCount());
    }



    @Test
    public void testCanRemoveItemByIndex(){
        basket.addsAndDecidesTwoForOne(banana);
        basket.addsAndDecidesTwoForOne(chicken);
        Buyable item = basket.removeItemByIndex();
        assertEquals(15, item.price());
    }

    @Test
    public void testCanRemoveAllItems() {
        basket.addsAndDecidesTwoForOne(pasta);
        basket.addsAndDecidesTwoForOne(chicken);
        basket.addsAndDecidesTwoForOne(banana);
        basket.removeAllItems();
        assertEquals(0, basket.itemsCount());
    }

    @Test
    public void testCanCalculateTotalValue() {
        basket.addsAndDecidesTwoForOne(pasta);
        assertEquals(5, basket.calculateTotalValue());
    }



}