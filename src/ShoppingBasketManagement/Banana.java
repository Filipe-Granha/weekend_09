package ShoppingBasketManagement;

import Behaviours.Buyable;

public class Banana extends Items implements Buyable {



    public Banana(String name) { // constructor
        super(name);
    }

    public int price() {
        return 10;
    }

    public boolean twoForOne() {
        return false;
    }
}
