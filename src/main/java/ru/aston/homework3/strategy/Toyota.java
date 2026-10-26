package ru.aston.homework3.strategy;

public class Toyota extends Car {
    public Toyota() {
        super(new Fill92Strategy());
    }
}
