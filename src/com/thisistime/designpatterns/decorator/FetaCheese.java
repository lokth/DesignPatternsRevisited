package com.thisistime.designpatterns.decorator;

public class FetaCheese extends PizzaDecorator {

    public FetaCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesc(){
        return super.getDesc()+", with FetaCheese (25.88)";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+25.88;
    }
}
