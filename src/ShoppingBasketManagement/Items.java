package ShoppingBasketManagement;

public abstract class Items {

    private String name;



    public Items(String itemName) { // constructor
        this.name = itemName;
    }

    public String getName() {
        return name;
    }

}
