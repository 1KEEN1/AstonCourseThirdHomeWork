package ru.aston.homework3.strategypattern;

public class Toyota extends Car {
    public Toyota() {
        super(new Fill92Strategy());
    }
}
