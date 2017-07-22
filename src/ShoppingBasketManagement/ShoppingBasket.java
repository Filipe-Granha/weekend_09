package ShoppingBasketManagement;

import Behaviours.Buyable;

import java.util.ArrayList;



public class ShoppingBasket {

    private ArrayList<Buyable> basket;



    public ShoppingBasket() {
        this.basket = new ArrayList<Buyable>();
    }


    public int itemsCount() {
        return this.basket.size();
    }


}
