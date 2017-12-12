package com.thisistime.designpatterns.decorator;

public class RomaTomatoes extends PizzaDecorator {

    public RomaTomatoes(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc(){
        return super.getDesc()+", with Roma Tomatoes (5.20)";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.20;
    }
}
