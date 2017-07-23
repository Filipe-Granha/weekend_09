package ShoppingBasketManagement;

import Behaviours.Buyable;

public class Banana extends Items implements Buyable {

Banana banana;

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


//    public int applyTwoForOne() {
//        if (!banana.twoForOne()) {
//            return 1;
//        }
//        return 2;
//    }
