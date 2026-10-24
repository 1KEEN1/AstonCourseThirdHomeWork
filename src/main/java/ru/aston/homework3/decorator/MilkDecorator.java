package ru.aston.homework3.decorator;

import java.math.BigDecimal;

public class MilkDecorator extends CoffeeDecorator {
    public static final BigDecimal MILK_COST = new BigDecimal("0.50");

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(MILK_COST);
    }
}
