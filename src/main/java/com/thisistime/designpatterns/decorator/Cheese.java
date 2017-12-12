package com.thisistime.designpatterns.decorator;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", with Cheese (20.72)";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20.72;
    }
}
