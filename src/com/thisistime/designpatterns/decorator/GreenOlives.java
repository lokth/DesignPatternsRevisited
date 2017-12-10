package com.thisistime.designpatterns.decorator;

public class GreenOlives extends PizzaDecorator {

    public GreenOlives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc(){
        return super.getDesc()+", with GreenOlives (5.47)";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+5.47;
    }

}
