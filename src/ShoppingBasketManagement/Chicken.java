package ShoppingBasketManagement;

import Behaviours.Buyable;

public class Chicken extends Items implements Buyable {


Chicken chicken;

    public Chicken(String name) { // constructor
        super(name);
    }

    public float price() {
        return 15;
    }

    public boolean twoForOne() {
        return true;
    }

}
