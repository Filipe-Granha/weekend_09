package ShoppingBasketManagement;

import Behaviours.Buyable;

public class Pasta extends Items implements Buyable{


    public Pasta(String pastaName) { // constructor
        super(pastaName);
    }

    public float price() {
        return 5;
    }

    public boolean twoForOne() {
        return false;
    }

}
