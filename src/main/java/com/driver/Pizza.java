package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public boolean takeaway = false;
    public boolean toppings = false;
    public boolean cheese = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // if pizza is veg then add 300 to price
        // otherwise add non veg price 400 to the price
        if(isVeg == true) {
            this.price = 300;
            //System.out.println("Base Price Of The Pizza: 300");
        }
        else {
            this.price = 400;
            //System.out.println("Base Price Of The Pizza: 400");
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price) {
        this.price = this.price + price;
    }

    public void addExtraCheese(){
        //add extraCheese price to the price
        if(!cheese)
        this.price = this.price + 80;

        cheese = true;
    }

    public void addExtraToppings(){
        if(!toppings) {
            // add extraTopping price to the price
            //if pizza is veg
            if(isVeg)
                this.price = this.price + 70;
                //otherwise adding non veg topping price
            else {
                this.price = this.price + 120;
            }
        }

        toppings = true;
    }

    public void addTakeaway(){
        // adding paperBag charges to the total prices
        if(!takeaway)
        this.price = this.price + 20;

        takeaway = true;
    }

    public String getBill(){
        // your code goes here
        String ans = "";
        if(isVeg) {
            ans += "Base Price Of The Pizza: 300\n";
        }
        else {
            ans += "Base Price Of The Pizza: 400\n";
        }

        if(cheese) {
            ans += "Extra Cheese Added: 80\n";
        }

        if(toppings) {
            if(isVeg) {
                ans += "Extra Toppings Added: 70\n";
            }
            else {
                ans += "Extra Toppings Added: 120\n";
            }
        }

        if(takeaway) {
            ans += "Paperbag Added: 20\n";
        }
        this.bill = "" + this.price;
        ans += this.bill;
        return ans;
        //return this.bill;
    }
}
