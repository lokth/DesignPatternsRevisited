package com.thisistime.designpatterns.decorator;

public class Chicken extends PizzaDecorator {


    public Chicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc(){
        return super.getDesc()+", with Chicken (12.75)";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+12.75;
    }
}
