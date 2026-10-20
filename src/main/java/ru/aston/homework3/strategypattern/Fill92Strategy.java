package ru.aston.homework3.strategypattern;

public class Fill92Strategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Filling 92 gasoline...");
    }
}
