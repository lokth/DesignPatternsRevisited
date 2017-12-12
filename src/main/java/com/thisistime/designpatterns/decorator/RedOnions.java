package com.thisistime.designpatterns.decorator;

public class RedOnions extends PizzaDecorator {

    public RedOnions(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", with Red Onions (3.75)";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3.75;
    }
}
