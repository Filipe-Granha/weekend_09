package ShoppingBasketManagement;

import Behaviours.Buyable;

public class Pasta extends Items implements Buyable{


    public Pasta(String name) { // constructor
        super(name);
    }

    public int price() {
        return 5;
    }

    public boolean twoForOne() {
        return false;
    }
}
