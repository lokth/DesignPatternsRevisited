package com.thisistime.designpatterns.strategy;

/* * Player class, which uses different Strategy implementation. */
class Player {
    private Strategy battingStrategy;

    public Player(Strategy battingStrategy) {
        this.battingStrategy = battingStrategy;
    }

    public void setStrategy(Strategy newStrategy) {
        this.battingStrategy = newStrategy;
    }

    public void play() {
        battingStrategy.play();
    }
}
