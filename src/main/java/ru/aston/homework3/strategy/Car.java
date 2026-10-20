package ru.aston.homework3.strategy;

public abstract class Car {
    private FillStrategy fillStrategy;

    protected Car(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void fill() {
        fillStrategy.fill();
    }

    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void gas() {
        System.out.println("Car is moving.");
    }

    public void brake() {
        System.out.println("Car is braking.");
    }
}