package com.driver;

public class Pizza {

    public int price;
    public Boolean isVeg;
    public String bill;

    public int cheese;

    public int base;
    public int topping;
    public int bag;

    public int totalPrice;

    public boolean extraCheese;
    public boolean extraToppings;
    public boolean takeaway;
    boolean billGenerated;


    public Pizza(Boolean isVeg){
        if(isVeg) {
            base = 300;
            topping = 70;
        }
        else {
            base = 400;
            topping = 120;
        }
        cheese = 80;
        bag = 20;

        totalPrice = base;

        extraToppings = false;
        extraCheese = false;
        takeaway = false;

        bill = "Base Price Of The Pizza: " + base + "\n";
    }

    public int getPrice(){
        return totalPrice;
    }

    public void setPrice(int price) {
        totalPrice += price;
    }

    public void addExtraCheese(){
        if(!extraCheese) {
            extraCheese = true;
            setPrice(cheese);
        }
    }

    public void addExtraToppings(){
        if(!extraToppings) {
            extraToppings = true;
            setPrice(topping);
        }
    }

    public void addTakeaway(){
        if(!takeaway) {
            takeaway = true;
            setPrice(bag);
        }
    }

    public String getBill(){
        if(!billGenerated) {
            billGenerated = true;

            if(extraCheese) {
                bill += "Extra Cheese Added: " + cheese + "\n";
            }
            if(extraToppings) {
                bill += "Extra Toppings Added: " + topping + "\n";
            }
            if(takeaway) {
                bill += "Paperbag Added: " + bag + "\n";
            }
            bill += "Total Price: " + totalPrice + "\n";
        }

        return bill;
    }
}
