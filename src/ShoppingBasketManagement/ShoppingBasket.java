package ShoppingBasketManagement;

import Behaviours.Buyable;

import java.util.ArrayList;



public class ShoppingBasket {

    private ArrayList<Buyable> basket;


    public ShoppingBasket() {
        this.basket = new ArrayList<Buyable>();
    }


    public int itemsCount() {
        return this.basket.size();
    }


    public void decidesTwoForOne(Buyable item) {


            if(item.twoForOne() == true){
                this.basket.add(item);
            }
            this.basket.add(item);
        }
    }
//
//    public void noTwoForOne(Buyable item) {
//        this.basket.add(item);
//    }
//
//
//    public void getsTwoForOne(Buyable item) {
//        this.basket.add(item);
//        this.basket.add(item);
//    }










//    public int addsTwoForOne() {
//        int count = 0;
//        for(Buyable item : this.basket) {
//            count += item.applyTwoForOne();
//        }
//        return count;
//    }


