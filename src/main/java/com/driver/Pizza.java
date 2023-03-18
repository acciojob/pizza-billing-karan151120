package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean extraCheese;
    boolean extraToppings;
    boolean takeaway;
    boolean billGenerated;


    public Pizza(Boolean isVeg){
        if(isVeg) setPrice(300);
        else setPrice(400);

        this.isVeg = isVeg;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price) {
        this.price = this.price + price;
    }

    public void addExtraCheese(){
        if(!extraCheese) {
            extraCheese = true;
            setPrice(80);
        }
    }

    public void addExtraToppings(){
        if(!extraToppings) {
            extraToppings = true;
            if(isVeg) setPrice(70);
            else setPrice(120);
        }
    }

    public void addTakeaway(){
        if(!takeaway) {
            takeaway = true;
            setPrice(20);
        }
    }

    public String getBill(){
        String ans = "";
        if(!billGenerated) {
            billGenerated = true;

            if(this.isVeg) {
                ans += "Base Price Of The Pizza: " + 300 + "\n";
            }
            else{
                ans += "Base Price Of The Pizza: " + 400 + "\n";
            }
            if(extraCheese) {
                ans += "Extra Cheese Added: " + 80 + "\n";
            }
            if(extraToppings) {
                if(this.isVeg) {
                    ans += "Extra Toppings Added: " + 70 + "\n";
                }
                else {
                    ans += "Extra Toppings Added: " + 120 + "\n";
                }
            }
            if(takeaway) {
                ans += "Paperbag Added: " + 20 + "\n";
            }
            ans += "Total Price: " + this.price;
            return ans;
        }

        return this.bill;
    }
}
