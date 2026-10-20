package ru.aston.homework3.strategypattern;

public class Fill98Strategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Filling 98 gasoline...");
    }
}
