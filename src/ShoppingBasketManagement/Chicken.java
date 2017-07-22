package ShoppingBasketManagement;

import Behaviours.Buyable;

public class Chicken extends Items implements Buyable {



    public Chicken(String name) { // constructor
        super(name);
    }

    public int price() {
        return 15;
    }

    public boolean twoForOne() {
        return true;
    }

}