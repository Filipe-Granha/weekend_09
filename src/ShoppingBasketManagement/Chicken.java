package ShoppingBasketManagement;

import Behaviours.Buyable;

public class Chicken extends Items implements Buyable {


Chicken chicken;

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



//    public int applyTwoForOne() {
//        if (!chicken.twoForOne()) {
//            return 1;
//        }
//        return 2;
//    }