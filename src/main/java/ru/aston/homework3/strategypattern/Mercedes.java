package ru.aston.homework3.strategypattern;

public class Mercedes extends Car {
    public Mercedes() {
        super(new Fill98Strategy());
    }
}
