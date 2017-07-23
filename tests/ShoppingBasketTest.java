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
        basket = new ShoppingBasket(true);
        banana = new Banana("banana_test");
        chicken = new Chicken("chicken_test");
        pasta = new Pasta("pasta_test");
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
        assertEquals(15, item.price(), 0.0);
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
    public void testCanCalculateTotalValueBeforeDiscounts() {
        basket.addsAndDecidesTwoForOne(chicken);
        basket.addsAndDecidesTwoForOne(pasta);
        basket.addsAndDecidesTwoForOne(chicken);
        basket.addsAndDecidesTwoForOne(pasta);
        basket.addsAndDecidesTwoForOne(banana);
        assertEquals(50, basket.calculateTotalValueBeforePriceDiscounts(), 0.0);
    }

    @Test
    public void testCanCalculateTotalValueWithMoreThan20PoundsDiscount() {
        basket.addsAndDecidesTwoForOne(chicken);
        basket.addsAndDecidesTwoForOne(pasta);
        basket.addsAndDecidesTwoForOne(banana);
        assertEquals(27, basket.calculateTotalValueWithMoreThan20PoundsDiscount(), 0.0);
    }

    @Test
    public void testCanUseLoyaltyCardForFinalDiscount() {
        basket.addsAndDecidesTwoForOne(chicken);
        basket.addsAndDecidesTwoForOne(pasta);
        basket.addsAndDecidesTwoForOne(banana);
        assertEquals(26.46, basket.useLoyaltyCardForFinalDiscount());
    }



}