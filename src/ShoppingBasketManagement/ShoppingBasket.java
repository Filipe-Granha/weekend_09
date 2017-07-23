package ShoppingBasketManagement;

import Behaviours.Buyable;

import java.math.BigDecimal;
import java.util.ArrayList;



public class ShoppingBasket {

    private ArrayList<Buyable> basket;
    private boolean loyaltyCard;


    public ShoppingBasket(boolean loyaltyCard) {
        this.basket = new ArrayList<Buyable>();
        this.loyaltyCard = loyaltyCard;
    }


    public int itemsCount() {
        return this.basket.size();
    }


    public void addsAndDecidesTwoForOne(Buyable item) {

            if(item.twoForOne() == true){
                this.basket.add(item);
                this.basket.add(item);
            }
          else this.basket.add(item);  //word else has to be there
        }


    public Buyable removeItemByIndex(){
        if(itemsCount() > 0){
            return basket.remove(2);
        }
        return null;
    }


    public void removeAllItems() {
        this.basket.clear();
    }


    public float calculateTotalValueBeforePriceDiscounts() {
        float total = 0;
        for(Buyable item : this.basket) {
            if(item.twoForOne() == false) {
               total += item.price();
            }
            else total += item.price()/2; // word 'else' has to be there
        }
        return total;
    }


    public float calculateTotalValueWithMoreThan20PoundsDiscount() {
        float count = 0;
        float total = calculateTotalValueBeforePriceDiscounts();
        if(total > 20.0) {
            count +=  total - total*0.1;
        }
        else count = total;
        return count;
    }


    public BigDecimal useLoyaltyCardForFinalDiscount() {
        float count = 0;
        float total = calculateTotalValueWithMoreThan20PoundsDiscount();
        if(this.loyaltyCard == true) {
            count += total - total*0.02;
        }
        else count = total;
        BigDecimal value = new BigDecimal(count); //doesn't correct the decimal cases issue I was expecting
        return value;
    }

}










