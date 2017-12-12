package com.thisistime.designpatterns.decorator;

public class Broccoli extends PizzaDecorator {

    public Broccoli(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc(){
        return super.getDesc()+", with Broccoli (9.25)";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+9.25;
    }
}
