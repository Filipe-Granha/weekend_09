package ShoppingBasketManagement;

import Behaviours.Buyable;

public class Banana extends Items implements Buyable {

Banana banana;

    public Banana(String name) { // constructor
        super(name);
    }

    public float price() {
        return 10;
    }

    public boolean twoForOne() {
        return false;
    }

}

