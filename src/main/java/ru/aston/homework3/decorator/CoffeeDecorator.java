package ru.aston.homework3.decorator;

import java.math.BigDecimal;

public abstract class CoffeeDecorator implements Coffee {
    private final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public BigDecimal getCost() {
        return decoratedCoffee.getCost();
    }
}
