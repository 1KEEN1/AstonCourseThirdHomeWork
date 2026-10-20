package ru.aston.homework3.strategy;

public class Fill95Strategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Filling 95 gasoline...");
    }
}
