package com.thisistime.designpatterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Java program to demonstrate that Enum can be used to implement Strategy * Pattern in Java. * * @author Javin
 */
public class Match {
    private static final Logger logger = LoggerFactory.getLogger(Match.class);

    public static void main(String args[]) {
        Player ctx = new Player(Strategy.T20);
        ctx.play();
        ctx.setStrategy(Strategy.ONE_DAY);
        ctx.play();
        ctx.setStrategy(Strategy.TEST);
        ctx.play();
    }
}

