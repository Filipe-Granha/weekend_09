package ShoppingBasketManagement;

import Behaviours.Buyable;

public class Banana extends Items implements Buyable {


    public Banana(String bananaName) { // constructor
        super(bananaName);
    }

    public float price() {
        return 10;
    }

    public boolean twoForOne() {
        return false;
    }

}

