package ru.aston.homework3.strategy;

public class Mercedes extends Car {
    public Mercedes() {
        super(new Fill98Strategy());
    }
}
