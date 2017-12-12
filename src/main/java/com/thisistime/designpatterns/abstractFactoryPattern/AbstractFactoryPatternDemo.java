package com.thisistime.designpatterns.abstractFactoryPattern;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        // get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // get an object of Color Red
        Color color1 = colorFactory.getColor("RED");

        // call fill method of Red
        color1.fill();

        // get an object of Color Green
        Color color2 = colorFactory.getColor("Green");

        // call fill method of Green
        color2.fill();

        // get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");

        // call fill method of Color Blue
        color3.fill();
    }

}
