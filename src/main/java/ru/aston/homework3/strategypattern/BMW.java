package ru.aston.homework3.strategypattern;

public class BMW extends Car {
    public BMW() {
        super(new Fill95Strategy());
    }
}
