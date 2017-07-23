package ShoppingBasketManagement;

import Behaviours.Buyable;

public class Pasta extends Items implements Buyable{



    Pasta pasta;


    public Pasta(String name) { // constructor
        super(name);
    }

    public float price() {
        return 5;
    }

    public boolean twoForOne() {
        return false;
    }

}
