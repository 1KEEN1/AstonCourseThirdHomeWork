package ru.aston.homework3.decorator;

import java.math.BigDecimal;

public class SimpleCoffee implements Coffee {
    public static final BigDecimal COFFEE_COST = new BigDecimal("3.00");

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public BigDecimal getCost() {
        return COFFEE_COST;
    }
}
