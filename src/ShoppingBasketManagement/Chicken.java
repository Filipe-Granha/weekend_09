package ShoppingBasketManagement;

import Behaviours.Buyable;

public class Chicken extends Items implements Buyable {


    public Chicken(String chickenName) { // constructor
        super(chickenName);
    }

    public float price() {
        return 15;
    }

    public boolean twoForOne() {
        return true;
    }

}
