package ShoppingBasketManagement;

import Behaviours.Buyable;

public class Pasta extends Items implements Buyable{



    Pasta pasta;


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


//    public int applyTwoForOne() {
//        if (!pasta.twoForOne()) {
//            return 1;
//        }
//        return 2;
//    }
