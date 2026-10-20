package ru.aston.homework3.strategy;

public class BMW extends Car {
    public BMW() {
        super(new Fill95Strategy());
    }
}
