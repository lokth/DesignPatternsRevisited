package com.thisistime.designpatterns.decorator;

public class Spinach extends PizzaDecorator {


    public Spinach(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", with Spinach (7.92)";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 7.92;
    }
}
