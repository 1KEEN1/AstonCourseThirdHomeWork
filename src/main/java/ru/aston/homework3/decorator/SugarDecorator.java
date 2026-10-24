package ru.aston.homework3.decorator;

import java.math.BigDecimal;

public class SugarDecorator extends CoffeeDecorator {
    public static final BigDecimal SUGAR_COST = new BigDecimal("0.15");

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(SUGAR_COST);
    }
}
